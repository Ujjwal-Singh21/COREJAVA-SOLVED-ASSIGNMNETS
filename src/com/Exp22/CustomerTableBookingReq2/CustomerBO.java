package com.Exp22.CustomerTableBookingReq2;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerBO {

    //Method-1
    public static Customer createCustomer(String data) {

        String[] customerData = data.split(",");

        //getting separate inputs after split
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

        return new Customer(id, name, mobileNumber,
                birthDate, averageSpendAmount, totalAmount, dateEnrolled, rating);

    }

    //Method-2
    public static List<Customer> findCustomerWithName(List<Customer> customerList, String name) {

        List<Customer> customerList1 = new ArrayList<>();

        for (Customer c : customerList) {
            if (c.getName().equalsIgnoreCase(name)) {
                customerList1.add(c);
            }
        }
        return customerList1;
    }

    //Method-3
    public static List<Customer> findCustomerWithBirthDate(List<Customer> customerList, Date birthDate) {

        List<Customer> customerList2 = new ArrayList<>();

        for (Customer c : customerList) {
            if (c.getBirthDate().equals(birthDate)) {
                customerList2.add(c);
            }
        }

        return customerList2;
    }


    //Method-4
    public static List<Customer> findCustomerWithRating(List<Customer> customerList, Double rating) {

        List<Customer> customerList3 = new ArrayList<>();

        for (Customer c : customerList) {
            if (c.getRating() == rating) {
                customerList3.add(c);
            }
        }

        return customerList3;
    }

    //Method-5 for printing
    public static void printCustomerDetails(List<Customer> customerList) {

        System.out.println();
        System.out.println("Id " + " Name " + " MobileNumber " + " DateOfBirth "
                + " AverageSpentAmount " + " TotalAmount " + " DateEnrolled " + " Rating");

        for (Customer c : customerList) {
            System.out.println(c.getId() + " " + c.getName() + " " + c.getMobileNumber() + " " +
                    c.getBirthDate() + " " + c.getAverageSpendAmount() + " " +
                    c.getTotalAmount() + " " + c.getDateEnrolled() + " " + c.getRating());
        }
    }


}
