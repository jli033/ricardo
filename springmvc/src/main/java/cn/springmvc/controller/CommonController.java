package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommonController {
	@RequestMapping(value="Common/NotLogin.do",method=RequestMethod.GET)
	public String name() {
		return "/common/NotLogin";
	}
}
