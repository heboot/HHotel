package com.heboot.hotel.model;

import com.jfinal.plugin.activerecord.Model;

/**
 * 酒店实体
 * @author Hebo
 */
public class User extends Model<User>{
	public static final User dao = new User();
	private int id;
	private String name;
	private String passWord;
	private int sex;
	private int age;
	private double balance;
	private String create_time;
	private String lastlogin_time;
	private int account_type;
	
}
