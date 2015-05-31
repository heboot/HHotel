package com.heboot.hotel.controller;

import com.heboot.hotel.model.User;
import com.jfinal.core.Controller;

public class HelloController extends Controller {

	public void index() {
	
		boolean a = User.dao.set("name", "hehe").set("passWord", "123").set("account_type", 1).save();
		renderText("Hello JFinal World." + a);
	}
	
	public void test(){
		renderText("Hello JFinal test." );
	}

}
