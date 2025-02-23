package com.tutorac.Interactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchDemo {
    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new SidsBrowserDriver();
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.quit();
    }
}
