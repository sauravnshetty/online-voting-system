package com.dbmsproject.votingsystem.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class MyPasswordEncoder {

	PasswordEncoder passwordEncoder;
	
	public PasswordEncoder getPasswordEncoder() {
		return passwordEncoder;
	}

	public void setPassEncoder(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	MyPasswordEncoder() {
		this.passwordEncoder = new BCryptPasswordEncoder();
	}
	
}
