package com.tutorac.collections.objectcollections;

public class Transaction {
    private int debitedAmount;
    private int creditedAmount;
    private int debitedAccountNumber;
    private int creditedAccountNumber;

    // GETTERS AND SETTERS

    public int getDebitedAmount() {
        return debitedAmount;
    }

    public void setDebitedAmount(int debitedAmount) {
        this.debitedAmount = debitedAmount;
    }

    public int getCreditedAmount() {
        return creditedAmount;
    }

    public void setCreditedAmount(int creditedAmount) {
        this.creditedAmount = creditedAmount;
    }

    public int getDebitedAccountNumber() {
        return debitedAccountNumber;
    }

    public void setDebitedAccountNumber(int debitedAccountNumber) {
        this.debitedAccountNumber = debitedAccountNumber;
    }

    public int getCreditedAccountNumber() {
        return creditedAccountNumber;
    }

    public void setCreditedAccountNumber(int creditedAccountNumber) {
        this.creditedAccountNumber = creditedAccountNumber;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "debitedAmount=" + debitedAmount +
                ", creditedAmount=" + creditedAmount +
                ", debitedAccountNumber=" + debitedAccountNumber +
                ", creditedAccountNumber=" + creditedAccountNumber +
                '}';
    }
}
