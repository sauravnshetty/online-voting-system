package com.dbmsproject.votingsystem.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Candidate {

	@EmbeddedId
	private CandidateVoterId candidateId;
	
	
//	@JoinColumn(name = "username")
//    private User user;
//
//	@JoinColumn(name = "eid")
//    private Election election;
//
//	
//	@ManyToOne
//    @JoinColumn(name = "username")
//	@NotNull
//    private User admin;
	
	@NotNull
	private Integer noOfVotes;
	
	
	

	public Candidate(CandidateVoterId candidateId, @NotNull Integer noOfVotes) {
		super();
		this.candidateId = candidateId;
		this.noOfVotes = noOfVotes;
	}
	
	

	public CandidateVoterId getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(CandidateVoterId candidateId) {
		this.candidateId = candidateId;
	}



	public Integer getNoOfVotes() {
		return noOfVotes;
	}

	public void setNoOfVotes(Integer noOfVotes) {
		this.noOfVotes = noOfVotes;
	}

	
}
