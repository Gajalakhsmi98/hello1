package com.springsec.model.dao;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
@Table(name="user_table")
public class AppUser {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 private String name;
 private String password;
 
 @Column(unique=true)
 private String email;
 private boolean status;
 private String[] roles;//admin,mgr,trainee
 
 private static BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
 
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = encoder.encode(password);
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public String[] getRoles() {
	return roles;
}
public void setRoles(String[] roles) {
	this.roles = roles;
}
public AppUser(String name, String password, String email, boolean status, String[] roles) {
	super();
	this.name = name;
	setPassword(password);;
	this.email = email;
	this.status = status;
	this.roles = roles;
}
public AppUser() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "AppUser [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", status=" + status
			+ ", roles=" + Arrays.toString(roles) + "]";
}
 
 
 
}
