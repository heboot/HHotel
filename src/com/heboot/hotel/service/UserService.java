package com.heboot.hotel.service;

import java.sql.SQLDataException;

import com.heboot.hotel.model.User;
import com.heboot.hotel.sql.SQLDescribe;
import com.heboot.hotel.utils.TimeUtils;
import com.jfinal.plugin.activerecord.Db;

public class UserService {
	
	/**
	 * 执行注册
	 * @param user
	 * @return
	 */
	public static boolean  doRegister(User user){
		boolean status = new User().set("name", user.getName()).set("passWord", user.getPassWord()).
		set("sex", user.getSex()).set("age", user.getAge()).set("create_time", user.getCreate_time()).
		set("account_type", user.getAccount_type()).save();
		return status;
	}
	
	/**
	 * 查询电话号码是否被占用
	 * @param phoneNumber
	 * @return
	 */
	public static User doQueryPhone(String phoneNumber){
//		int result = Db.queryInt(SQLDescribe.queryPhoneNumber,phoneNumber);
		User u = User.dao.findFirst(SQLDescribe.queryUserByPhoneNumber,phoneNumber);
		return u;
	}
	
	/**
	 /*核对用户密码
	 */
	public static boolean doCheckUserPassWord(String phoneNumber,String passWord){
		return Db.queryBoolean(SQLDescribe.checkUserPassWord,phoneNumber,passWord);
	}
	
	/**
	 * 登录
	 * @param user
	 * @return
	 */
	public static boolean doLogin(User user){
		user.setLastlogin_time(TimeUtils.getCurrentTime());
		boolean result = Db.queryBoolean(SQLDescribe.queryUserByNameAndPassWord,user.getName(),user.getPassWord(),user.getAccount_type());
		return result;
	}
	
	/**
	 * 修改密码
	 */
	
	/**
	 * 上传头像
	 */
	
	
	
	
}
