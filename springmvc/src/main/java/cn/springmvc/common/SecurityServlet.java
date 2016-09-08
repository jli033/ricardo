package cn.springmvc.common;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.springmvc.model.User;

public class SecurityServlet extends HttpServlet implements Filter {
	private static final long serialVersionUID = 1L;

	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		HttpSession session = request.getSession(true);
//		String usercode = (String) request.getRemoteUser();// 登录人
//		String user_role = (String) session.getAttribute("role");// 登录人角色
		//String url = request.getRequestURI();
		String servletPath = request.getServletPath();
		
		
		User loginUser = (User)session.getAttribute("LoginUser");
		if(loginUser==null){
			// 判断获取的路径不为空且不是访问登录页面或执行登录操作时跳转
			if (!servletPath.equals("/user/home/Login.do") && !servletPath.equals("/user/home/Logining.do") 
					//&& !servletPath.equals("/home/staffLogin.do") && !servletPath.equals("/home/staffLogining.do")
				) {
				response.sendRedirect(request.getContextPath());
				return;
			}
		}
		arg2.doFilter(arg0, arg1);
		
		return;
	}
	public void init(FilterConfig arg0) throws ServletException {
	}
}