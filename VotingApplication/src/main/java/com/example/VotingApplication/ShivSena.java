package com.example.VotingApplication;

import org.springframework.stereotype.Component;

@Component("ShivSena")
public class ShivSena implements PoliticalParty{
    private String partyName = "ShivSena";
    @Override
    public String getPartyName() {
        return this.partyName;
    }
}
