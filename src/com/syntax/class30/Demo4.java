package com.syntax.class30;

import com.syntax.class29.set.LinkedHashSetDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo4 {
    public static void main(String[] args) {

      HashMap<String,Double> electronics=new LinkedHashMap<>();
      electronics.put("Television",10.0);
      electronics.put("Remote",5.5);
      electronics.put("dryer",5.5);
      electronics.put("induction",2.4);

      Set<Map.Entry<String,Double>>entrySet=electronics.entrySet();

for(Map.Entry<String,Double>entry:entrySet){
    System.out.println(entry.getKey()+" "+ entry.getValue());








}



    }
}
