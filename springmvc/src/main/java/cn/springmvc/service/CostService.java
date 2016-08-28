package cn.springmvc.service;

import java.util.List;

import cn.springmvc.model.Cost;
import cn.springmvc.model.User;


public interface CostService {
	public List<Cost> getCostListFromUserId(int userId);
}
