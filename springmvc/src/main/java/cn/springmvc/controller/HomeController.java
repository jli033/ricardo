package cn.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.javafx.scene.layout.region.Margins.Converter;

import cn.springmvc.model.User;
import cn.springmvc.service.UserService;

@Controller
public class HomeController {
	@Autowired
	UserService service;
	
	@ResponseBody
	@RequestMapping(value="/home/login",method=RequestMethod.POST)
	//パラメータはHttpSerletRequestで、取得できない
	//@RequestParam("loginId")で、取得できます。
	//------------------
	//@RequestBody User user 405エラーを出します。
	//誤り：ajaxのdata:{"loginId":"lijun"}
	//正確：JSON.stringify({"loginId":"lijun","password":"jps38li"})
	//原因はよくわからない
	//AJAX Type:GETの場合、サーバー方は@RequestParamで　data:{"loginId":"lijun"}が取得できます。
	public String login(@RequestBody User user){
		String loginid = user.getLoginId();
		return "index";
	}
}
