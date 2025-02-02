package com.tutorac.oop.abstraction;

public class Micromax implements GSM {

    String microChip = "Broadcom";

    @Override
    public boolean registerNetwork(int frequency) {
        if(this.microChip.equalsIgnoreCase("BROADCOM")) {
            return true;
        }
        return false;
    }

    @Override
    public String determineNetworkType() {
        return null;
    }

    @Override
    public String transmitData(String[] data) {
        return null;
    }

    @Override
    public String receiveData() {
        return null;
    }

    public static void main(String[] args) {
        GSM myPhone = new Micromax();
        myPhone.registerNetwork(4500);
        myPhone.determineNetworkType();
        myPhone.transmitData(new String[]{"Hello, there!"});
    }
}
