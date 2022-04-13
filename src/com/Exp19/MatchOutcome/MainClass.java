package com.Exp19.MatchOutcome;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Outcome outcome;
        MatchBO matchBO = new MatchBO();

        //Match
        System.out.println("Enter number of matches ");
        int numOfMatches = Integer.parseInt(scanner.next());

        Match[] matchList = new Match[numOfMatches];

        for (int i = 1; i <= matchList.length; i++) {
            System.out.println("Enter match " + i + " details: ");

            System.out.println("Enter match date ");
            String matchDate = scanner.next();

            System.out.println("Enter team one ");
            String teamOne = scanner.next();

            System.out.println("Enter team two ");
            String teamTwo = scanner.next();

            System.out.println("Enter Venue ");
            String venue = scanner.next();

            System.out.println("Enter status ");
            String status = scanner.next();

            System.out.println("Enter Winner Team ");
            String winnerTeam = scanner.next();

            outcome = new Outcome(status, winnerTeam);

            matchList[i - 1] = new Match(matchDate, teamOne, teamTwo, venue, outcome);
        }

        //Menu
        int userChoice;
        do {
            System.out.println(" \n ");
            System.out.println("Menu: ");
            System.out.println("1) View match details ");
            System.out.println("2) Filter match details with outcome status ");
            System.out.println("3) Filter match details with outcome winner team ");
            System.out.println("4) Exit ");

            System.out.println(" \n ");
            System.out.println("Enter your choice ");

            userChoice = Integer.parseInt(scanner.next());

            switch (userChoice) {
                case 1 -> matchBO.printAllMatchDetails(matchList);

                case 2 -> {
                    System.out.println("Enter Outcome status ");
                    String outcomeStatus = scanner.next();
                    matchBO.printMatchDetailsWithOutcomeStatus(matchList, outcomeStatus);
                }

                case 3 -> {
                    System.out.println("Enter Outcome winner team ");
                    String outcomeWinnerTeam = scanner.next();
                    matchBO.printMatchDetailsWithOutcomeWinnerTeam(matchList, outcomeWinnerTeam);
                }

                case 4 -> System.exit(0);
            }
        } while (userChoice == 1 || userChoice == 2 || userChoice == 3);
    }
}
