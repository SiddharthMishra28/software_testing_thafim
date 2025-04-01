package com.tutorac.utils;

import com.tutorac.config.Hooks;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestDataUtils {

    public static String[][] readExcelData(String tab) {
        try {
//            FileInputStream fis = new FileInputStream(new File(Hooks.configProps.getProperty("test_data_path")));
            FileInputStream fis = new FileInputStream(new File("src/test/resources/testdata.xlsx"));
            Workbook wb = new XSSFWorkbook(fis);
            Sheet currentSheet = wb.getSheet(tab);
            int rowCount = currentSheet.getPhysicalNumberOfRows();
            int colCount = currentSheet.getRow(0).getLastCellNum();
            String[][] excelData = new String[rowCount][colCount];
            for(int i=0; i<rowCount; i++) {
                for(int j=0; j<colCount; j++) {
                    excelData[i][j] = currentSheet.getRow(i+1).getCell(j).getStringCellValue();
                    System.out.println(excelData[i][j]);
                }
            }
            return excelData;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        TestDataUtils utils = new TestDataUtils();
        utils.readExcelData("register_user");
    }
}
