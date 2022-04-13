package com.Exp17.TeamAndMatchDetails;

public class Player {

    private String name;
    private String country;
    private String skill;

    Player() {
        super();
    }

    Player(String name, String country, String skill) {
        this.name = name;
        this.country = country;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getSkill() {
        return skill;
    }
}
