package com.omar.vote.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vote {

	@EmbeddedId
	private VoteId pk;
	private Boolean upVote;
	
	public VoteId getPk() {
		return pk;
	}
	public void setPk(VoteId pk) {
		this.pk = pk;
	}
	public Boolean getUpVote() {
		return upVote;
	}
	public void setUpVote(Boolean upVote) {
		this.upVote = upVote;
	}
	
	
}
