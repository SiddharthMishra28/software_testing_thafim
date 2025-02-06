package com.tutorac.oop.composition;

// IS-A
public class Car extends Vehicle {

    private String color;
    private int seats;
    private int numHeadlights;
    private Engine fiatEngine; // HAS-A Relationship
    private Transmission amtTransmission; // HAS-A

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getNumHeadlights() {
        return numHeadlights;
    }

    public void setNumHeadlights(int numHeadlights) {
        this.numHeadlights = numHeadlights;
    }

    public Engine getFiatEngine() {
        return this.fiatEngine;
    }

    public void setFiatEngine(Engine fiatEngine) {
        this.fiatEngine = fiatEngine;
    }

    public Transmission getAmtTransmission() {
        return this.amtTransmission;
    }

    public void setAmtTransmission(Transmission amtTransmission) {
        this.amtTransmission = amtTransmission;
    }
}
