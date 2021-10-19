package com.syntax.reviewclass12;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList<String>al=new ArrayList<>();

        al.add("Honda");
        al.add("Audi");
        al.add("BMW");
        al.add("Mercedes");
        al.add("Jaguar");


        Iterator<String>iterator=al.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        iterator.remove();







    }
}
