package com.heboot.hotel.utils;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import com.heboot.hotel.model.User;
import com.heboot.hotel.service.UserService;

public class MyRealm extends AuthorizingRealm {
  
	
	
    /** 
     * 授权信息 
     */  
    protected AuthorizationInfo doGetAuthorizationInfo(  
                PrincipalCollection principals) {  
    	  String username = (String)principals.getPrimaryPrincipal();  
          SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();  
          authorizationInfo.setRoles(UserService.doGetUserRolesByUserName(username));  
          authorizationInfo.setStringPermissions(UserService.dogetUserPermissionsByUserName(username));  
          return authorizationInfo;  
    }  
  
    /** 
     * 认证信息 
     */  
    protected AuthenticationInfo doGetAuthenticationInfo(  
                AuthenticationToken token ) throws AuthenticationException {  
    	  String username = (String)token.getPrincipal();  
          User user = UserService.doGetUserByUserName(username);  
          if(user == null) {  
              throw new UnknownAccountException();//没找到帐号  
          }  
//          if(Boolean.TRUE.equals(user.getLocked())) {  
//              throw new LockedAccountException(); //帐号锁定  
//          }  
          //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以在此判断或自定义实现  
          SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(  
                  user.getPhoneNumber(), //用户名  
                  user.getPassWord(), //密码  
                  ByteSource.Util.bytes(user.getCredentialsSalt()),//salt=username+salt  
                  getName()  //realm name  
          );  
          return authenticationInfo;  
    }  
}
