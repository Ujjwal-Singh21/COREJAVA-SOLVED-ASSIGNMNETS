package com.Exp17.TeamAndMatchDetails;

public class Team {

    private String teamName;
    private Player player;

    Team() {
        super();
    }

    Team(String teamName, Player player) {
        this.teamName = teamName;
        this.player = player;
    }

    public String getTeamName() {
        return teamName;
    }

    public Player getPlayer() {
        return player;
    }
}
