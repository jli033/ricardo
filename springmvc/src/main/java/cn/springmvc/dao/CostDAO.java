package cn.springmvc.dao;

import java.util.List;

import cn.springmvc.model.Cost;

public interface CostDAO {
	public List<Cost> selectUserCostList(int userId);
}
