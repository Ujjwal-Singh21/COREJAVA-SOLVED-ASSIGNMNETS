package com.Exp16.PlayerSkills;

import java.util.Scanner;

//Player class
class Player {
    private String name;
    private String country;
    private String skill;

    public Player() {
        super();
    }

    public Player(String name, String country, String skill) {
        this.name = name;
        this.country = country;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getSkill() {
        return skill;
    }
}

//PlayerBo class
class PlayerBO {

    public void viewDetails(Player[] playerList) {

        System.out.println(" \n");
        System.out.println("Player " + " Country " + " Skill");
        for (Player p : playerList) {
            System.out.println(p.getName() + " , " + p.getCountry() + " , " + p.getSkill());
        }
    }

    public void printPlayerDetailWithSkill(Player[] playerList, String skill) {

        System.out.println(" \n");

        if (skill.equalsIgnoreCase("Batsman")) {
            System.out.println("Player " + " Country " + " Skill");
            for (Player p : playerList) {
                if (p.getSkill().equalsIgnoreCase("Batsman")) {
                    System.out.println(p.getName() + " , " + p.getCountry() + " , " + p.getSkill());
                }
            }
        } else if (skill.equalsIgnoreCase("Bowler")) {
            System.out.println("Player " + " Country " + " Skill");
            for (Player p : playerList) {
                if (p.getSkill().equalsIgnoreCase("Bowler")) {
                    System.out.println(p.getName() + " , " + p.getCountry() + " , " + p.getSkill());
                }
            }
        } else if (skill.equalsIgnoreCase("AllRounder")) {
            System.out.println("Player " + " Country " + " Skill");
            for (Player p : playerList) {
                if (p.getSkill().equalsIgnoreCase("AllRounder")) {
                    System.out.println(p.getName() + " , " + p.getCountry() + " , " + p.getSkill());
                }
            }
        } else if (!((skill.equalsIgnoreCase("Batsman"))
                || (skill.equalsIgnoreCase("Bowler"))
                || (skill.equalsIgnoreCase("AllRounder")))) {
            System.out.println("Skill not found");
        }
    }

}

//Main class
public class PlayerSkills {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of Players");
        int numOfPlayers = scanner.nextInt();

        Player[] players = new Player[numOfPlayers];

        for (int i = 1; i <= players.length; i++) {

            System.out.println("Enter Player " + i + " details: ");

            scanner.nextLine();

            System.out.println("Enter player name ");
            String playerName = scanner.nextLine();

            System.out.println("Enter country name ");
            String countryName = scanner.next();

            System.out.println("Enter skill ");
            String playerSkill = scanner.next();

            players[i - 1] = new Player(playerName, countryName, playerSkill);
        }

        PlayerBO playerBO = new PlayerBO();

        int userInput;

        do {
            System.out.println(" \n");
            System.out.println("Menu: ");
            System.out.println("1. View details");
            System.out.println("2. Filter players with skill");
            System.out.println("3. Exit");

            userInput = scanner.nextInt();

            switch (userInput) {

                case 1 -> playerBO.viewDetails(players);

                case 2 -> {
                    System.out.println(" \n");
                    System.out.println("Enter Skill ");
                    String inputSkill = scanner.next();

                    playerBO.printPlayerDetailWithSkill(players, inputSkill);

                }

                case 3 -> System.exit(0);
            }

        } while (userInput == 1 || userInput == 2);

    }
}
