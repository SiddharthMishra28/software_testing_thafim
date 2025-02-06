package com.tutorac.oop.composition;

public class Vehicle {

    private String make;
    private String model;
    private String type;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return this.make;
    }

    public String getType() {
        return this.type;
    }

    public void startVehicle() {
        System.out.println("Vehicle "+this.model+" Started..");
    }

    public void stopVehicle() {
        System.out.println("Vehicle "+this.model+" Stopped..");
    }
}
