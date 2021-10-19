package com.syntax.reviewclass7;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MethodDemo3 {
    public static void main(String[] args) {

        //regex
        String name="Software Testing is @m@zing";

        System.out.println(name.replaceAll("[@]","a"));


        String test= "sharifEWGQQFOWBP$$%%%%&&&&QLW1324@34";
        System.out.println(test.replaceAll("[0-9]","*"));
        System.out.println(test.replaceAll("[A-Z]","."));
        System.out.println(test.replaceAll("[a-z]","+"));

        System.out.println("---------------------------------------");

        System.out.println(test.replaceAll("[A-Z0-9]",""));
        System.out.println(test.replaceAll("[a-zA-Z0-9]",""));
        System.out.println(test.replaceAll("[^a-zA-Z0-9]",""));







    }




}


