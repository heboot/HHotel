package com.heboot.hotel.model;

import com.jfinal.plugin.activerecord.Model;

public class Permission extends Model<Permission>{
	public static final Permission dao = new Permission();
	private int id;
	private String name;
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


	

}
