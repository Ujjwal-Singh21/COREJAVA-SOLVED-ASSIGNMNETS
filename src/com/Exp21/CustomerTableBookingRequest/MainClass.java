package com.Exp21.CustomerTableBookingRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Customers: ");
        int numOfCustomers = Integer.parseInt(scanner.next());

        //Customer
        Customer[] customerList = new Customer[numOfCustomers];

        for (int i = 1; i <= customerList.length; i++) {

            System.out.println("Enter the details of Customer: " + i);
            String customerDataInput = scanner.next();

            String[] customerData = customerDataInput.split(",");

            //separate inputs after split
            Long id = Long.parseLong(customerData[0]);
            String name = customerData[1];
            String mobileNumber = customerData[2];

            Date birthDate = null;
            try {
                birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(customerData[3]);
            } catch (Exception e) {
                System.out.println("Handled Exception: " + e);
            }

            double averageSpendAmount = Double.parseDouble(customerData[4]);
            double totalAmount = Double.parseDouble(customerData[5]);

            Date dateEnrolled = null;
            try {
                dateEnrolled = new SimpleDateFormat("dd/MM/yyyy").parse(customerData[6]);
            } catch (Exception e) {
                System.out.println("Handled Exception: " + e);
            }

            double rating = Double.parseDouble(customerData[7]);

            customerList[i - 1] = new Customer(id, name, mobileNumber,
                    birthDate, averageSpendAmount, totalAmount, dateEnrolled, rating);

        }

        //printing
        int count = 0;
        for (Customer c : customerList) {
            ++count;
            System.out.println("\n");
            System.out.println("Details of Customer " + count);
            System.out.println(c);
        }

        //checking if 2 customers are equal
        System.out.println("\n");
        boolean result = customerList[0].equals(customerList[1]);

        if (result) {
            System.out.println("Customer 1 is same as Customer 2");
        } else {
            System.out.println("Customer 1 and Customer 2 are different");
        }
    }
}
