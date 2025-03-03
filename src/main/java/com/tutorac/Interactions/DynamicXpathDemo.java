package com.tutorac.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathDemo {
    public static void main(String[] args) {
        // INDEX BASED XPATH - //table[@class='tg']/tbody/tr[rowIndex]
        // XPATH - INDEXES START FROM 1 and NOT 0
        // //table[@class='tg']/tbody/tr[1]/th[2]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dezlearn.com/webtable-example/");
        String colValue = driver.findElement(By.xpath("//table[@class='tg']/tbody/tr[1]/th[2]")).getText();
        System.out.println(colValue);
    }
}
