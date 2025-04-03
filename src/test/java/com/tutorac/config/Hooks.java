package com.tutorac.config;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
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
    public static ExtentReports extent = null;
    public static ExtentSparkReporter spark = null;
    public static ExtentTest testInstance = null;

    @BeforeSuite
    public void beforeSuite() {
        try {
            fis = new FileInputStream(new File("src/test/resources/config.properties"));
            configProps = new Properties();
            configProps.load(fis);
            extent = new ExtentReports();
            spark = new ExtentSparkReporter(configProps.getProperty("report_path"));
            extent.attachReporter(spark);
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
        testInstance = extent.createTest("Reporting Test");
        testInstance.log(Status.INFO, "Launching Browser");
        this.launchBrowser();
    }

    @AfterMethod
    public void afterMethod() {
        testInstance.log(Status.INFO, "Closing Browser");
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
        extent.flush();
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
