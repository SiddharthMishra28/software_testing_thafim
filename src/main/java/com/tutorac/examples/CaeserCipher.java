package com.tutorac.examples;

import java.util.Scanner;

public class CaeserCipher {
    public static void main(String[] args) {
        System.out.println("############# WELCOME TO CAESER CIPHER #############");
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            int option;
            String userInput;
            int shift = 0;
            System.out.println("Choose and option from below menu : ");
            System.out.println("1. Encrypt a string.");
            System.out.println("2. Decrypt a string.");
            System.out.println("3. Quit Program");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter the string to encrypt : ");
                    userInput = sc.nextLine();
                    System.out.println("Enter the amount of shift : ");
                    shift = sc.nextInt();
                    sc.nextLine();
                    char[] stringChars = userInput.toCharArray();
                    for(int i=0; i<stringChars.length; i++) {
//                        ((char)(int)stringChars[i]+shift))
                        // IMPLEMENT BY NEXT SESSION!
                    }
                    // display the string
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("Enter a string to decrypt : ");
                    userInput = sc.nextLine();
                    break;

                case 3:
                    isRunning = false;
                    System.out.println("Bye...");
                    break;
            }
        }
    }
}
