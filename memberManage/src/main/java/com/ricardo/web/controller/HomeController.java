package com.ricardo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ricardo.web.model.User;

@Controller
public class HomeController {
	@RequestMapping(value="/")
	public String Index(){
		return "index";
	}
	@RequestMapping(value="/home/login",method=RequestMethod.POST)
	public String Login(@ModelAttribute User _user){
		String loginID = _user.getLoginID();
		String password = _user.getPassword();
		return "main/index";
	}
}
