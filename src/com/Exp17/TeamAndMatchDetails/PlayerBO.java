package com.Exp17.TeamAndMatchDetails;

public class PlayerBO {

    public Player createPlayer(String data) {

        String[] players = data.split(",");
        
        String playerName = players[0];
        String playerCountry = players[1];
        String playerSkill = players[2];

        return new Player(playerName, playerCountry, playerSkill);

    }
}
