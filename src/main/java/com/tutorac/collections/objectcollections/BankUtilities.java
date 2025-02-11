package com.tutorac.collections.objectcollections;

import java.util.Scanner;

public class BankUtilities {

    Scanner sc = new Scanner(System.in);

    public Customer createCustomer() {
//        "\n"
        Customer customer = new Customer();
        System.out.println("Enter customer id : ");
        int id = sc.nextInt();
        customer.setId(id);
        System.out.println("Enter customer name : ");
        sc.nextLine();
        String name = sc.nextLine();
        customer.setName(name);
        System.out.println("Enter customer Aadhaar : ");
        String adhaar = sc.nextLine();
        customer.setAdhaar(adhaar);
        System.out.println("Enter customer PAN : ");
        String pan = sc.nextLine();
        customer.setPan(pan);
        System.out.println("Enter customer Email : ");
        String email = sc.nextLine();
        customer.setEmail(email);
        System.out.println("Enter customer Phone : ");
        String phone = sc.nextLine();
        customer.setPhone(phone);
        return customer;
    }
}
