package com.tutorac.oop.polymorphism;

public class Tablet extends Phone {

    int networkBandwidth;
    String app;

    @Override // GOOD PRACTICE
    // POLYMORPHIC BEHAVIOR
    public void makeCall(String app) {
        System.out.println("Dialing Via "+app+"...");
    }

    @Override
    // POLYMORPHIC BEHAVIOR
    public void makeCall(String app, String number) {
        if(this.networkBandwidth < 500) {
            System.out.println("Poor Network Conditions, Switching to Audio Call..");
        }else if(this.networkBandwidth >=500 && this.networkBandwidth < 1000) {
            System.out.println("Switching to Video call...");
        }else {
            System.out.println("Switching to HD video call...");
        }
    }

    public static void main(String[] args) {
//        Tablet ipad = new Tablet();
//        ipad.make = "APPLE";
//        ipad.model = "IPad Pro";
//        ipad.os = "iOS";
//        ipad.ramCapacity = 6;
//        ipad.storage = 256;
//        ipad.networkBandwidth = 1500;
//        ipad.app = "Whatsapp";
//
//        ipad.startPhone();
//        ipad.makeCall("Whatsapp", "9872315567");
//        ipad.stopPhone();

        Phone samsungGalaxyNote = new Tablet(); // CHILD OBJECT IS ASSIGNED TO A PARENT
        samsungGalaxyNote.make = "Samsung";
        samsungGalaxyNote.model = "Note";
        samsungGalaxyNote.os = "Android";
        samsungGalaxyNote.startPhone();
        samsungGalaxyNote.makeCall("55765576576");
        samsungGalaxyNote.stopPhone();

//        Tablet galaxyTab = new Phone(); // NOT ALLOWED

    }

}
