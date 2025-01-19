package com.tutorac.examples;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("####### WELCOME TO SIMPLE CALCULATOR #######");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int num2 = scanner.nextInt();
        System.out.println("Please select operation : ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
//        String operation = scanner.nextLine();
        int option = scanner.nextInt();
        switch(option) {
            case 1:
                System.out.println("Sum is "+(num1+num2));
                break;

            case 2:
                System.out.println("Difference is "+(num1-num2));
                break;

            case 3:
                System.out.println("Product is "+(num1*num2));
                break;

            case 4:
                System.out.println("Quotient is "+(num1/num2));
                break;

            default:
                System.out.println("Invalid option selected!");
                break;
        }
    }
}
