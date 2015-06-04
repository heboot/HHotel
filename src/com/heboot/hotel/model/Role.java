package com.heboot.hotel.model;

import com.jfinal.plugin.activerecord.Model;

public class Role extends Model<Role>{
	public static final Role dao = new Role();
	private int id;
	private int user_id;
	private String role_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	

}
