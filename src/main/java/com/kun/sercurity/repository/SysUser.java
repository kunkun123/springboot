package com.kun.sercurity.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SysUser implements java.io.Serializable {
	
	
	private String id;
	
	private String name; //用户名
	
	private String email;//用户邮箱
	
	private String password;//用户密码
	
	private Date dob;//时间
	

	private List<SysRole> SysRoles = new ArrayList<SysRole>(0);// 所对应的角色集合

	public SysUser() {
	}

	public SysUser(String name, String email, String password, Date dob, List<SysRole> SysRoles) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.SysRoles = SysRoles;
	}

	
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	
	public List<SysRole> getSysRoles() {
		return this.SysRoles;
	}

	public void setSysRoles(List<SysRole> SysRoles) {
		this.SysRoles = SysRoles;
	}

}
