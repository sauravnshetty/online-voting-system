package com.dbmsproject.votingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbmsproject.votingsystem.doa.UserRepo;
import com.dbmsproject.votingsystem.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	
	public User findById(String username) {
		return userRepo.findById(username).orElse(new User());
	}
	
	public User save(User newUser) {
		
		return userRepo.save(newUser);
	}
}
