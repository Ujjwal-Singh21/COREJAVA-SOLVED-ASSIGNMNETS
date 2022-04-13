package com.Exp19.MatchOutcome;

public class MatchBO {

    public void printAllMatchDetails(Match[] matchList) {
        System.out.println(" \n");
        System.out.println("Match Details: ");
        System.out.println("Date " + " Team1 " + " Team2 " + " Venue " + " Status " + " Winner ");
        for (Match m : matchList) {
            System.out.println(m.getDate() + " " +
                    m.getTeamOne() + " " +
                    m.getTeamTwo() + " " +
                    m.getVenue() + " " +
                    m.getOutcome().getStatus() + " " +
                    m.getOutcome().getWinnerTeam());
        }

    }

    public void printMatchDetailsWithOutcomeStatus(Match[] matchList, String outcomeStatus) {

        System.out.println(" \n");

        if (outcomeStatus.equalsIgnoreCase("Won")) {
            System.out.println("Match Details: ");
            System.out.println("Date " + " Team1 " + " Team2 " + " Venue " + " Status " + " Winner ");
            for (Match m : matchList) {
                if (m.getOutcome().getStatus().equalsIgnoreCase("Won")) {
                    System.out.println(m.getDate() + " " +
                            m.getTeamOne() + " " +
                            m.getTeamTwo() + " " +
                            m.getVenue() + " " +
                            m.getOutcome().getStatus() + " " +
                            m.getOutcome().getWinnerTeam());
                }
            }
        } else if (outcomeStatus.equalsIgnoreCase("Draw")) {
            System.out.println("Match Details: ");
            System.out.println("Date " + " Team1 " + " Team2 " + " Venue " + " Status " + " Winner ");
            for (Match m : matchList) {
                if (m.getOutcome().getStatus().equalsIgnoreCase("Draw")) {
                    System.out.println(m.getDate() + " " +
                            m.getTeamOne() + " " +
                            m.getTeamTwo() + " " +
                            m.getVenue() + " " +
                            m.getOutcome().getStatus() + " " +
                            m.getOutcome().getWinnerTeam());
                }
            }

        } else if (!((outcomeStatus.equalsIgnoreCase("Won")) ||
                (outcomeStatus.equalsIgnoreCase("Draw")))) {
            System.out.println("Status not found");
        }
    }

    public void printMatchDetailsWithOutcomeWinnerTeam(Match[] matchList, String outcomeWinnerTeam) {

        System.out.println(" \n");

        boolean teamFoundOrNot = false;

        for (Match m : matchList) {
            if (m.getOutcome().getWinnerTeam().equalsIgnoreCase(outcomeWinnerTeam)) {
                teamFoundOrNot = true;
                break;
            }
        }

        if (teamFoundOrNot) {
            System.out.println("Match Details: ");
            System.out.println("Date " + " Team1 " + " Team2 " + " Venue " + " Status " + " Winner ");
            for (Match m : matchList) {
                if (m.getOutcome().getWinnerTeam().equalsIgnoreCase(outcomeWinnerTeam)) {
                    System.out.println(m.getDate() + " " +
                            m.getTeamOne() + " " +
                            m.getTeamTwo() + " " +
                            m.getVenue() + " " +
                            m.getOutcome().getStatus() + " " +
                            m.getOutcome().getWinnerTeam());
                }
            }
        } else {
            System.out.println("Winner Team not found");
        }
    }
}
