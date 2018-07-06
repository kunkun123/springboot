package com.kun.sercurity.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.kun.base.BaseMapper;
import com.kun.sercurity.repository.SysRole;

public interface SysRoleMapper extends BaseMapper<SysRole>{
	public List<Map<String,Object>> findAll();
	public List<SysRole> getRoleByUserId(String uid);
}
