package cn.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.CostDAO;
import cn.springmvc.dao.RechargeDAO;
import cn.springmvc.dao.UserDAO;
import cn.springmvc.model.Cost;
import cn.springmvc.model.Recharge;
import cn.springmvc.model.User;
import cn.springmvc.service.CostService;
import cn.springmvc.service.RechargeService;
import cn.springmvc.service.UserService;


@Service
public class RechargeServiceImpl implements RechargeService{

	@Autowired
	private RechargeDAO rechargeDAO;
	public List<Recharge> getRechargeListFromUserId(int userId) {
		return rechargeDAO.selectUserRechargeList(userId);
	}
	
}
