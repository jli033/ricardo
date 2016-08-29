package cn.springmvc.dao;

import java.util.List;
import cn.springmvc.model.Recharge;

public interface RechargeDAO {
	public List<Recharge> selectUserRechargeList(int userId);
}
