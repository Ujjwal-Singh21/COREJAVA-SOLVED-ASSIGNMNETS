package com.Exp17.TeamAndMatchDetails;

public class TeamBO {

    public Team createTeam(String data, Player[] playerList) {

        String[] teams = data.split(",");

        String teamName = teams[0];
        String playerName = teams[1];

        Player player = null;

        for (Player p : playerList) {
            if (p.getName().equalsIgnoreCase(playerName)) {
                player = p;
            }
        }

        return new Team(teamName, player);
    }
}
