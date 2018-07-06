package com.kun.sercurity.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kun.sercurity.dao.SysRoleMapper;
import com.kun.sercurity.repository.SysRole;
import com.kun.sercurity.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	public SysRoleMapper sRoleDao;
	@Override
	public SysRole select(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(SysRole t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(SysRole t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SysRole> getRoleByUserId(String uid) {
		return sRoleDao.getRoleByUserId(uid);
	
	}

}
