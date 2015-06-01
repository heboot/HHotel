package com.heboot.hotel.controller;

import com.heboot.hotel.model.User;
import com.heboot.hotel.service.UserService;
import com.heboot.hotel.utils.GsonUtils;
import com.heboot.hotel.utils.HHotelErrorCode;
import com.jfinal.core.Controller;

public class HelloController extends BaseController {

	public void index() {
	
		//boolean a = User.dao.set("name", "hehe").set("passWord", "123").set("account_type", 1).save();
		renderText("Hello JFinal World." );
	}
	
	public void test(){
		User user = UserService.doQueryPhone("111");
		sendResponse(true, HHotelErrorCode.STATUS_2000.getCode(), HHotelErrorCode.STATUS_2000.getDescribe(),GsonUtils.getGson().toJson(user), "");
	}

}
