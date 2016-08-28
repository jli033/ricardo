package cn.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.CostDAO;
import cn.springmvc.dao.UserDAO;
import cn.springmvc.model.Cost;
import cn.springmvc.model.User;
import cn.springmvc.service.CostService;
import cn.springmvc.service.UserService;


@Service
public class CostServiceImpl implements CostService{

	@Autowired
	private CostDAO costDAO;
	public List<Cost> getCostListFromUserId(int userId) {
		return costDAO.selectUserCostList(userId);
	}
	
}
