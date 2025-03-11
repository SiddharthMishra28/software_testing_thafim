package com.tutorac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrowserLaunchTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.quit();
    }
}
