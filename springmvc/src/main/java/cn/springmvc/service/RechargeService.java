package cn.springmvc.service;

import java.util.List;

import cn.springmvc.model.Cost;
import cn.springmvc.model.Recharge;
import cn.springmvc.model.User;


public interface RechargeService {
	public List<Recharge> getRechargeListFromUserId(int userId);
}
