package com.example.p3;

public class Locatie {

    private String naam;
    private String info;
    private int bezoekers;

    public Locatie(String naam, String info, int bezoekers ) {
        this.naam = naam;
        this.info = info;
        this.bezoekers = bezoekers;
    }

    public static String getNaam() {
        return naam;
    }

    public static String getInfo() {
        return info;
    }

    public int getBezoekers() {
        return bezoekers;
    }

}
