package com.syntax.class32.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWritingDataDemo {

    public static void main(String[] args) throws IOException {
//path where i want to create the file on my computer

      String path="/Users/kristinaakbulut/Desktop/ENESINTELLIJ/Files/Config1.properties" ;
      //navigating to the path and creating a new file
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        //opening the specific program and putting the data
        Properties properties=new Properties();

        properties.put("URL","www.google.com");
//saving changes to that file
        properties.store(fileOutputStream,"new data added");





    }
}
