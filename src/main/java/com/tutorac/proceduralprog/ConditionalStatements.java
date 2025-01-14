package com.tutorac.proceduralprog;

public class ConditionalStatements {
    public static void main(String[] args) {
        // MAKE DECISIONS BASED ON DATA!
        // if(<CONDITION>) {
        // ..... Executed on true
        // }

        // if statement
//        int billAmount = 11000;
//        if(billAmount > 10000) {
//            System.out.println("5%");
//        }
//        System.out.println("Completed!");

        // if-else
//        int billAmount = 8000;
//        if(billAmount > 10000) {
//            System.out.println("Discount : 5%");
//        }else {
//            System.out.println("No discount applicable");
//        }

//        NESTED IF-ELSE
        int billAmount = 12000;
        char customerType = 'S';
        if(billAmount > 10000) {
            if(customerType == 'G') {
                System.out.println("Discount : 10%");
            }else {
                System.out.println("Discount : 5%");
            }
        }else {
            System.out.println("No discount!");
        }
    }
}
