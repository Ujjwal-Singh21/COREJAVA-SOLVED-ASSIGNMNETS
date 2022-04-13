package com.Exp18.InningsDelivery;

public class DeliveryBO {

    public Delivery createDelivery(String data, Innings[] inningsList) {

        String[] deliveryData = data.split(",");

        Long deliveryNumber = Long.parseLong(deliveryData[0]);
        String batsman = deliveryData[1];
        String bowler = deliveryData[2];
        Long runs = Long.parseLong(deliveryData[3]);
        Long inningsNumber = Long.parseLong(deliveryData[4]);

        Innings innings = null;

        for (Innings i : inningsList) {
            if (i.getBattingTeam().equalsIgnoreCase(batsman)) {
                innings = i;
            }
        }

        return new Delivery(deliveryNumber, batsman, bowler, runs, inningsNumber, innings);
    }











//
//    public String findInningsNumber(Innings[] inningsList, long deliveryNumber) {
//
//    }
}
