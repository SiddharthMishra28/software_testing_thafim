package com.tutorac.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHandlingDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        // GENERIC ALERT
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[text()='Alert']")).click();
//        driver.switchTo().alert().accept();

        // ALERT WITH DELAY
//        driver.findElement(By.xpath("//button[@onclick='myMessage()']")).click();
//        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//        driver.switchTo().alert().accept();
        // ALERT WITH OK , CANCEL (YES/NO)
//        driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();
//        Thread.sleep(2000);
//        driver.switchTo().alert().dismiss();

        // ALERT WITH INPUT
        driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("thafim");
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[contains(text(), 'Forms')]")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
