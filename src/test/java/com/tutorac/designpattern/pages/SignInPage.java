package com.tutorac.designpattern.pages;

import org.openqa.selenium.By;

public class SignInPage {
    public static By headerText = By.xpath("//h1[contains(text(), 'Log in')]");
    public static By signInEmailField = By.id("field-email");
    public static By signInPasswordField = By.id("field-password");

}
