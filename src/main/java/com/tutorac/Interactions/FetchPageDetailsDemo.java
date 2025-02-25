package com.tutorac.Interactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchPageDetailsDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://vistacommerce-qa.rf.gd/registration");
        String title = driver.getTitle();
        if(title.equalsIgnoreCase("Registration")) { // NOT THE USUAL WAY TO TEST - THIS IS AN EXAMPLE
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
//        System.out.println("Title of Page is : "+title);
        driver.quit();
    }
}
