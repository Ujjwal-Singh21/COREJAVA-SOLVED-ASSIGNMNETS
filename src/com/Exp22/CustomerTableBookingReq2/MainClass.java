package com.Exp22.CustomerTableBookingReq2;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Customers: ");
        int numOfCustomers = Integer.parseInt(scanner.next());

        //Customer
        Customer[] customerList = new Customer[numOfCustomers];

        for (int i = 1; i <= customerList.length; i++) {
            System.out.println("Enter Customer " + i + " details");
            String customerInputData = scanner.next();

            customerList[i - 1] = CustomerBO.createCustomer(customerInputData);

        }

        //Menu
        int userChoice;

        do {
            System.out.println("\n");
            System.out.println("Search Type: ");
            System.out.println("1) By Name ");
            System.out.println("2) By BirthDate ");
            System.out.println("3) By Rating ");
            System.out.println("4) Exit ");
            System.out.println();
            System.out.println("Enter Your Choice: ");
            System.out.println();

            userChoice = Integer.parseInt(scanner.next());

            switch (userChoice) {
                case 1 -> {
                    System.out.println("Enter the name of the customer to be searched: ");
                    String customerName = scanner.next();

                    List<Customer> customerList1 =
                            CustomerBO.findCustomerWithName(Arrays.asList(customerList), customerName);

                    if (customerList1.isEmpty()) {
                        System.out.println("No customers found with the given name");
                    } else {
                        CustomerBO.printCustomerDetails(customerList1);
                    }
                }

                case 2 -> {
                    System.out.println("Enter the birth date of the customer to be searched: ");
                    Date birthDate = null;
                    try {
                        birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.next());
                    } catch (Exception e) {
                        System.out.println("Handled Exception: " + e);
                    }

                    List<Customer> customerList2 =
                            CustomerBO.findCustomerWithBirthDate(Arrays.asList(customerList), birthDate);

                    if (customerList2.isEmpty()) {
                        System.out.println("No customers found with the given birth date");
                    } else {
                        CustomerBO.printCustomerDetails(customerList2);
                    }
                }

                case 3 -> {
                    System.out.println("Enter the rating of the customer to be searched: ");
                    double rating = Double.parseDouble(scanner.next());

                    List<Customer> customerList3 =
                            CustomerBO.findCustomerWithRating(Arrays.asList(customerList), rating);

                    if (customerList3.isEmpty()) {
                        System.out.println("No customers found with the given rating");
                    } else {
                        CustomerBO.printCustomerDetails(customerList3);
                    }
                }

                case 4 -> System.exit(0);

                default -> System.out.println("Invalid Case");
            }


        } while (userChoice == 1 || userChoice == 2 || userChoice == 3);
    }
}
