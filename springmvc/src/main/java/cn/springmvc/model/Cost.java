package cn.springmvc.model;

import java.math.BigDecimal;
import java.util.Date;

public class Cost {
	private int costId;
	private int userId;
	private BigDecimal cost;
	private Date costDateTime;
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
	public Date getCostDateTime() {
		return costDateTime;
	}
	public void setCostDateTime(Date costDateTime) {
		this.costDateTime = costDateTime;
	}
}
