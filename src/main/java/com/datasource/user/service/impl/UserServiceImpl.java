package com.datasource.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datasource.user.dao.UserDao;
import com.datasource.user.domain.ThUsers;
import com.datasource.user.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	@Override
	public List<ThUsers> queryUserList() {
		// TODO 查询用户集合
		return userDao.queryUserList();
	}

}
