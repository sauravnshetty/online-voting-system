package com.dbmsproject.votingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbmsproject.votingsystem.doa.CandidateRepo;
import com.dbmsproject.votingsystem.model.Candidate;


@Service
public class CandidateService {
	
	@Autowired
	private CandidateRepo candidateRepo;
	
	public Candidate save(Candidate newCandidate) {
		return candidateRepo.save(newCandidate);
	}
}
