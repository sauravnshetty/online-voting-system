package com.dbmsproject.votingsystem.doa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dbmsproject.votingsystem.model.User;


public interface UserRepo extends CrudRepository<User, String> {
	
	
}
