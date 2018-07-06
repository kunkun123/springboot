package com.kun.sercurity.service;

import java.util.List;
import java.util.Set;

import com.kun.base.BaseService;
import com.kun.sercurity.repository.SysRole;

public interface RoleService extends BaseService<SysRole>{
	public List<SysRole> getRoleByUserId(String uid);
}
