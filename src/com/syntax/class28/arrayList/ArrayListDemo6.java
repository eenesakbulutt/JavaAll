package com.syntax.class28.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo6 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("Ronaldo");
        list.add("Aras");
        list.add("Abdul");
        list.add("Andrei");

        System.out.println(list);

        System.out.println(list.remove("Aras"));

while(list.remove("Abdul")){
//recommanded if u want to remove all the entries.
}    //bu birinci yoldu simdi baska for lu yoldan yapalim.

     /*   for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("Andrei")){
                list.remove(i);*/

        //fakat bu yol not recommended. bazen calisiyor. bazen calismiyor cunku.
/*    }
}*/
        System.out.println(list);

            }
        }






