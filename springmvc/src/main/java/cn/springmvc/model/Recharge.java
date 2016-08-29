package cn.springmvc.model;

import java.math.BigDecimal;

public class Recharge {
	private int rechargeId;
	private int userId;
	private BigDecimal rechargeMoney;
	private String rechargeDateTime;
	private int createStaffId;
	public int getRechargeId() {
		return rechargeId;
	}
	public void setRechargeId(int rechargeId) {
		this.rechargeId = rechargeId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public BigDecimal getRechargeMoney() {
		return rechargeMoney;
	}
	public void setRechargeMoney(BigDecimal rechargeMoney) {
		this.rechargeMoney = rechargeMoney;
	}
	public String getRechargeDateTime() {
		return rechargeDateTime;
	}
	public void setRechargeDateTime(String rechargeDateTime) {
		this.rechargeDateTime = rechargeDateTime;
	}
	public int getCreateStaffId() {
		return createStaffId;
	}
	public void setCreateStaffId(int createStaffId) {
		this.createStaffId = createStaffId;
	}
}
