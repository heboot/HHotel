package com.heboot.hotel.utils;

import com.google.gson.Gson;

public class GsonUtils {
	
	private static Gson gson = new Gson();
	
	public static Gson getGson(){
		if(gson == null){
			 gson = new Gson();
		}
		return gson;
	}
	
}
