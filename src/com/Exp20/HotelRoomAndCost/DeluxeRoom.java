package com.Exp20.HotelRoomAndCost;

public class DeluxeRoom extends HotelRoom {

    protected Integer ratePerSqFeet;

    DeluxeRoom() {
        super();
    }

    DeluxeRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        this.ratePerSqFeet = 10;
    }

    @Override
    public Integer getRatePerSqFeet() {

        if (hasWifi) {
            return ratePerSqFeet + 2;
        } else {
            return ratePerSqFeet;
        }
    }
}
