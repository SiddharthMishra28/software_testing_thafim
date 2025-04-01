package com.tutorac.pages;

import org.openqa.selenium.By;

public class LoginPage {
    public static By email = By.id("field-email");
    public static By password = By.id("field-password");
    public static By signInButton = By.id("submit-login");
    public static By createNewAccountLink = By.xpath("//a[contains(text(), 'Create one')]");

}
