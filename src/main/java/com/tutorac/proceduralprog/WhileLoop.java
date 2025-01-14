package com.tutorac.proceduralprog;

public class WhileLoop {
    public static void main(String[] args) {
        // <INITIALIZATION>
        // while(<CONDITION>){
        // .....
        // .....
        // <INCREMENT / DECREMENT>
        // }
        int i=0;
        while(i<10) {
            System.out.println("Loop continuing for "+(i+1)+" time");
            i++;
        }
    }
}
