package com.tutorac.multithreading;

public class CharacterThread extends Thread {
    @Override
    public void run() {
        for(char c='A'; c<='J'; c++){
            System.out.println("Character Thread : "+c);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
