package com.tutorac.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInteractionDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dezlearn.com/webtable-example/");
        String rowXpath = "//table/tbody/tr";
        String colXpath = "//table/tbody/tr/th";
        int rowCount = driver.findElements(By.xpath(rowXpath)).size();
        int colCount = driver.findElements(By.xpath(colXpath)).size();
        System.out.println("RowCount :"+rowCount);
        System.out.println("ColCount :"+colCount);
        for(int row=2; row<=rowCount; row++) {
            for(int col=1; col<=colCount; col++) {
                String elementXPath = rowXpath+"["+row+"]/td["+col+"]";
                String elementText = driver.findElement(By.xpath(elementXPath)).getText();
                System.out.println(elementText);
            }
        }
        driver.quit();
    }
}
