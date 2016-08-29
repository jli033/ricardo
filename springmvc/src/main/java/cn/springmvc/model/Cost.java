package cn.springmvc.model;

import java.math.BigDecimal;
import java.util.Date;

public class Cost {
	private int costId;
	private int userId;
	private BigDecimal cost;
	private String costDateTime;
	private int createStaffId;
	public int getCostId() {
		return costId;
	}
	public void setCostId(int costId) {
		this.costId = costId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	public String getCostDateTime() {
		return costDateTime;
	}
	public void setCostDateTime(String costDateTime) {
		this.costDateTime = costDateTime;
	}
	public int getCreateStaffId() {
		return createStaffId;
	}
	public void setCreateStaffId(int createStaffId) {
		this.createStaffId = createStaffId;
	}
}
