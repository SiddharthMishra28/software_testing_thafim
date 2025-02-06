package com.tutorac.oop.encapsulation;

public class Account {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Sid";
        person.email = "sid@email.com";
        person.setPassword("Secret");
    }
}
