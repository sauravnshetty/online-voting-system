package com.dbmsproject.votingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbmsproject.votingsystem.doa.ElectionRepo;
import com.dbmsproject.votingsystem.model.Election;

@Service
public class ElectionService {

	@Autowired
	private ElectionRepo electionRepo;
	
	public List<Election> getAllElections() {
		return (List<Election>)electionRepo.findAll();
	}
}