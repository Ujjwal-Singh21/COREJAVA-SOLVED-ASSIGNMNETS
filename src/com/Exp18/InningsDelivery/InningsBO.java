package com.Exp18.InningsDelivery;

public class InningsBO {

    public Innings createInnings(String data) {

        String[] inningsData = data.split(",");

        Long inningsNumber = Long.parseLong(inningsData[0]);
        String battingTeam = inningsData[1];

        return new Innings(inningsNumber, battingTeam);
    }
}
