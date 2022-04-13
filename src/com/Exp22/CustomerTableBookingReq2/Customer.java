package com.Exp22.CustomerTableBookingReq2;

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
}
