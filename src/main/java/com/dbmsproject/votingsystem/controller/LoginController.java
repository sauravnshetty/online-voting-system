package com.dbmsproject.votingsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dbmsproject.votingsystem.model.User;

@Controller
public class LoginController {

	@RequestMapping("login")
	public String showLogin(/*@RequestParam String username, @RequestParam String password*/) {
		System.out.println("hello world");
		return "login";
	}
	
	@RequestMapping("register")
	public String showRegister(/*@RequestParam User user*/) {
		System.out.println("hello world");
		return "register";
	}
}
