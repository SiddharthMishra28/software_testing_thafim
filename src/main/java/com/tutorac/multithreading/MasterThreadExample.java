package com.tutorac.multithreading;

public class MasterThreadExample {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            System.out.println("Emaling to id #"+i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
