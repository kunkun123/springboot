package com.kun.sercurity.dao;

import java.util.List;
import java.util.Map;

import com.kun.base.BaseMapper;
import com.kun.sercurity.repository.SysResource;

public interface SysResourceMapper extends BaseMapper<SysResource>{
	public List<Map<String, Object>> findByRoleName(String auth);
}
