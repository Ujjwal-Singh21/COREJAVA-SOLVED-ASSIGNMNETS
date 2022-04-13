package com.Exp18.InningsDelivery;

public class Innings {

    private Long inningsNumber;
    private String battingTeam;

    public Innings() {
        super();
    }

    public Innings(Long inningsNumber, String battingTeam) {
        this.inningsNumber = inningsNumber;
        this.battingTeam = battingTeam;
    }

    public Long getInningsNumber() {
        return inningsNumber;
    }

    public String getBattingTeam() {
        return battingTeam;
    }
}
