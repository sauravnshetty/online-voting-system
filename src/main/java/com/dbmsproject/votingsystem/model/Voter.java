package com.dbmsproject.votingsystem.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
//import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Voter {

	@EmbeddedId
	private CandidateVoterId voterId;
	
	@NotNull
	private String cid;

	public Voter(CandidateVoterId voterId, @NotNull String cid) {
		super();
		this.voterId = voterId;
		this.cid = cid;
	}

	public CandidateVoterId getVoterId() {
		return voterId;
	}

	public void setVoterId(CandidateVoterId voterId) {
		this.voterId = voterId;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}
	
}
