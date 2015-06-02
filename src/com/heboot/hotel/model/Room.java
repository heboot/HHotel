package com.heboot.hotel.model;

import com.jfinal.plugin.activerecord.Model;

public class Room extends Model<Room>{
	public static final Room dao = new Room();
	private int id;
	private String number;
	
}
