package com.tutorac.oop.exceptionhandling;

public class InvalidNameLengthException extends Exception {
    public InvalidNameLengthException(String message) {
        super("Name Should not be longer than 50 characters!");
    }
}
