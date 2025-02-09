package com.tutorac.oop.exceptionhandling;

public class Sample {
    public static void main(String[] args) throws InvalidNameLengthException {
        String username = "jshdkhkjdhkhkkhdhdhdkjdhkdkajshdkjsahdkjasdkjhdkjhdkhdhddhkdhkjdhk";
        if(username.length() > 50) {
            throw new InvalidNameLengthException("jsladjsjdkkjdsak");
        }
    }
}
