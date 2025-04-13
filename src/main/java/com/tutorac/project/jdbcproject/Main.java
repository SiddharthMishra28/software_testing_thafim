package com.tutorac.project.jdbcproject;

import com.tutorac.project.jdbcproject.models.Product;
import com.tutorac.project.jdbcproject.service.ProductService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductService service = new ProductService();
        boolean isRunning = true;
        int option = 0;
        System.out.println("WELCOME TO ECOMMERCE STORE");
        while(isRunning) {
            System.out.println("Select an option from below menu:");
            System.out.println("1. Create a product");
            System.out.println("2. quit");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Enter Product Name : ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Product Description : ");
                    String desc = scanner.nextLine();
                    System.out.println("Enter Product Price : ");
                    Double price = scanner.nextDouble();
                    System.out.println("Enter Stock Quantity : ");
                    int stockQuantity = scanner.nextInt();
                    Product p = new Product(name, desc, price, stockQuantity);
                    service.createProduct(p);
                    break;

                case 2:
                    System.out.println("Bye...");
                    isRunning = false;
                    break;
            }
        }
    }
}
