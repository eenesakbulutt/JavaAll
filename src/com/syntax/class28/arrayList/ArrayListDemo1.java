package com.syntax.class28.arrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {



        int[] arr={10,20};

       int[] arr2=new int[20];

        //arr[2]=1452;

        ArrayList<String>arrayList=new ArrayList<>();

        arrayList.add("10");
        arrayList.add("Ronaldo");
        arrayList.add("30");
        arrayList.add("Adem");

        //mesela buraya arraylist add yapip integer eklersem hata verir.
        //cunku arrayliste string tanimladim.
        // arrayList.add(19);




        System.out.println(arrayList);

        System.out.println(arrayList.get(2));

        arrayList.set(2,"1000");
        System.out.println(arrayList.get(2));

        ArrayList<Integer> arrayList1 =new ArrayList<>();

        arrayList1.add(10);

        //mesela buraya arraylist add yapip string eklersem hata verir.
        //cunku arrayliste integer tanimladim.

        //arrayList1.add("abc");















    }
}
