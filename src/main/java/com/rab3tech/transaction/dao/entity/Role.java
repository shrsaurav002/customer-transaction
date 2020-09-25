package com.rab3tech.transaction.dao.entity;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
	ROLE_ADMIN, ROLE_CLIENT;

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return name();
	}

}
