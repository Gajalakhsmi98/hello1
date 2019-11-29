package com.springsec.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsec.model.dao.AppUser;

@Service
public class DetailService implements UserDetailsService{
	
	@Autowired
	private AppUserService userService;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		AppUser appUser=userService.findByEmail(email);
		System.out.println("+++++++++++++++++++++++");
		System.out.println(appUser);
		if(appUser==null)
			throw new UsernameNotFoundException("user is not found");
		else
			return new User(appUser.getEmail(),appUser.getPassword(),
					AuthorityUtils.createAuthorityList(appUser.getRoles()));
	}

}
