package com.example.VotingApplication;

import org.springframework.stereotype.Component;

@Component("AAP")
public class AAP implements PoliticalParty{
	
	private String partyName = "AAP";
	
	@Override
	public String getPartyName() {
		return this.partyName;
	}

}
