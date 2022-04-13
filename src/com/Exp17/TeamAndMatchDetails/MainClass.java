package com.Exp17.TeamAndMatchDetails;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PlayerBO playerBO = new PlayerBO();
        TeamBO teamBO = new TeamBO();
        MatchBO matchBO = new MatchBO();

        //Player
        System.out.println("Enter the player count ");
        int playerCount = Integer.parseInt(scanner.next());

        Player[] playersList = new Player[playerCount];

        //Player details
        String playerData = null;

        for (int i = 1; i <= playersList.length; i++) {

            System.out.println("Enter Player " + i + " details ");
            playerData = scanner.next();

            playersList[i - 1] = playerBO.createPlayer(playerData);

        }

        //Team
        System.out.println("Enter the team count ");
        int teamCount = Integer.parseInt(scanner.next());

        Team[] teamsList = new Team[teamCount];

        //Team details
        String teamData = null;

        for (int i = 1; i <= teamsList.length; i++) {

            System.out.println("Enter team " + i + " details ");
            teamData = scanner.next();

            teamsList[i - 1] = teamBO.createTeam(teamData, playersList);

        }


        //Match
        System.out.println("Enter the match count ");
        int matchCount = Integer.parseInt(scanner.next());

        Match[] matchList = new Match[matchCount];

        //Match Details
        String matchData = null;

        for (int i = 1; i <= matchList.length; i++) {

            System.out.println("Enter match " + i + " details");
            matchData = scanner.next();

            matchList[i - 1] = matchBO.createMatch(matchData, teamsList);
        }

        //Options
        String userYesNoChoice;

        do {
            System.out.println(" \n ");
            System.out.println("Menu: ");
            System.out.println("1) Find Team ");
            System.out.println("2) Find all Matches of a Team ");
            System.out.println(" \n ");
            System.out.println("Type 1 or 2 ");
            System.out.println("Enter your choice ");

            int userChoice = Integer.parseInt(scanner.next());

            switch (userChoice) {

                case 1 -> {
                    System.out.println("Enter Match date ");
                    String matchDate = scanner.next();

                    matchBO.findTeam(matchDate, matchList);
                }

                case 2 -> {
                    System.out.println("Match details: ");
                    System.out.println("Enter Team name ");
                    String teamName = scanner.next();

                    matchBO.findAllMatchesOfTeam(teamName, matchList);
                }
            }

            System.out.println(" \n ");
            System.out.println("Do you want to continue? Type Yes or No ");
            userYesNoChoice = scanner.next();

        } while (userYesNoChoice.equalsIgnoreCase("Yes"));

    }
}
