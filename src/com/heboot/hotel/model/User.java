package com.heboot.hotel.model;
/**
 * 酒店实体 tr
 * @author Hebo
 */
public class User {
	private int id;
	private String name;
	private String passWord;
	private int sex;
	private int age;
	private double balance;
	private String create_time;
	private String lastlogin_time;
	private int account_type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getLastlogin_time() {
		return lastlogin_time;
	}
	public void setLastlogin_time(String lastlogin_time) {
		this.lastlogin_time = lastlogin_time;
	}
	public int getAccount_type() {
		return account_type;
	}
	public void setAccount_type(int account_type) {
		this.account_type = account_type;
	}
	
}
