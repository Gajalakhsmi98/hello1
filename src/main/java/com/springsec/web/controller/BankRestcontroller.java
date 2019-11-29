package com.springsec.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestcontroller {

	@GetMapping(path="home")
	public String home(){
		return "home";
	}
	
	@GetMapping(path="admin")
	public String admin(){
		return "home of admin";
	}
	
	@GetMapping(path="mgr")
	public String mgr(){
		return "home of mgr";
	}
	@GetMapping(path="trainee")
	public String trainee(){
		return "home of trainee";
	}
}
