package com.dbmsproject.votingsystem.dba;

import org.springframework.data.repository.CrudRepository;

import com.dbmsproject.votingsystem.model.Voter;
import com.dbmsproject.votingsystem.model.CandidateVoterId;

public interface VoterRepo extends CrudRepository<Voter, CandidateVoterId> {

}
