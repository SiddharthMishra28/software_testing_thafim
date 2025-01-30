package com.tutorac.oop.polymorphism;

public class SurfaceDevice extends Tablet {

    public void makeCall(String app, String number, String simCard) {
        System.out.println("Making Call to "+number+" using "+app+" with sim "+simCard);
    }

    public static void main(String[] args) {
//        Phone p = new SurfaceDevice();
//        p.makeCall("sadad", "dsad", "adsad");
    }
}
