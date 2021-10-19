package com.syntax.class28.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo5 {

    public static void main(String[] args) {


        List<String> list=new ArrayList<>();
        list.add("Ronaldo");
        list.add("Sule");
        list.add("Abdul");
        list.add("Andrei");
//tek tek isimleri yazdirmak icin for each loop kullandi.
        for (String name:list
             ) {
            System.out.println(name);
        }

//we can also use simple for loop.
        System.out.println("=======================");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }   





    }
}
