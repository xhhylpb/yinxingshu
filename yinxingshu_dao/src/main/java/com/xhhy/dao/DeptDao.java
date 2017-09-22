package com.xhhy.dao;

import org.springframework.stereotype.Repository;

import com.xhhy.bean.DeptBean;
@Repository
public interface DeptDao {

	public DeptBean getDeptById(int deptId);
}
