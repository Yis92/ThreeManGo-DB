package com.datasource.user.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.datasource.user.domain.ThUsers;
import com.datasource.user.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	private final static Logger log = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/home")
	public String getUser(HttpServletRequest request,
			HttpServletResponse response,String name){
		System.out.println(name+"----");
		List<ThUsers> userList = userService.queryUserList();
		System.out.println("userList>>>"+userList);
		request.setAttribute("test", "hello 塔刘！");
		return "page/test";
	}
	
}
