package com.heboot.hotel.sql;

public class HotelSqlDescribe {
		
	/**
	 * 根据状态查询酒店
	 */
	public static final String getHotelByStatus = "select * from tb_hotel where status = ?";
	
	/**
	 * 查询酒店列表
	 */
	public static final String getHotels = "select * from tb_hotel";
	
}
