package com.tutorac.multithreading;

public class StringThread implements Runnable {
    @Override
    public void run() {
        String[] myData = new String[]{"sid","thafim", "shankar", "vedant", "bhabani"};
        for(int i=0; i<myData.length; i++){
            System.out.println("String Thread : "+myData[i]);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
