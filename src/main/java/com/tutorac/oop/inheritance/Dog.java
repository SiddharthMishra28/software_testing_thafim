package com.tutorac.oop.inheritance;

// IS-A Relationship
public class Dog extends Animal {
    String type;
    String color;

    public void walk() {
        System.out.println("Dog "+type+" is walking...");
    }

    public void run() {
        System.out.println("Dog "+type+" is running...");
    }

    public static void main(String[] args) {
        Dog pomerian = new Dog();
        pomerian.type = "Domestic";
        pomerian.color = "White";
        pomerian.walk();
        pomerian.habitat = "Household";
        pomerian.species = "Domestic";
        pomerian.scientificName = "Homo Sapiens";
        pomerian.traditionalName = "Pomerian";
        pomerian.makeSound();
    }
}
