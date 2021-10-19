package com.syntax.class30.examples;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {


    Map<String,Integer> fruits=new HashMap<>();

        fruits.put("kiwi",10);
        fruits.put("melon",5);
        fruits.put("mango",7);
        fruits.put("peach",9);
        fruits.put("apple",12);
        fruits.put("orange",19);
        System.out.println(fruits);
        System.out.println(fruits.get("peach"));
        System.out.println(fruits.containsKey("mango"));
        System.out.println(fruits.containsValue(29));
        System.out.println(fruits.remove("orange"));
        fruits.replace("peach",1);
        System.out.println(fruits);




    }
}
