package com.tutorac.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    // html/body/main/header/nav/..../span - Absolute Xpath - NOT RECOMMENDED TO USE
    // //tagname[@attributeName='value']
    // //span[@class='hidden-sm-down']
    // RELATIVE REFERENCE OF A NEIGHBOUR - //div[@id='_desktop_user_info']/div/a/span
    // TEXT MATCH - //span[text()='Sign in']
    // PARTIAL TEXT MATCH / Contains Function - //a[contains(text(), 'All products')]
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://vistacommerce-qa.rf.gd/");
        driver.findElement(By.xpath("//a[contains(text(), 'All products')]")).click();
        Thread.sleep(3000);
        driver.quit();
    }

}
