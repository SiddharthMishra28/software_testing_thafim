package com.tutorac.collections.objectcollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank hdfcBank = new Bank();
        hdfcBank.setBankName("HDFC Bank");
        hdfcBank.setLocation("Central Hyderabad");
        hdfcBank.setFinInstraNumber("INFIN1234");
        System.out.println(hdfcBank);
        List<Customer> customerList = new ArrayList<>();
        BankUtilities utilities = new BankUtilities();
        boolean isRunning = true;
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("#### WELCOME TO HDFC BANK ####");
        while(isRunning) {
            System.out.println("Choose an option from below menu:");
            System.out.println("1. Create a new Customer");
            System.out.println("2. Edit Customer Data");
            System.out.println("3. Delete Customer");
            System.out.println("4. Create an Account");
            System.out.println("5. Edit Account Data");
            System.out.println("6. Delete Account");
            System.out.println("7. Create Transaction");
            System.out.println("8. Quit Program");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    Customer customer = utilities.createCustomer();
                    System.out.println("Customer :"+customer+" created!");
                    customerList.add(customer);
                    break;

                case 2:
                    // CUSTOMER DATA UPDATE LOGIC
                    break;

                case 3:
                    // DELETE CUSTOMER
                    break;

                case 4:
                    // CREATE ACCOUNT LOGIC
                    break;

                case 5:
                    // UPDATE ACCOUNT DATA LOGIC
                    break;

                case 6:
                    // DELETE ACCOUNT
                    break;

                case 7:
                    // CREATE TRANSACTION
                    break;

                case 8:
                    System.out.println("Bye!!");
                    isRunning = false;
            }
        }
    }
}
