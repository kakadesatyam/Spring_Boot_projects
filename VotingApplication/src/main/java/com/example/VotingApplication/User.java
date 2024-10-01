package com.example.VotingApplication;

public interface User {
	
	void setUserName(String userName);
	String getUserName();
	void setPoliticalParty(PoliticalParty politicalParty);
	PoliticalParty getPoliticalParty();
}
