package com.tutorac.proceduralprog;

public class SwitchCase {
    public static void main(String[] args) {
        // switch(<COMPARISON>) {
        // ...
        //   case <VALUE>:
        //      .....
        //      break;
        //   case <VALUE>:
        //      .....
        //      break;
        //   case <VALUE>:
        //      .....
        //      break;
        //  }
        System.out.println("Choose an option from a menu:");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Option 4");
        System.out.println("5. Option 5");
        int option = 1; // User Generated
        switch(option) {
            case 1:
                System.out.println("Option 1 chosen!");
                break;
            case 2:
                System.out.println("Option 2 chosen!");
                break;

            case 3:
                System.out.println("Option 3 chosen!");
                break;

            default:
                System.out.println("Please choose correct option from menu");
                break;
        }
    }
}
