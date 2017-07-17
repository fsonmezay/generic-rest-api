package com.ferdisonmezay.tutorials.genericrestapi.model;

import javax.persistence.Column;

public class Role extends BaseModel{

	private static final long serialVersionUID = -1938567246027507296L;
	
	@Column(name="role_name")
	private String name;
	
	@Column(name="role_key")
	private String roleKey;
	
	@Column(name="is_active")
	private boolean isActive;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoleKey() {
		return roleKey;
	}

	public void setRoleKey(String roleKey) {
		this.roleKey = roleKey;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
}
