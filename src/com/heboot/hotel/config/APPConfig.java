package com.heboot.hotel.config;

import com.heboot.hotel.controller.HelloController;
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
	}

	public void configPlugin(Plugins me) {
		C3p0Plugin cp = new C3p0Plugin("jdbc:mysql://你猜", "你猜", "你猜");
		me.add(cp);
		ActiveRecordPlugin arp = new ActiveRecordPlugin(cp); 
		me.add(arp);
		arp.addMapping("tb_user", User.class);
	}

	public void configInterceptor(Interceptors me) {
	}

	public void configHandler(Handlers me) {
	}
}
