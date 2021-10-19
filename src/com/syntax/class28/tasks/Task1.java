package com.syntax.class28.tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
/*
* Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
* */

        ArrayList<String>cars=new ArrayList<>();
        cars.add("BMW M3");
        cars.add("Honda Civic");
        cars.add("Toyota CHR");
        cars.add("Hyundai Tucson");
        cars.add("Lucid");
       //1.yol
        for(String car:cars){
            System.out.println(car);
        }
//when only accesing the element always use enhanced for loop
        System.out.println("-----------------");
//2.yol

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("---------------");
//3.yol
        Iterator<String>iterator=cars.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }







    }
}
