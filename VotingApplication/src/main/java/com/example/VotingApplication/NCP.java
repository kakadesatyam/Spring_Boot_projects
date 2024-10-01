package com.example.VotingApplication;

import org.springframework.stereotype.Component;

@Component("NCP")
public class NCP implements PoliticalParty{
    private String partyName = "NCP";
    @Override
    public String getPartyName() {
        return this.partyName;
    }
}
