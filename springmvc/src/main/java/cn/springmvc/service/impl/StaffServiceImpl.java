package cn.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.StaffDAO;
import cn.springmvc.dao.UserDAO;
import cn.springmvc.model.Staff;
import cn.springmvc.model.User;
import cn.springmvc.service.StaffService;
import cn.springmvc.service.UserService;


@Service
public class StaffServiceImpl implements StaffService{
	@Autowired
	private StaffDAO staffDAO;
	public Staff getStaffFromLogin(Staff staff) {
		Staff result = staffDAO.selectStaffFromModel(staff);
		return result;
	}
}