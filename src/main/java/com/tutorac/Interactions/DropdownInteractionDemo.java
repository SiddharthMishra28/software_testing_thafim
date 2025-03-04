package com.tutorac.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownInteractionDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dezlearn.com/webtable-example/");
        WebElement dropdown = driver.findElement(By.xpath("//table/tbody/tr[2]/td[5]/select"));
        Select dropdown1 = new Select(dropdown);
        dropdown1.selectByVisibleText("Sports");
        Thread.sleep(3000);
        driver.quit();
    }
}
