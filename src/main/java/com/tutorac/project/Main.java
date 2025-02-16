package com.tutorac.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        boolean isRunning = true;
        System.out.println("####### WELCOME TO STUDENT MANAGEMENT SYSTEM #######");
        while(isRunning) {
            System.out.println("Choose an option from below menu : ");
            System.out.println("1. Create a Student");
            System.out.println("2. Read Student Data");
            System.out.println("3. Update Student Data");
            System.out.println("4. Delete Student Data");
            System.out.println("5. Quit Program");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("CREATED STUDENT LOGIC");
                    break;

                case 2:
                    System.out.println("READ STUDENT LOGIC");
                    break;

                case 3:
                    System.out.println("UPDATE STUDENT LOGIC");
                    break;

                case 4:
                    System.out.println("DELETE STUDENT LOGIC");
                    break;

                case 5:
                    System.out.println("Bye!!");
                    isRunning = false;
            }
        }
    }
}
