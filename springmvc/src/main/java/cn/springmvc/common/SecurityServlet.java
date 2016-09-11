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

import cn.springmvc.model.Staff;
import cn.springmvc.model.User;

public class SecurityServlet extends HttpServlet implements Filter {
	private static final long serialVersionUID = 1L;

	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		HttpSession session = request.getSession(true);
		// String usercode = (String) request.getRemoteUser();// 登录人
		// String user_role = (String) session.getAttribute("role");// 登录人角色
		// String url = request.getRequestURI();
		
		String servletPath = request.getServletPath();
		if (servletPath.equals("/Common/NotLogin.do")) {
			arg2.doFilter(arg0, arg1);
			return;
		}
		User loginUser = (User) session.getAttribute("LoginUser");
		Staff loginStaff = (Staff) session.getAttribute("LoginStaff");
		if (loginUser == null && loginStaff == null) {
			String[] attrPath = servletPath.split("/");
			if(attrPath.length<2){
				response.sendRedirect(request.getContentType()+"/Common/NotLogin.do");
				return;
			}
			if (attrPath[1].equals("user")) {
				// 判断获取的路径不为空且不是访问登录页面或执行登录操作时跳转
				if (!servletPath.equals("/user/home/Login.do") && !servletPath.equals("/user/home/Logining.do")) {
					response.sendRedirect(request.getContextPath() + "/user/home/Login.do");
					return;
				}
			}
			else if (attrPath[1].equals("staff")) {
				if (!servletPath.equals("/staff/home/Login.do") && !servletPath.equals("/staff/home/Logining.do")) {
					response.sendRedirect(request.getContextPath() + "/staff/home/Login.do");
					return;
				}
			}else{
				response.sendRedirect("/springmvc/Common/NotLogin.do");
				return;
			}
		}
		arg2.doFilter(arg0, arg1);
		return;
	}

	public void init(FilterConfig arg0) throws ServletException {
	}
}