package com.syntax.reviewclass7;

public class MethodDemo4 {
    public static void main(String[] args) {
      //split yapma olayi

      String test= "Automation jobs are in high demand";

      String []strArr = test.split("");

        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[4]);

        //simdi for kullanarak yapalim.

        for(String str: strArr){
            System.out.println(str);
        }


        String testOne= "Automationjobs$$%are ^&*^&*in&&^high demand";

String [] strArr2= testOne.split("[%]");
        System.out.println(strArr2.length);




    }
}
