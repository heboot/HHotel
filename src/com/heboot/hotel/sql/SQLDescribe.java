package com.heboot.hotel.sql;

public class SQLDescribe {

	/**
	 * 查询电话号码是否已经有用户使用过
	 */
	public static String queryPhoneNumber = "select count(phoneNumber) from tb_user where phoneNumber = ?";
	
	/**
	 * 根据电话号码来查询用户记录
	 */
	public static String queryUserByPhoneNumber = "select * from tb_user where phoneNumber = ?";
	
	/**
	 * 根据用户名 密码  账户类型来查询是否有这条用户记录
	 */
	public static String queryUserByNameAndPassWord = "select * from tb_user where name=? and passWord = ? and account_type = ?";
	
	/**
	 * 核对用户密码
	 */
	public static String checkUserPassWord = "select id from tb_user where phoneNumber = ? and passWord = ?";
	
}
