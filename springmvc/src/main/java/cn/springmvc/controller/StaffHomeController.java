package cn.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class StaffHomeController {
	@RequestMapping(value="/home/staffLogin.do",method=RequestMethod.GET)
	public String userLogin(){
		return "/staff/staffLogin";
	}
}
