package com.heboot.hotel.plugin;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.util.Factory;
import org.apache.shiro.mgt.SecurityManager;
import com.jfinal.plugin.IPlugin;

public class ShiroPlugin implements IPlugin {

	@Override
	public boolean start() {
	Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
	SecurityManager securityManager = factory.getInstance();
	SecurityUtils.setSecurityManager( securityManager);
	return true;
	}
	@Override
	public boolean stop() {
	return false;
	}
}
