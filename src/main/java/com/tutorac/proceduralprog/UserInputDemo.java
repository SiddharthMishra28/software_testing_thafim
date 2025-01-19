package com.tutorac.proceduralprog;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name ?");
        String name = scanner.nextLine();
        System.out.println("Hello there, "+name);
        System.out.println("How old are you ?");
        int age = scanner.nextInt(); // MORE CONCEPTS TO REVISIT HERE!
        if(age > 18) {
            System.out.println(name+" you are elligible to vote!");
        }else {
            System.out.println(name+" you need to be more than 18 years to vote");
        }
    }
}
