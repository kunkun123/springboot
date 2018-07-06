package com.kun.sercurity.dao;

import org.springframework.stereotype.Repository;

import com.kun.base.BaseMapper;
import com.kun.sercurity.repository.SysUser;
@Repository
public interface UserMapper extends BaseMapper<SysUser>{
	public SysUser findByName(String name);
}
