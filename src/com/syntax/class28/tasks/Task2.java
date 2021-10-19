package com.syntax.class28.tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    /*
    *Create an arraylist of cars and retrieve all the values using 3 different ways.
Create an arrayList of words. Remove every word that ends with “e”.
    * */

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("10");
        words.add("nine");
        words.add("great");
        words.add("like");
        words.add("hike");

        Iterator<String> iterator = words.iterator();
        while(iterator.hasNext()){


        String word = iterator.next();
        if (word.endsWith("e")||word.endsWith("E")) {
            iterator.remove();
        }


    }
        System.out.println(words);

}

}




