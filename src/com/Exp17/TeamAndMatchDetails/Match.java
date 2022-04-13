package com.Exp17.TeamAndMatchDetails;

public class Match {

    String date;
    Team teamOne;
    Team teamTwo;
    String venue;

    public Match() {
        super();
    }

    public Match(String date, Team teamOne, Team teamTwo, String venue) {
        this.date = date;
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.venue = venue;
    }

    public String getDate() {
        return date;
    }

    public Team getTeamOne() {
        return teamOne;
    }

    public Team getTeamTwo() {
        return teamTwo;
    }

    public String getVenue() {
        return venue;
    }

}
