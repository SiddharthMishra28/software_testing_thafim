package com.tutorac.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchElementTextDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://vistacommerce-qa.rf.gd/registration");
        String headerData = driver.findElement(By.tagName("h1")).getText();
        System.out.println(headerData);
        driver.quit();
    }
}
