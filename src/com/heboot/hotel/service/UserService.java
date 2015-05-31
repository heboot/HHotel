package com.heboot.hotel.service;

import com.heboot.hotel.model.User;
import com.heboot.hotel.sql.SQLDescribe;
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
	public static int doQueryPhone(String phoneNumber){
		int result = Db.queryInt(SQLDescribe.queryPhoneNumber,phoneNumber);
		return result;
	}
	
	
}
