package com.springsec.model.dao;

import org.springframework.data.repository.CrudRepository;

public interface AppUserRepo extends CrudRepository<AppUser, Long> {
	public AppUser   findByEmail(String email);

}
