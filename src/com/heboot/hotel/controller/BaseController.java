package com.heboot.hotel.controller;

import com.heboot.hotel.response.BaseResponse;
import com.heboot.hotel.utils.GsonUtils;
import com.heboot.hotel.utils.HHotelErrorCode;
import com.jfinal.core.Controller;

public class BaseController extends Controller {
	BaseResponse response = new BaseResponse();
	
	public void sendResponse(boolean status,int statusCode,String describe,String json,String errorInfo){
		response.setStatus(status);
		response.setStatusCode(statusCode);
		response.setDescribe(describe);
		response.setJson(json);
		response.setErrorInfo(errorInfo.toString());
		renderJson(GsonUtils.getGson().toJson(response));	
	}
	
}
