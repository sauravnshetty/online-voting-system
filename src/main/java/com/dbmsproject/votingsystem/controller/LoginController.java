package com.dbmsproject.votingsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("login")
	public String showLogin() {
		System.out.println("hello world");
		return "login";
	}
}
