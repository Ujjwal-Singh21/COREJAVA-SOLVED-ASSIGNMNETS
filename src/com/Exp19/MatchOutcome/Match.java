package com.Exp19.MatchOutcome;

public class Match {

    private String date;
    private String teamOne;
    private String teamTwo;
    private String venue;
    private Outcome outcome;

    public Match() {
        super();
    }

    public Match(String date, String teamOne, String teamTwo, String venue, Outcome outcome) {
        this.date = date;
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.venue = venue;
        this.outcome = outcome;
    }

    public String getDate() {
        return date;
    }

    public String getTeamOne() {
        return teamOne;
    }

    public String getTeamTwo() {
        return teamTwo;
    }

    public String getVenue() {
        return venue;
    }

    public Outcome getOutcome() {
        return outcome;
    }
}
