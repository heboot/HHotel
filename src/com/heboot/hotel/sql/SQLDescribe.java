package com.heboot.hotel.sql;

public class SQLDescribe {

	/**
	 * 查询电话号码是否已经有用户使用过
	 */
	public static String queryPhoneNumber = "select count(phoneNumber) from tb_user where phoneNumber = ?";
	
	
}
