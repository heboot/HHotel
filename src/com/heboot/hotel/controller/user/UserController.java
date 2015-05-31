package com.heboot.hotel.controller.user;

import com.heboot.hotel.model.User;
import com.heboot.hotel.response.user.UserResponse;
import com.heboot.hotel.service.UserService;
import com.heboot.hotel.utils.GsonUtils;
import com.heboot.hotel.utils.HHotelErrorCode;
import com.heboot.hotel.utils.TimeUtils;
import com.jfinal.core.Controller;

public class UserController extends Controller{

	private UserResponse response;
	
	/**
	 * 注册
	 */
	public void register(){
		String name = getPara("name");
		String passWord = getPara("passWord");
		int sex = Integer.parseInt(getPara("sex"));
		int age = Integer.parseInt(getPara("age"));
		String create_time = TimeUtils.getCurrentTime();
		String phoneNumber = getPara("phoneNumber");
		response = new UserResponse();
		/**
		 * 如果电话号码被占用
		 */
		try {
			if(UserService.doQueryPhone(phoneNumber) > 0){
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
			if(regStatus){
				
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
