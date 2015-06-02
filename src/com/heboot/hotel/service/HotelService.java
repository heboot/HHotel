package com.heboot.hotel.service;

import com.heboot.hotel.model.Hotel;
import com.jfinal.plugin.activerecord.Page;

public class HotelService {

	/**
	 * 查询酒店列表
	 */
	public static Page<Hotel> doGetHotels(int pageIndex,int pageSize){
		return Hotel.dao.paginate(pageIndex, pageSize,"select *","from tb_hotel");
	}
	
	/**
	 * 添加酒店
	 */
	public static boolean doAddHotel(Hotel hotel){
		boolean status = new Hotel().set("name", hotel.getName()).set("address", hotel.getAddress()).
		set("tel", hotel.getTel()).set("contacts", hotel.getContacts()).set("describe", hotel.getDescribe()).
		set("lat", hotel.getLat()).set("lon",hotel.getLon()).save();
		return status;
	}
		
	
	/**
	 * 更新酒店信息
	 */
	public static boolean doUpdateHotel(Hotel hotel){
		boolean status = Hotel.dao.set("name", hotel.getName()).set("address", hotel.getAddress()).
				set("tel", hotel.getTel()).set("contacts", hotel.getContacts()).set("describe", hotel.getDescribe()).
				set("lat", hotel.getLat()).set("lon",hotel.getLon()).update();
		return status;
	}
	
	/**
	 * 根据ID查询酒店
	 */
	public static Hotel doGetHotelById(int id){
		return Hotel.dao.findById(id);
	}
	
	/**
	 * 根据状态查询酒店
	 */
	public static  Page<Hotel> doGetHotelsByStatus(int status,int pageIndex,int pageSize){
		return Hotel.dao.paginate(pageIndex, pageSize, "selec *", "from tb_hotel where status = ?",status);
	}
	
	
	
}
