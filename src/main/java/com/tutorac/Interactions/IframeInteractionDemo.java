package com.tutorac.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeInteractionDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.switchTo().frame("frm1"); // SWITHING CONTEXT TO A PARTICULAR IFRAME
        WebElement element = driver.findElement(By.id("course"));
        Select courseDropdown = new Select(element);
        courseDropdown.selectByVisibleText("Java");
        Thread.sleep(3000);
        driver.switchTo().defaultContent(); // SWITCHING CONTEXT BACK TO PARENT WINDOW
        String header = driver.findElement(By.xpath("//h1[contains(text(), 'Frames Practice')]")).getText();
        System.out.println(header);
        driver.quit();
    }
}
