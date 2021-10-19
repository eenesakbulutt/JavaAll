package com.syntax.class32.ExcelFile;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReadingDemo2 {
    public static void main(String[] args) throws IOException {
//burada istedigimiz excel dosyaasindan bilgileri alabiliyoruz.
    String path="/Users/kristinaakbulut/Desktop/tester.xlsx";
    FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        int rowCount=sheet.getPhysicalNumberOfRows();
        for (int i = 0; i <rowCount ; i++) {
            int cellCount=sheet.getRow(i).getPhysicalNumberOfCells();
            for (int j = 0; j <cellCount ; j++) {
                System.out.print(sheet.getRow(i).getCell(j)+ " ");
            }
            System.out.println();

        }





    }
}
