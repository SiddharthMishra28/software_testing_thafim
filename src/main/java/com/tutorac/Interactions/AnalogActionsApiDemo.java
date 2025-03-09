package com.tutorac.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AnalogActionsApiDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://vistacommerce-qa.rf.gd/");
        WebElement clothesMenuOption = driver.findElement(By.xpath("//li[@id='category-3']/a"));
        Actions analog = new Actions(driver);
        analog.moveToElement(clothesMenuOption);
        analog.build().perform();
        Thread.sleep(3000);
        driver.quit();
    }

}
