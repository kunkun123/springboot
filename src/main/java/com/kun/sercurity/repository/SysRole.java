package com.kun.sercurity.repository;

import java.io.Serializable;

public class SysRole implements Serializable {
	
	private String id;
	
	
	private SysUser SUser;//角色对应的用户实体
	
	
	private String name;//角色名称
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SysUser getSUser() {
		return SUser;
	}
	public void setSUser(SysUser sUser) {
		SUser = sUser;
	}
}
