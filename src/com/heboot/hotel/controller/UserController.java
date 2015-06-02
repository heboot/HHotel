package com.heboot.hotel.controller;

import javax.mail.search.SentDateTerm;

import com.heboot.hotel.model.User;
import com.heboot.hotel.response.user.UserResponse;
import com.heboot.hotel.service.UserService;
import com.heboot.hotel.utils.GsonUtils;
import com.heboot.hotel.utils.HHotelErrorCode;
import com.heboot.hotel.utils.TimeUtils;
import com.jfinal.core.Controller;

public class UserController extends BaseController {

	private UserResponse response = new UserResponse();;

	/**
	 * 登录
	 */
	public void login() {
		String name = getPara("name");
		String passWord = getPara("passWord");
		int accountType = Integer.parseInt(getPara("account_type"));
		String phoneNumber = getPara("phoneNumber");
		User u = new User();
		u.setPhoneNumber(phoneNumber);
		u.setName(name);
		u.setPassWord(passWord);
		u.setAccount_type(accountType);
		try {
			/**
			 * 判断是否有这个账户
			 */
			User user = UserService.doQueryPhone(phoneNumber);
			/**
			 * 不存在
			 */
			if (user == null) {
				sendResponse(false, HHotelErrorCode.STATUS_1002.getCode(), HHotelErrorCode.STATUS_1002.getDescribe(), "", "");
				return;
			}
			/**
			 * 密码错误
			 */
			if (!UserService.doCheckUserPassWord(phoneNumber, passWord)) {
				sendResponse(false, HHotelErrorCode.STATUS_1004.getCode(), HHotelErrorCode.STATUS_1004.getDescribe(),"", "");
				return;
			}
			/**
			 * 登录失败
			 */
			if (!UserService.doLogin(u)) {
				sendResponse(false, HHotelErrorCode.STATUS_1003.getCode(), HHotelErrorCode.STATUS_1003.getDescribe(),"", "");
				return;
			}
			/**
			 * 登录成功
			 */
			sendResponse(true, HHotelErrorCode.STATUS_2000.getCode(), HHotelErrorCode.STATUS_2000.getDescribe(),GsonUtils.getGson().toJson(user), "");
			return;
		} catch (Exception e) {
			sendResponse(false, HHotelErrorCode.STATUS_5000.getCode(), HHotelErrorCode.STATUS_5000.getDescribe(),"",e.toString());
			return;
		}
	}

	/**
	 * 注册
	 */
	public void register() {
		String name = getPara("name");
		String passWord = getPara("passWord");
		int sex = Integer.parseInt(getPara("sex"));
		int age = Integer.parseInt(getPara("age"));
		String create_time = TimeUtils.getCurrentTime();
		String phoneNumber = getPara("phoneNumber");
		/**
		 * 如果电话号码被占用
		 */
		try {
			if (UserService.doQueryPhone(phoneNumber) != null) {
				response.setStatus(false);
				response.setStatusCode(HHotelErrorCode.STATUS_1001.getCode());
				response.setDescribe(HHotelErrorCode.STATUS_1001.getDescribe());
				response.setUser(null);
				renderJson(GsonUtils.getGson().toJson(response));
				return;
			}
			User u = new User();
			u.setName(name);
			u.setPassWord(passWord);
			u.setSex(sex);
			u.setAge(age);
			u.setCreate_time(create_time);
			boolean regStatus = UserService.doRegister(u);
			/**
			 * 注册成功
			 */
			if (regStatus) {
				response.setStatus(true);
				response.setStatusCode(HHotelErrorCode.STATUS_2000.getCode());
				response.setDescribe(HHotelErrorCode.STATUS_2000.getDescribe());
				response.setUser(u);
				renderJson(GsonUtils.getGson().toJson(response));
			}
		} catch (Exception e) {
			response.setStatus(false);
			response.setStatusCode(HHotelErrorCode.STATUS_5000.getCode());
			response.setDescribe(HHotelErrorCode.STATUS_5000.getDescribe());
			response.setUser(null);
			renderJson(GsonUtils.getGson().toJson(response));
			return;
		}
	}

}
