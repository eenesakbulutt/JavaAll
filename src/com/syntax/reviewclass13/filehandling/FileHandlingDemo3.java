package com.syntax.reviewclass13.filehandling;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandlingDemo3 {

    public static void main(String[] args) {

        String path="/Users/kristinaakbulut/Desktop/tester.xlsx";
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet=xssfWorkbook.getSheet("Sheet1");
            int noOfRows=sheet.getPhysicalNumberOfRows();
            int rowIndex=sheet.getLastRowNum(); //last row index that contains the data

            ArrayList<Person> table=new ArrayList<>();


            for (int i = 1; i <= rowIndex; i++) {

                String firstName=sheet.getRow(i).getCell(0).toString();
                String lastName=sheet.getRow(i).getCell(1).toString();
                String age=sheet.getRow(i).getCell(2).toString();
                String salary=sheet.getRow(i).getCell(3).toString();
                Person person=new Person(firstName,lastName,age,salary);
                table.add(person);


            }
            System.out.println(table);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
