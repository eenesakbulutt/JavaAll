package com.syntax.reviewclass12;

import java.util.ArrayList;

public class ArrayListClass2 {

    public static void main(String[] args) {

        ArrayList<Object>employee=new ArrayList<>();
       //multiple data type gecmek icin Object koyuyoruz . buraya istedigini yazabiliyorsun.int string double vs.

        employee.add("Tesfab");
        employee.add("Noor");
        employee.add(12345);
        employee.add(2.0);


        System.out.println(employee);


    }


}
