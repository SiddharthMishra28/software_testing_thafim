package com.tutorac;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class DataDrivenTests1 {

    WebDriver driver = null;
// INCORRECT APPROACH!!
//    @Test
//    public void validLoginInvalidPwTest() {
//        //...
//    }
//
//    @Test
//    public void invalidLoginInvalidPwTest() {
//        //...
//    }
//
//    //...

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(dataProvider = "loginCredentials")
    public void loginCoverageTest(String userId, String password) {
        //... selenium logic
        System.out.println("User Id : "+userId+" | Password : "+password);
        driver.get("http://vistacommerce-qa.rf.gd/");
        driver.findElement(By.xpath("//span[text()='Sign in']")).click();
        driver.findElement(By.id("field-email")).sendKeys(userId);
        driver.findElement(By.id("field-password")).sendKeys(password);
    }

//    @DataProvider(name = "loginCredentials")
//    public String[][] loginDataProvider() {
//        String[][] credentials = new String[][] {
//                {"abcd", "1234"},
//                {"defg", "5678"},
//                {"hello", "password"}
//        };
//        return credentials;
//    }

    @DataProvider(name = "loginCredentials")
    public String[][] excelDataProvider() {
        try {
            FileInputStream fis = new FileInputStream("./testdata.xlsx");
            Workbook wb = new XSSFWorkbook(fis);
            Sheet sheet = wb.getSheet("login_credentials");
            int rowCount = sheet.getPhysicalNumberOfRows();
            int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
            String[][] dataArray = new String[rowCount][colCount];
            for(int i=0; i<rowCount; i++) {
                for(int j=0; j<colCount; j++) {
                    dataArray[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
                }
            }
            return dataArray;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
