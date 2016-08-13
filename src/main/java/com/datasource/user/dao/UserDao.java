package com.datasource.user.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.datasource.user.domain.ThUsers;

@Repository(value = "userDao")
public class UserDao extends SqlSessionDaoSupport{

	private static final String USER_MAPPER="th_users.";
	/**
	 * TODO(查询用户集合)
	 */
	public List<ThUsers> queryUserList(){
		return this.getSqlSession().selectList(USER_MAPPER+"queryModelList");
	}
	/**
	 * TODO(注册  保存)
	 * @param user
	 */
	public void insert(ThUsers user){
		this.getSqlSession().insert(USER_MAPPER+"insert",user);
	}
	
	public ThUsers queryLogin(){
		
		return null;
	}
}
