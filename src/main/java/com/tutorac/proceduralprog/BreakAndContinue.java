package com.tutorac.proceduralprog;

public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i=0; i<200; i++) {
            if(i==190){
//                break;
                continue;
            }
            System.out.println("Looping for "+(i+1)+" time");
        }
    }
}
