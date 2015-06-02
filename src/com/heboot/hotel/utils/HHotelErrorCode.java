package com.heboot.hotel.utils;
/**
 * 错误码
 * @author Hebo
 */
public enum HHotelErrorCode {

	STATUS_1001(1001,"手机号码被占用"),
	STATUS_1002(1002,"用户不存在"),
	STATUS_1003(1003,"登录失败"),
	STATUS_1004(1004,"密码错误"),
	STATUS_1005(1005,"添加酒店失败"),
	STATUS_2000(2000,"操作成功"),
	STATUS_5000(5000,"服务器异常");
	
	private int code;
	private String describe;
	
	private HHotelErrorCode(int code,String describe){
		this.code = code;
		this.describe = describe;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
	
}
