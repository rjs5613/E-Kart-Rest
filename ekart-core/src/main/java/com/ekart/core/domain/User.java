package com.ekart.core.domain;

import java.util.Set;

import com.ekart.core.common.BaseEntity;

public class User extends BaseEntity{
	
	private String userId;
	
	private String name;
	
	private Set<UserAddress> addresses;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<UserAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<UserAddress> addresses) {
		this.addresses = addresses;
	}
	
}
