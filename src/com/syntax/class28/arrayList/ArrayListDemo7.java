package com.syntax.class28.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo7 {
    //burada da remove all methodunu gosterecek.
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Michael");
        list.add("Jam");
        list.add("Sule");
        list.add("Abdul");
        list.add("Andrei");
        System.out.println(list);
ArrayList<String>list1=new ArrayList<>();
list1.add("Michael");
list1.add("Abdul");
list1.add("Andrei");

list.removeAll(list1);
System.out.println(list);

    }
}
