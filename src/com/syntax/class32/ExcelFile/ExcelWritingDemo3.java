package com.syntax.class32.ExcelFile;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWritingDemo3 {
    public static void main(String[] args) throws IOException {

//burada da kendimiz excel dosyasi olusturuyoruz istedigimiz yere.
        String path = "/Users/kristinaakbulut/Desktop/MyOwnFile.xlsx";

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        Sheet mySheet = xssfWorkbook.createSheet("MySheet");
        Row row = mySheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("My First File");
FileOutputStream fileOutputStream=new FileOutputStream(path);
xssfWorkbook.write(fileOutputStream);



    }


}
