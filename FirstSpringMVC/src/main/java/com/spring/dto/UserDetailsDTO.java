package com.spring.dto;

import java.io.Serializable;
import java.util.List;

import com.spring.model.Role;

public class UserDetailsDTO implements Serializable {
	private String userName;
	private String email;
	private String mobile;
	private String role;
	
	//0-param constructor
	
	public UserDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	//param constructor
	public UserDetailsDTO(String userName, String email, String mobile, String role) {
		super();
		this.userName = userName;
		this.email = email;
		this.mobile = mobile;
		this.role = role;
	}


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
