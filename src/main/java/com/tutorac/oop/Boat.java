package com.tutorac.oop;

public class Boat {
    String type;
    int sizeInFeet;
    String motorType;
    int occupantsAllowed;
    String fuelType; // DIESEL, PETROL

    public void startBoat() {
        System.out.println(this.type+" boat started!");
    }

    public void stopBoat() {
        System.out.println(this.type+" stopped!");
    }

    public int maxTravelDistance(int fuelQuantity) {
        // DIESEL - 7KM / L
        // PETROL - 5KM / L
        if(this.fuelType.equalsIgnoreCase("PETROL")) {
            return fuelQuantity * 5;
        }else if(this.fuelType.equalsIgnoreCase("DIESEL")) {
            return fuelQuantity * 7;
        }
        return 0;
    }

    public static void main(String[] args) {
        Boat miniSail = new Boat();
        miniSail.type = "MiniSail";
        miniSail.sizeInFeet = 9;
        miniSail.motorType = "Yamaha";
        miniSail.occupantsAllowed = 5;
        miniSail.fuelType = "DIESEL";
        miniSail.startBoat();
        System.out.println(miniSail.maxTravelDistance(12));;
        miniSail.stopBoat();
    }
}
