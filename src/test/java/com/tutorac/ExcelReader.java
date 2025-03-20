package com.tutorac;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("./testdata.xlsx");
            Workbook wb = new XSSFWorkbook(fis);
            Sheet sheet = wb.getSheet("login_credentials");
            int rowCount = sheet.getPhysicalNumberOfRows();
            int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
            for(int i=0; i<rowCount; i++) {
                for(int j=0; j<colCount; j++) {
                    String cellData = sheet.getRow(i).getCell(j).getStringCellValue();
                    System.out.println(cellData);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
