package com.syntax.reviewclass12;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {

        ArrayList<String>fruits=new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Melon");
        fruits.add("Berries");
        fruits.add("Banana");
        fruits.add("Apple");

        Iterator<String>iterator=fruits.iterator();
        while(iterator.hasNext()){
            String name= iterator.next();
            if(name.length()>4){
                iterator.remove();
            }

        }

        System.out.println(fruits);


    }
}
