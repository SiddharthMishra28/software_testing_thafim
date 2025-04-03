package com.tutorac.utils;

import com.aventstack.extentreports.Status;
import com.tutorac.config.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class UIInteractionUtils {

    static WebDriver driver;

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

    public static void takeScreenshotForCurrentInstance(String screenshotPath) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File sourceFile = ts.getScreenshotAs(OutputType.FILE);
            File destinationFile = new File(screenshotPath);
            Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            Hooks.testInstance.log(Status.INFO, "Screenshot Taken and saved to "+destinationFile.getAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
