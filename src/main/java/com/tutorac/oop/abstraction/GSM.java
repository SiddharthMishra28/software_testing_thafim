package com.tutorac.oop.abstraction;

/**
 * Standard protocol used to communicate between handheld mobile devices
 * includes voice and video transmission
 */
// 100% ABSTRACTION / COMPLETE ABSTRACTION
public interface GSM {

    boolean registerNetwork(int frequency);

    String determineNetworkType();

    String transmitData(String[] data);

    String receiveData();
}
