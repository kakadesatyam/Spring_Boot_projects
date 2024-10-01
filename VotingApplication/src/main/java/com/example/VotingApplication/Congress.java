package com.example.VotingApplication;

import org.springframework.stereotype.Component;

@Component("Congress")
public class Congress implements PoliticalParty{
	
	private String partyName = "Congress";
	
	@Override
	public String getPartyName() {
		return this.partyName;
	}

}
