package com.dbmsproject.votingsystem.doa;

import org.springframework.data.repository.CrudRepository;

import com.dbmsproject.votingsystem.model.*;

public interface ElectionRepo extends CrudRepository<Election, Integer> {
}
