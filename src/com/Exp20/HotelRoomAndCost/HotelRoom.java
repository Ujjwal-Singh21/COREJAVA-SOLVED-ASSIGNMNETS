package com.Exp20.HotelRoomAndCost;

public class HotelRoom {

    protected String hotelName;
    protected Integer numberOfSqFeet;
    protected Boolean hasTV;
    protected Boolean hasWifi;

    HotelRoom() {
        super();
    }

    HotelRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
        this.hotelName = hotelName;
        this.numberOfSqFeet = numberOfSqFeet;
        this.hasTV = hasTV;
        this.hasWifi = hasWifi;
    }

    //this method is overridden and redefined in every child class
    public Integer getRatePerSqFeet() {
        return 0;
    }

    //this method is overridden and available in every child class through inheritance
    public Integer calculateTariff(Integer ratePerSqFeet) {
        return numberOfSqFeet * ratePerSqFeet;
    }

}
