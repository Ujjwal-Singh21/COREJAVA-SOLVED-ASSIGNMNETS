package com.Exp20.HotelRoomAndCost;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //variables
        int userInput;
        boolean hasTV;
        boolean hasWifi;
        Integer tariffPerDay = 0;
        Integer ratePerSqFeet;

        //Object references
        DeluxeRoom deluxeRoom;
        DeluxeACRoom deluxeACRoom;
        SuiteACRoom suiteACRoom;

        do {
            System.out.println("\n");
            System.out.println("Hotel Tariff Calculator: ");
            System.out.println("1) Deluxe Room ");
            System.out.println("2) Deluxe AC Room ");
            System.out.println("3) Suite AC Room ");
            System.out.println();
            System.out.println("Select Room Type: ");
            userInput = Integer.parseInt(scanner.next());


            if (userInput == 1 || userInput == 2 || userInput == 3) {

                System.out.println("Hotel Name: ");
                String hotelName = scanner.next();

                System.out.println("Room Square Feet Area: ");
                Integer numberOfSqFeet = Integer.parseInt(scanner.next());

                System.out.println("Room has TV (yes/no): ");
                String yesOrNoTV = scanner.next();
                if (yesOrNoTV.equalsIgnoreCase("yes")) {
                    hasTV = true;
                } else {
                    hasTV = false;
                }

                System.out.println("Room has Wifi (yes/no): ");
                String yesOrNoWifi = scanner.next();
                if (yesOrNoWifi.equalsIgnoreCase("yes")) {
                    hasWifi = true;
                } else {
                    hasWifi = false;
                }

                if (userInput == 1) {

                    deluxeRoom = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);

                    ratePerSqFeet = deluxeRoom.getRatePerSqFeet();

                    tariffPerDay = deluxeRoom.calculateTariff(ratePerSqFeet);

                } else if (userInput == 2) {

                    deluxeACRoom = new DeluxeACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);

                    ratePerSqFeet = deluxeACRoom.getRatePerSqFeet();

                    tariffPerDay = deluxeACRoom.calculateTariff(ratePerSqFeet);

                } else if (userInput == 3) {

                    suiteACRoom = new SuiteACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);

                    ratePerSqFeet = suiteACRoom.getRatePerSqFeet();

                    tariffPerDay = suiteACRoom.calculateTariff(ratePerSqFeet);
                }

                System.out.println("Room Tariff per day is: " + tariffPerDay);
            }


        } while (userInput == 1 || userInput == 2 || userInput == 3);
    }
}
