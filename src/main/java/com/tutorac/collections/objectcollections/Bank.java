package com.tutorac.collections.objectcollections;

import java.util.List;

public class Bank {

    private String bankName;
    private String finInstraNumber;
    private String location;
    private List<Customer> customers; // I to Many

    // GETTERS AND SETTERS

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getFinInstraNumber() {
        return finInstraNumber;
    }

    public void setFinInstraNumber(String finInstraNumber) {
        this.finInstraNumber = finInstraNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
