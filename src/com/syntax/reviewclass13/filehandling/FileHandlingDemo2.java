package com.syntax.reviewclass13.filehandling;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FileHandlingDemo2 {

    public static void main(String[] args) {

        String path = "/Users/kristinaakbulut/Desktop/tester.xlsx";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = xssfWorkbook.getSheet("Sheet1");
            int noOfRows = sheet.getPhysicalNumberOfRows();
            int rowIndex = sheet.getLastRowNum(); //last row index that contains the data
            System.out.println(rowIndex);
            System.out.println(noOfRows);
            ArrayList<Map<String, String>> table = new ArrayList<>();
            Map<String, String> rows;

            for (int i = 1; i <= rowIndex; i++) {
                Row row = sheet.getRow(i);
                rows = new LinkedHashMap<>();
                // System.out.println(row.getLastCellNum());
                for (int j = 0; j < row.getLastCellNum(); j++) {
                    rows.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i).getCell(j).toString());
                }
                table.add(rows);

            }
            System.out.println(table);
//break till 9


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
