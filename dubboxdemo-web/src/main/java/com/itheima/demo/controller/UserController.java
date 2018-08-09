package com.itheima.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	//dubbo提供的远程注入
	@Reference
	private UserService userService;
	
	@RequestMapping("/showName")
	//定义返回为字符串，而不是页面
	@ResponseBody
	public String showName(){
		return userService.getName();
	}
}
