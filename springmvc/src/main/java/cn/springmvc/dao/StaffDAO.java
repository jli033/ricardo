package cn.springmvc.dao;

import cn.springmvc.model.Staff;
import cn.springmvc.model.User;


public interface StaffDAO {

	public Staff selectStaffFromModel(Staff staff);
}
