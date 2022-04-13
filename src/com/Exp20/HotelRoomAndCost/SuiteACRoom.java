package com.Exp20.HotelRoomAndCost;

public class SuiteACRoom extends HotelRoom {

    protected Integer ratePerSqFeet;

    SuiteACRoom() {
        super();
    }

    SuiteACRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        this.ratePerSqFeet = 15;
    }

    public Integer getRatePerSqFeet() {

        if (hasWifi) {
            return ratePerSqFeet + 2;
        } else {
            return ratePerSqFeet;
        }
    }
}
