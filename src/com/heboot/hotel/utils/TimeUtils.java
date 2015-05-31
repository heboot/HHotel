package com.heboot.hotel.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {

	public static SimpleDateFormat sdf;
	
	/**
	 * 获取当前时间
	 * 格式 yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String getCurrentTime(){
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}
	
}
