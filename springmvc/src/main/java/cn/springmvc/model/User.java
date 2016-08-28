package cn.springmvc.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 用户表
 * @author 
 * 2016年08月27日
 */
public class User{
	private int userId;
	private String userName;
	@JsonProperty("loginId")
	private String loginId;
	@JsonProperty("password")
	private String password;
		public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
