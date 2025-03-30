package com.tutorac.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Hooks {

    public FileInputStream fis;
    public static Properties configProps;
    public WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        try {
            fis = new FileInputStream(new File("src/test/resources/config.properties"));
            configProps = new Properties();
            configProps.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @BeforeClass
    public void beforeClass() {

    }

    @BeforeTest
    public void beforeTest() {

    }

    @BeforeMethod
    public void beforeMethod() {
        this.launchBrowser();
    }

    @AfterMethod
    public void afterMethod() {
        this.closeBrowser();
    }

    @AfterTest
    public void afterTest() {

    }


    @AfterClass
    public void afterClass() {

    }

    @AfterSuite
    public void afterSuite() {

    }

    /**
     * <p>This method launches a fresh instance of browser depending on configuration</p>
     */
    public void launchBrowser(){
        if(configProps.getProperty("browser").equalsIgnoreCase("CHROME")) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(configProps.getProperty("implicit_timeout"))));
        }else if(configProps.getProperty("browser").equalsIgnoreCase("EDGE")) {
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(configProps.getProperty("implicit_timeout"))));
        }
        // OTHER BROWSER SETUP BLOCKS..
    }

    /**
     * <p>Closes any active browser sessions</p>
     */
    public void closeBrowser() {
        if(driver != null) {
            driver.quit();
        }
    }
}
