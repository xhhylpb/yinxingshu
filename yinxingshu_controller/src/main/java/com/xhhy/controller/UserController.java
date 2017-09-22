package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.xhhy.bean.UserBean;
import com.xhhy.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService us;
	
	@RequestMapping("/list")
	public String list(int pageNum ,Model m){
		PageInfo page = us.list(pageNum, 8, 5);
		List<UserBean> l = page.getList();
		m.addAttribute("userlist", l);
		return "/resource/demo2/list.jsp";
	}
}
