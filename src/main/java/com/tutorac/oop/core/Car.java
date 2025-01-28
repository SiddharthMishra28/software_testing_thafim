package com.tutorac.oop.core;

// BLUEPRINT OF A CAR
public class Car {
    String brand;
    String model;
    int numWheels;
    String engineType;

    public static void main(String[] args) {
        // INSTANCE OF A CAR
        Car tataNexon = new Car(); // new keyword is used to create an object instance
                                   // also to reserve memory for it!
        tataNexon.brand = "TATA";
        tataNexon.model = "Nexon";
        tataNexon.numWheels = 4;
        tataNexon.engineType = "Diesel";

        // INSTANCE OF A CAR
        Car thar = new Car();
        thar.brand = "Mahindra";
        thar.model = "Thar";
        thar.numWheels = 4;
        thar.engineType = "Petrol";
    }
}
