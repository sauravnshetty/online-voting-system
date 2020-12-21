package com.dbmsproject.votingsystem.doa;

import org.springframework.data.repository.CrudRepository;

import com.dbmsproject.votingsystem.model.Candidate;
import com.dbmsproject.votingsystem.model.CandidateVoterId;

public interface CandidateRepo extends CrudRepository<Candidate, CandidateVoterId>{

}
