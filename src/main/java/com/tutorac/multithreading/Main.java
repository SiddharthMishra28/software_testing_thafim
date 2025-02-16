package com.tutorac.multithreading;

public class Main {
    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        CharacterThread characterThread = new CharacterThread();
        StringThread stringThread = new StringThread();

        numberThread.start();
        characterThread.start();
        stringThread.run();


        try {
            numberThread.join();
            characterThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Execution Completed!!");
    }
}
