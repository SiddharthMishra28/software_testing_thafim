package com.tutorac.oop.abstraction;

// PARTIAL ABSTRACTION
// A MIX OF BOTH PROPERTIES AND METHODS
// TO BE RE-USED IN YOUT CODE WITH CONCRETE CLASSES
public abstract class DataModel {
    String hostName;
    String port;
    String userId;
    String password;

    public void connect() {
        // CONNECTION LOGIC
        System.out.println("Connected...");
    }

    public void queryDb(String query) {
        System.out.println("Querying with "+query);
        System.out.println("Results...");
    }

    public void closeConnection() {
        System.out.println("Connection closed!..");
    }

}
