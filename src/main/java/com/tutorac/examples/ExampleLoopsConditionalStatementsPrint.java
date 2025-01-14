package com.tutorac.examples;

import java.util.Scanner;

public class ExampleLoopsConditionalStatementsPrint {
    public static void main(String[] args) {
        // KBC - Kaun Banega Crorepati!
        // The program should show next question till the user
        // answers correct answers for all previous questions
        // if the answer is incorrect
        // the program should show appropriate output
        // and should terminate

        // -----------------------------------------
        // step1 - loop until user gives correct answer
        // step2 - within loop check if answer is correct!
        // step3 - show next question only if loop is continuing
        // step4 - terminate
        Scanner sc = new Scanner(System.in);
        boolean isCorrect = true;
        int i=0;
        int optionSelected;
        while(isCorrect) {
            System.out.println("Question no "+(i+1));
            System.out.println("option 1 - correct answer");
            System.out.println("option 2 - wrong answer");
            optionSelected = sc.nextInt();
            sc.nextLine(); // later part
            if(optionSelected == 1){
                System.out.println("Correct! Proceeding to next Question!");
            }else if(optionSelected == 2) {
                System.out.println("Unfortunately its the wrong answer!");
                isCorrect = false;
            }
            i++;
        }
    }
}
