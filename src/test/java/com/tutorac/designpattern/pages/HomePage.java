package com.tutorac.designpattern.pages;

import org.openqa.selenium.By;

public class HomePage {
    public static By contactUsLink = By.xpath("//a[text()='Contact us']");
    public static By signInLink = By.xpath("//span[text()='Sign in']");
    public static By searchBox = By.name("s");
}
