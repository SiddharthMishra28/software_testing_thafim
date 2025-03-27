package com.tutorac.designpattern.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UiAutomationUtils {

    public WebDriver driver;

    // DEPENDENCY on EXTERNAL WEBDRIVER INSTANCE
    public UiAutomationUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate(String url) {
        driver.get(url);
    }

    public void clickElement(By element) {
        driver.findElement(element).click();
    }

    public void type(By element, String keystrokes) {
        driver.findElement(element).sendKeys(keystrokes);
    }
}
