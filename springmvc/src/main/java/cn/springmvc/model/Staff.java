package cn.springmvc.model;

//import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 用户表
 * @author 
 * 2016年08月27日
 */
public class Staff{
	private int staffId;
	private String staffName;
	private String staffLogin;
	private String staffPassword;
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffLogin() {
		return staffLogin;
	}
	public void setStaffLogin(String staffLogin) {
		this.staffLogin = staffLogin;
	}
	public String getStaffPassword() {
		return staffPassword;
	}
	public void setStaffPassword(String staffPassword) {
		this.staffPassword = staffPassword;
	}
}
