package com.Exp21.CustomerTableBookingRequest;

import java.util.Date;

public class Customer {

    private Long id;
    private String name;
    private String mobileNumber;
    private Date birthDate;
    private double averageSpendAmount;
    private double totalAmount;
    private Date dateEnrolled;
    private double rating;

    Customer() {
        super();
    }

    Customer(Long id, String name, String mobileNumber, Date birthDate,
             double averageSpendAmount, double totalAmount, Date dateEnrolled, double rating) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.birthDate = birthDate;
        this.averageSpendAmount = averageSpendAmount;
        this.totalAmount = totalAmount;
        this.dateEnrolled = dateEnrolled;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public double getAverageSpendAmount() {
        return averageSpendAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public Date getDateEnrolled() {
        return dateEnrolled;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object obj) {

        Customer customer = (Customer) obj;

        if ((customer.getBirthDate().equals(this.getBirthDate()))
                && (customer.getName().equalsIgnoreCase(this.getName()))
                && (customer.getMobileNumber().equalsIgnoreCase(this.getMobileNumber()))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Id: " + id + "\n" + "\n" +
                "Name: " + name + "\n" + "\n" +
                "Mobile Number: " + mobileNumber + "\n" + "\n" +
                "Birth Date: " + birthDate + "\n" + "\n" +
                "Average Spend Amount: " + averageSpendAmount + "\n" + "\n" +
                "Total Amount: " + totalAmount + "\n" + "\n" +
                "Date Enrolled: " + dateEnrolled + "\n" + "\n" +
                "Rating: " + rating;
    }
}
