package com.heboot.hotel.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@Controller
public class TestController implements Controller {
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)  
    public String testLogin(HttpServletRequest request,@RequestParam String username, @RequestParam String password) {  
        log.info("执行了testLogin方法！");  
        return "login";   
    }  

	/**
	 * 贱货，建议用json的方式返回页面
	 * 
	 * 直接返回你要的对象
	 * 
	 * public UserInfoResp queryUserInfo()
	 */
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		// 1、收集参数、验证参数 
//		// 2、绑定参数到命令对象
//		// 3、将命令对象传入业务对象进行业务处理
//		// 4、选择下一个页面 test
//		ModelAndView mv = new ModelAndView();
//		// 添加模型数据 可以是任意的POJO对象
//		mv.addObject("message", "Hello World!");
//		// 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
//		mv.setViewName("hello");
//		return mv;
//	}

}
