package com.Exp28.NullPoinetrExceptionDemo;
import java.util.Scanner;

//Player POJO
class Player {
    String name;
    String country;
    String skill;

    Player() {
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

//PlayerBO class -> to display Player details
class PlayerBO {

    public void displayPlayerDetails(Player[] players, String[] captainData) {

        try {
            for (String c : captainData) {
                if (c == null) {
                    throw new NullPointerException();
                } else {
                    System.out.print(c + ", ");
                }
            }

        } catch (NullPointerException e) {
            System.out.println("Exception Occurred: " + e);
            System.out.println("Captain details not available");
        }

        System.out.println();
        System.out.println("Player Details: ");

        for (Player p : players) {
            System.out.println(p.getName() + ", " + p.getCountry() + ", " + p.getSkill());
        }
    }
}

//Main Class
public class NullPointerExceptionDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of players: ");
        int noOfPlayers = scanner.nextInt();

        Player[] players = new Player[noOfPlayers];

        //Captain Details
        System.out.println("Do you know the details of the captain? Type Yes / No");
        String input = scanner.next();

        scanner.nextLine();

        String captainName = null;
        String captainCountry = null;
        String captainSkillSet = null;

        if (input.equalsIgnoreCase("Yes")) {

            System.out.println("Enter Name of the Captain: ");
            captainName = scanner.nextLine();

            System.out.println("Enter country of the Captain: ");
            captainCountry = scanner.nextLine();

            System.out.println("Enter skillSet of the Captain: ");
            captainSkillSet = scanner.nextLine();

        }

        String[] captainDetails = {captainName, captainCountry, captainSkillSet};


        //Player Details
        String name;
        String country;
        String skillSet;

        for (int i = 1; i <= players.length; i++) {

            System.out.println("Enter Name of Player " + i);
            name = scanner.nextLine();

            System.out.println("Enter Country of Player " + i);
            country = scanner.nextLine();

            System.out.println("Enter SkillSet of Player " + i);
            skillSet = scanner.nextLine();

            players[i - 1] = new Player(name, country, skillSet);

        }

        PlayerBO playerBO = new PlayerBO();
        playerBO.displayPlayerDetails(players, captainDetails);

    }
}
