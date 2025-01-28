package com.tutorac.oop.inheritance;

public class Animal {
    String species;
    String scientificName;
    String traditionalName;
    int numLegs;
    String habitat;

    public void makeSound() {
        System.out.println("Animal "+traditionalName+" is making sound...");
    }

    public static void main(String[] args) {
        Animal crocoDile = new Animal();
        crocoDile.species = "Reptiles";
        crocoDile.scientificName = "Crocodylidae";
        crocoDile.traditionalName = "Crocodile";
        crocoDile.numLegs = 4;
        crocoDile.habitat = "Swampy Forest";

        crocoDile.makeSound();
    }
}
