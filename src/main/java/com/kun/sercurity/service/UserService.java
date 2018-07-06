package com.kun.sercurity.service;

import com.kun.base.BaseService;
import com.kun.sercurity.repository.SysUser;

public interface UserService extends BaseService<SysUser>{
	
	public SysUser findByName(String name);

}
