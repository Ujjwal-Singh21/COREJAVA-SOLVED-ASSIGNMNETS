package com.Exp19.MatchOutcome;

public class Outcome {
    private String status;
    private String winnerTeam;

    public Outcome() {
        super();
    }

    public Outcome(String status, String winnerTeam) {
        this.status = status;
        this.winnerTeam = winnerTeam;
    }

    public String getStatus() {
        return status;
    }

    public String getWinnerTeam() {
        return winnerTeam;
    }
}
