package com.datasource.user.service;

import java.util.List;

import com.datasource.user.domain.ThUsers;

public interface UserService {

	/**查询用户集合*/
	public List<ThUsers> queryUserList();
	
}
