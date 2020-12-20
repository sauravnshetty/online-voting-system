package com.dbmsproject.votingsystem.dba;

import com.dbmsproject.votingsystem.model.*;
import org.springframework.data.repository.CrudRepository;

public interface ElectionRepo extends CrudRepository<Election, Integer> {

}
