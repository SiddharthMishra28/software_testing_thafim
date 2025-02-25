package com.tutorac.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndTypeDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://vistacommerce-qa.rf.gd/registration");
        // 8 Types of Locators
        // id
        // name
        // className
        // linktext
        // partialLinktext
        // xpath
        // cssPath
        // tagName
        driver.findElement(By.id("field-id_gender-1")).click();
        driver.findElement(By.name("firstname")).sendKeys("sid");
        driver.findElement(By.name("lastname")).sendKeys("mishra");
        Thread.sleep(3000);
        driver.quit();
    }
}
