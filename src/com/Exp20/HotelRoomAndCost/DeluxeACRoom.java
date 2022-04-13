package com.Exp20.HotelRoomAndCost;

public class DeluxeACRoom extends DeluxeRoom {

    protected Integer ratePerSqFeet;

    DeluxeACRoom() {
        super();
    }

    DeluxeACRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        this.ratePerSqFeet = 12;
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
