package com.Exp18.InningsDelivery;

public class Delivery {

    private Long deliveryNumber;
    private String batsman;
    private String bowler;
    private Long runs;
    private Long inningsNumber;
    private Innings innings;

    public Delivery() {
    }

    public Delivery(Long deliveryNumber, String batsman, String bowler, Long runs, Long inningsNumber, Innings innings) {
        this.deliveryNumber = deliveryNumber;
        this.batsman = batsman;
        this.bowler = bowler;
        this.runs = runs;
        this.inningsNumber = inningsNumber;
        this.innings = innings;
    }

    public Long getDeliveryNumber() {
        return deliveryNumber;
    }

    public String getBatsman() {
        return batsman;
    }

    public String getBowler() {
        return bowler;
    }

    public Long getRuns() {
        return runs;
    }

    public Long getInningsNumber() {
        return inningsNumber;
    }

    public Innings getInnings() {
        return innings;
    }
}
