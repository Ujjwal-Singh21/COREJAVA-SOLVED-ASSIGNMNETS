package com.Exp17.TeamAndMatchDetails;

public class MatchBO {

    public Match createMatch(String data, Team[] teamList) {

        String[] matches = data.split(",");

        String date = matches[0];
        String teamOneName = matches[1];
        String teamTwoName = matches[2];
        String venue = matches[3];

        Team teamOne = null;
        Team teamTwo = null;

        for (Team t : teamList) {
            if (t.getTeamName().equalsIgnoreCase(teamOneName)) {
                teamOne = t;
            } else if (t.getTeamName().equalsIgnoreCase(teamTwoName)) {
                teamTwo = t;
            }
        }

        return new Match(date, teamOne, teamTwo, venue);

    }

    public void findTeam(String matchDate, Match[] matchList) {

        System.out.println(" \n ");
        System.out.println("Team ");
        for (Match m : matchList) {
            if (m.getDate().equalsIgnoreCase(matchDate)) {
                System.out.println(m.getTeamOne().getTeamName() + "," +
                        m.getTeamTwo().getTeamName());
            }
        }
    }


    public void findAllMatchesOfTeam(String teamName, Match[] matchList) {

        System.out.println(" \n ");
        System.out.println("Date " + " TeamOne " + " TeamTwo " + " Venue");
        for (Match m : matchList) {
            if (m.getTeamOne().getTeamName().equalsIgnoreCase(teamName)) {
                System.out.println(m.getDate() + " " + m.getTeamOne().getTeamName()
                        + " " + m.getTeamTwo().getTeamName() + " " + m.getVenue());

            } else if (m.getTeamTwo().getTeamName().equalsIgnoreCase(teamName)) {
                System.out.println(m.getDate() + " " + m.getTeamOne().getTeamName()
                        + " " + m.getTeamTwo().getTeamName() + " " + m.getVenue());
            }

        }
    }
}


