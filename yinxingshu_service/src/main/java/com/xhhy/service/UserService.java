package com.xhhy.service;


import java.util.List;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.UserBean;

public interface UserService {
	public UserBean login(String loginName,String password);
	public void updateLoginNum(int userId);
	public PageInfo list(int pageNum,int pageSize,int pageCount);
}
