package com.prudhvi.aj;

import java.io.Serializable;

public class generalservlet implements Serializable {
	private String email;
	private String firstname;
	private String lastname;
	private String password;
	private String reenterpassword;
	public void setEmail(String email) {
		this.email=email;
		
	}
	public String getEmail() {
		return email;
	}
	public void setFirstname(String firstname) {
		this.firstname=firstname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setLastname(String lastname) {
		this.lastname=lastname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
	public void setReenterpassword(String reenterpassword) {
		this.reenterpassword=reenterpassword;
	}
	public String getReenterpassword() {
		return reenterpassword;
		
	}
	
}
