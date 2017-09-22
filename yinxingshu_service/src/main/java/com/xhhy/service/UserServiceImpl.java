package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhhy.bean.UserBean;
import com.xhhy.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao ud;
	
	public UserBean login(String loginName, String password) {
		// TODO Auto-generated method stub
		return ud.login(loginName, password);
	}
	public void updateLoginNum(int userId) {
		// TODO Auto-generated method stub
		ud.updateLoginNum(userId);
	}
	@Override
	public PageInfo list(int pageNum,int pageSize,int pageCount) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List l = ud.list();
		PageInfo page = new PageInfo(l,pageCount);
		return page;
	}

}
