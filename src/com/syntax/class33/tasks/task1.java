package com.syntax.class33.tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class task1 {
    public static void main(String[] args) throws IOException {

    String path=System.getProperty("user.dir")+"/Files/Task1.properties";
        //System.out.println(path);
//bunu yaparak directory gosteriyor. yani yazdigim olusturdugum file a nasil ulacabielcegimi gosteriyor.
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("browser"));
        System.out.println(properties.get("url"));
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));
        fileInputStream.close();


    }





}
