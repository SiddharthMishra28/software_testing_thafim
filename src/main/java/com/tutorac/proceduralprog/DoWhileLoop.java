package com.tutorac.proceduralprog;

public class DoWhileLoop {
    public static void main(String[] args) {
        // do {
        //  ..... ATLEAST ONCE EXECUTED
        //  .....
        // }while(<CONDITION>)
        int i=15;
        do {
            System.out.println("I will run atleast once. Running for "+(i+1)+" time");
            i++;
        }while(i<10);
    }
}
