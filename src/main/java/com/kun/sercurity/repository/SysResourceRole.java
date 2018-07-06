package com.kun.sercurity.repository;

import java.io.Serializable;
import java.util.Date;

public class SysResourceRole implements Serializable{
	
	private int id;
	
	
	private String roleId; //角色ID
	
	
	private String resourceId;//资源ID
	
	
	private Date updateTime;//更新时间

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
