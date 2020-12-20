package com.dbmsproject.votingsystem.dba;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dbmsproject.votingsystem.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, String> {

}
