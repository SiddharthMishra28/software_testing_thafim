package com.tutorac.oop.composition;

public class RaceTrack {
    public static void main(String[] args) {
        Engine myEngine = new Engine();
        myEngine.setBrand("BMW");
        myEngine.setEngineCapacityInCc(1100);
        myEngine.setMaxTorque(165.00f);

        Transmission myTransmission = new Transmission();
        myTransmission.setType("CVT");
        myTransmission.setNumGears(4);

        Car santro = new Car();
        santro.setMake("Hyundai");
        santro.setModel("Santro");
        santro.setColor("Beige");
        santro.setNumHeadlights(4);
        santro.setFiatEngine(myEngine);
        santro.setAmtTransmission(myTransmission);
        santro.startVehicle();
        santro.stopVehicle();
    }
}
