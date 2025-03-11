package com.tutorac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationsTest {

    public WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
    }

    @BeforeGroups(groups = {"sanity_check"})
    public void beforeGroup() {
        System.out.println("Something!!");
    }

    @Test(groups = {"sanity_check"})
    public void loginTest() {
        System.out.println("Login Successful!");
    }

    @Test(groups = {"sanity_check"})
    public void navigationTest() {
        driver.get("http://vistacommerce-qa.rf.gd/");
        driver.findElement(By.xpath("//div[@class='products row']/div[3]")).click();
        String price = driver.findElement(By.xpath("//span[@class='current-price-value']")).getText();
        Assert.assertEquals(price.trim(), "$29.00");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
