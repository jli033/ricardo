package cn.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.springmvc.model.Staff;

@Controller
public class StaffHomeController {
	@RequestMapping(value="staff/home/staffLogin.do",method=RequestMethod.GET)
	public String staffLogin(){
		return "/staff/staffLogin";
	}
	
	@ResponseBody
	@RequestMapping(value="staff/home/staffLogining.do",method=RequestMethod.POST)
	public Map<String, String> staffLogin(@RequestBody Staff staff,HttpSession session){
		Map<String, String> result = new HashMap<String, String>();
		
		return result;
	}
}
