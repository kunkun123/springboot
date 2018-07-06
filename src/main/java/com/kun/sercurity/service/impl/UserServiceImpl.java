package com.kun.sercurity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kun.sercurity.dao.UserMapper;
import com.kun.sercurity.repository.SysUser;
import com.kun.sercurity.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public SysUser select(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(SysUser t) {
		userMapper.update(t);
	}

	@Override
	public void insert(SysUser t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SysUser findByName(String name) {
		SysUser sysUser = userMapper.findByName(name);
		return sysUser;
	}

}
