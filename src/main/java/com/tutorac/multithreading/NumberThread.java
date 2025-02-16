package com.tutorac.multithreading;

public class NumberThread extends Thread {

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Number Thread "+i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
