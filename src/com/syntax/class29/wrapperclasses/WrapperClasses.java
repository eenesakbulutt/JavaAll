package com.syntax.class29.wrapperclasses;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
     String name="Hello";
     String name2=new String("Hello");
     Integer number= new Integer(10);//Boxing
       String strNumber=number.toString();
     Integer number2=20;//Autoboxing
        Double doubleNumber=35.0;
        int number3=Integer.parseInt("1000");
        int number4=Integer.parseInt("1000");
        System.out.println();
        int number6=number.intValue();  //Unboxing
        int number7=number; //AutoUnboxing









    }
}
