package cn.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.sun.javafx.scene.layout.region.Margins.Converter;

import cn.springmvc.Common.SessionKey;
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
	//AJAX Type:GETの場合、サーバー方は@RequestParamで　data:{"loginId":"lijun"}が取得できます。
	//原因はよくわからない
	//-----------------
	//@RequestBody + POST + json string がOKです
	//@RequestBody + GET + jsonstring/json object がだめです。400 bad request
	public Map<String, Object> login(@RequestBody User user,HttpSession session){
		Map<String, Object> result = new HashMap<String,Object>();
		User loginUser = service.getUserFromLogin(user);
		if (loginUser!=null) {
			result.put("result", "OK");
			session.setAttribute(SessionKey.LoginUser, user);
			return result;
		}else{
			result.put("result", "Error");
			return result;
		}
	}
	@RequestMapping("/home/index")
	public ModelAndView index(HttpSession session) {
		ModelAndView result = new ModelAndView();
		User loginUser = (User)session.getAttribute(SessionKey.LoginUser);
		
		return result;
	}
}
