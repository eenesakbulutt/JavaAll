package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadingDemo1 {
    public static void main(String[] args) throws IOException {

        //location of the file.
String path="/Users/kristinaakbulut/Desktop/ENESINTELLIJ/Files/Config.properties";
//creating a connection between class or navigation to that file
        FileInputStream fileInputStream=new FileInputStream(path);
        //choosing a program to open tahtfile
        Properties properties=new Properties();
        //opening the file
        properties.load(fileInputStream);
        //reading the data
        System.out.println(properties.get("UserName"));
        System.out.println(properties.get("Password"));

//this is how we read the properties file

    }
}
