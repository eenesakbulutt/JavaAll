package com.syntax.class33.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo4 {
    public static void main(String[] args) throws FileNotFoundException {
       int number1=10;
       int number2=0;
if(number2!=0){
    System.out.println(number1/number2);
}
String path="/Users/kristinaakbulut/Desktop/ENESINTELLIJ/Files/Test.txt";


File file=new File(path);
if(file.exists()){
    System.out.println("File os present");
    FileInputStream fileInputStream=new FileInputStream(path);

}else{
    System.out.println("File is not present");
}

    }
}
