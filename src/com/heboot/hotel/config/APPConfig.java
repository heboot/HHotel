package com.heboot.hotel.config;

import com.heboot.hotel.controller.HelloController;
import com.heboot.hotel.controller.HotelController;
import com.heboot.hotel.controller.UserController;
import com.heboot.hotel.model.Hotel;
import com.heboot.hotel.model.User;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;

public class APPConfig extends JFinalConfig {
	public void configConstant(Constants me) {
		me.setDevMode(true);
	}

	public void configRoute(Routes me) {
		me.add("/hello", HelloController.class);
		me.add("/user", UserController.class);
		me.add("/hotel", HotelController.class);
	}

	public void configPlugin(Plugins me) {
		C3p0Plugin cp = new C3p0Plugin("jdbc:mysql://125.25.15.211:3306/HHotel", "root", "123@qwe0..");
		me.add(cp);
		ActiveRecordPlugin arp = new ActiveRecordPlugin(cp); 
		me.add(arp);
		arp.addMapping("tb_user", User.class);
		arp.addMapping("tb_hotel", Hotel.class);
	}

	public void configInterceptor(Interceptors me) {
	}

	public void configHandler(Handlers me) {
	}
}
