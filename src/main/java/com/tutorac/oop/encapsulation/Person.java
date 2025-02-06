package com.tutorac.oop.encapsulation;

public class Person {

    // ACCESS MODIFIERS OR ACCESS SPECIFIERS
    // 4 types
    // public
    // protected
    // private
    // default - The variable value is visible within the same package scope.
    String name; // default
    public String email; // public scope - Visible inside entire project
    protected String userId; // protected scope - available inside the same class or its child classes
    private String password; // private scope - available only inside same class
    private String phone;

    // GETTER AND SETTERS
    // Dedicated methods to getData and setData
    // within a class or its objects
    public void setPassword(String password) {
        if(password.length() >= 8 && password.contains("@")) {
            this.password = password;
        }else {
            System.out.println("Invalid Password. Should be 8 charactetrs in length!");
        }
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword(){
        return this.password;
    }

    public String getPhone() {
        return this.phone;
    }
}
