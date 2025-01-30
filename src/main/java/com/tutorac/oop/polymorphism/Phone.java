package com.tutorac.oop.polymorphism;

public class Phone {

    String make;
    String os;
    String model;
    int ramCapacity;
    int storage;
    String processor;


    public void startPhone() {
        if(this.os.equalsIgnoreCase("ANDROID")) {
            System.out.println("Welcome to Android..");
        }else {
            System.out.println("Welcome to Apple Ecosystem");
        }
    }

    public void makeCall(String number) {
        System.out.println("Dialing to : "+number);
    }

    // OVERLOADED METHOD
    // POLYMORPHIC BEHAVIOR
    public void makeCall(String number, String networytype) {
        if(networytype.equalsIgnoreCase("3G")) {
            System.out.println("Dialing Audio Call to : "+number);
        }else if(networytype.equalsIgnoreCase("4G")) {
            System.out.println("Dialing Video Call to : "+number);
        }
    }

    public void stopPhone() {
        System.out.println("Turning off! Bye!");
    }
    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.make = "Apple";
        iphone.os = "iOS";
        iphone.model = "IPhone 16";
        iphone.processor = "Apple A13";
        iphone.storage = 128;
        iphone.ramCapacity = 6;

        iphone.startPhone();

        iphone.makeCall("9872635462", "4G");
        iphone.stopPhone();
    }
}
