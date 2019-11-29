package com.springsec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springsec.model.dao.AppUser;
import com.springsec.model.service.AppUserService;

@SpringBootApplication
public class SpringsecApplication implements CommandLineRunner{
	
	@Autowired
	private AppUserService appUserService;

	public static void main(String[] args) {
		SpringApplication.run(SpringsecApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		appUserService.addAppUser(new AppUser("gaja","gaja123", "gaja@gmail.com"
				, true, new String[]{"ROLE_ADMIN","ROLE_MGR","ROLE_TRAINEE"}));		
		appUserService.addAppUser(new AppUser("roja","roja123", "roja@gmail.com"
				, true, new String[]{"ROLE_MGR","ROLE_TRAINEE"}));		
		appUserService.addAppUser(new AppUser("pooja","pooja123", "pooja@gmail.com"
				, true, new String[]{"ROLE_TRAINEE"}));		
	}

	
	
	
}
