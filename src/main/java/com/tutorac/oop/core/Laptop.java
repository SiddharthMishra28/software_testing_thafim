package com.tutorac.oop.core;

public class Laptop {

    String make;
    String model;
    String processor;
    String os;
    int ram;
    int storage;
    float screenSize;

    // METHODS or FUNCTIONS
    // <ACCEES_SPECIFIER> <RETURN_TYPE / VOID> <NAME_OF_METHOD>(...<ARGUMENTS / OPTIONAL>){
    // ....
    // ....
    // return
    // }
    public void switchOnLaptop() {
        System.out.println("Powering on...");
        System.out.println("Welcome to "+this.make+" "+this.model);
    }

    public void shutdownLaptop() {
        System.out.println("Device "+this.make+" "+this.model+" shutting down!");
    }

    public void navigateToWebsite(String link) {
        if(this.os.equalsIgnoreCase("WINDOWS")) {
            System.out.println("Navigating to website : "+link+" using Google Chrome");
        }else if(this.os.equalsIgnoreCase("MAC")) {
            System.out.println("Navigating to website : "+link+" using Apple Safari");
        }else {
            System.out.println("Navigating to website : "+link);
        }
    }

    public int calculate(int a, int b, char operator) {
        if(operator == '+'){
            return (a+b);
        }else if(operator == '-'){
            return (a-b);
        }else if(operator == 'X') {
            return (a*b);
        }else {
            return (a/b);
        }
    }

    public static void main(String[] args) {
        Laptop lenovo = new Laptop();
        lenovo.make = "Lenovo";
        lenovo.model = "Thinkpad";
        lenovo.ram = 8;
        lenovo.processor = "Core i7";
        lenovo.os = "WINDOWS";
        lenovo.switchOnLaptop();
        lenovo.navigateToWebsite("https://www.gmail.com");
        int result1 = lenovo.calculate(135, 5, '+');
        System.out.println(result1);
        lenovo.shutdownLaptop();

        Laptop macBook = new Laptop();
        macBook.make = "Apple";
        macBook.model = "Macbook Air";
        macBook.ram = 16;
        macBook.processor = "A15";
        macBook.os = "MAC";
        macBook.switchOnLaptop();
        macBook.navigateToWebsite("https://www.outlook.com");
        System.out.println(macBook.calculate(20,6,'X'));
        macBook.shutdownLaptop();
    }
}
