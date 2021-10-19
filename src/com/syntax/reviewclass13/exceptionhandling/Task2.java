package com.syntax.reviewclass13.exceptionhandling;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a static method that will return a List of Exceptions.
    Inside your method create objects of 4 exception classes using try and catch
    blocks and store them inside your list.
    Call your method inside main and print name and details of all Exception objects.
         */
        for (Exception e:exceptions()
        ) {
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }

    }
    public static ArrayList<Exception> exceptions(){
        ArrayList<Exception> arrayList=new ArrayList<>();
        try {
            int num=10/0;
        }catch (ArithmeticException e){
            arrayList.add(e);
        }

        try {
            String name=null;
            name.length();
        }catch (NullPointerException e){
            arrayList.add(e);
        }
        return arrayList;
    }


}
