package com.tutorac.oop.exceptionhandling;

public class ExceptionHandlineDemo {
    public static void main(String[] args) {
        int a = 0;
        int b = 12;
        // try catch
        // try {
        // ....
        // ....
        // } catch(Exception e) {
        // ....
        // }
        try {
            int quotient = b/a;
            System.out.println(quotient);
        }catch (Exception e) {
            System.out.println("Arithmetically Undefined! When something is divided by 0");
        }
    }
}
