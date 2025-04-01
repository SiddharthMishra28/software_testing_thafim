package com.tutorac.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UIInteractionUtils {

    WebDriver driver;

    public UIInteractionUtils(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * <p>Navigates to provided URL in configured browser</p>
     * @param url
     */
    public void navigate(String url) {
        driver.get(url);
    }

    /**
     * <p>Types provided text into configured Input Element</p>
     * @param element
     * @param keyStrokes
     */
    public void type(By element, String keyStrokes) {
        driver.findElement(element).sendKeys(keyStrokes);
    }

    /**
     * <p>Clicks on provided element</p>
     * @param element
     */
    public void clickElement(By element) {
        driver.findElement(element).click();
    }
}
