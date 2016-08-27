package cn.springmvc.model;

import java.io.Serializable;
import java.sql.Date;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 用户表
 * @author 
 * 2016年08月27日
 */
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	@JsonProperty("loginId")
	private String loginId;
	@JsonProperty("password")
	private String password;
	private int device_type;
	private String device_num;
	private Date create_time;
	private Date last_time;
	private int state;
	private String nickname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getDevice_type() {
		return device_type;
	}
	public void setDevice_type(int device_type) {
		this.device_type = device_type;
	}
	public String getDevice_num() {
		return device_num;
	}
	public void setDevice_num(String device_num) {
		this.device_num = device_num;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getLast_time() {
		return last_time;
	}
	public void setLast_time(Date last_time) {
		this.last_time = last_time;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
}
