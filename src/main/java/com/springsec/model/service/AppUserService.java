package com.springsec.model.service;

import com.springsec.model.dao.AppUser;

public interface AppUserService {
	public void addAppUser(AppUser user);
	public AppUser   findByEmail(String email);
}
