package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {

    public static void main(String[] args) {

        Map<Integer,String> map=new HashMap<>();

        map.put(123,"OLena");
        map.put(124,"OLena1");
        map.put(125,"OLena2");
        map.put(126,"OLena3");
        map.put(127,"OLena4");


        Map<Integer,String> map2=new HashMap<>();

        map2.put(1234,"OLena");
        map2.put(1244,"OLena1");
        map2.put(1254,"OLena2");
        map2.put(1264,"OLena3");
        map2.put(1274,"OLena4");

      //  map2.putAll(map);
        System.out.println(map2);
        map2.remove(1244);
        System.out.println(map2.get(1264));
        System.out.println(map2);





    }









}
