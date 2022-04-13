package com.Exp18.InningsDelivery;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InningsBO inningsBO = new InningsBO();
        DeliveryBO deliveryBO = new DeliveryBO();

        //Innings
        System.out.println("Enter the number of innings ");
        int noOfInnings = Integer.parseInt(scanner.next());

        Innings[] inningsList = new Innings[noOfInnings];

        //Innings Details
        for (int i = 1; i <= inningsList.length; i++) {

            System.out.println("Enter innings " + i + " details");
            String inningsData = scanner.next();

            inningsList[i - 1] = inningsBO.createInnings(inningsData);
        }

        //Delivery
        System.out.println("Enter the number of deliveries ");
        int noOfDeliveries = Integer.parseInt(scanner.next());

        Delivery[] deliveryList = new Delivery[noOfDeliveries];

        for (int i = 1; i <= deliveryList.length; i++) {

            System.out.println("Enter delivery " + i + " details ");
            String deliveryData = scanner.next();

            deliveryList[i - 1] = deliveryBO.createDelivery(deliveryData, inningsList);
        }

        for (Delivery d : deliveryList) {
            System.out.println(d.getBatsman());
            System.out.println(d.getBowler());
            System.out.println(d.getInnings().getBattingTeam());
            System.out.println(d.getInningsNumber());
            System.out.println(d.getRuns());
            System.out.println(d.getDeliveryNumber());

        }
    }
}
