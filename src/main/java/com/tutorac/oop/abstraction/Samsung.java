package com.tutorac.oop.abstraction;

public class Samsung implements GSM {
    @Override
    public boolean registerNetwork(int frequency) {
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
}
