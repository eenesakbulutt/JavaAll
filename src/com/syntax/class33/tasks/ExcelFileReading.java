package com.syntax.class33.tasks;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ExcelFileReading {
    public static void main(String[] args) throws IOException {

  String path="/Users/kristinaakbulut/Library/Containers/com.microsoft.Excel/Data/Desktop/tester.xlsx";
        System.out.println(path);

        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");

        int rowCount=sheet.getPhysicalNumberOfRows();
        ArrayList<Map<String,String>>mapArrayList=new ArrayList<>();

        for (int i = 1; i <rowCount ; i++) {
            LinkedHashMap linkedHashMap=new LinkedHashMap();
            int cellCount=sheet.getRow(i).getPhysicalNumberOfCells();
            for (int j = 0; j <cellCount ; j++) {
                linkedHashMap.put(sheet.getRow(0).getCell(j).toString(),sheet.getRow(i).getCell(j).toString());

                System.out.print(sheet.getRow(i).getCell(j)+" ");

            }

            mapArrayList.add(linkedHashMap);
            //System.out.println();
        }

        System.out.println(mapArrayList);


    }

//normalde bunu daha kisa yapti ama map linkedhas falan ekleyerek daha dinamik oldu bu sekilde dedi.



}
