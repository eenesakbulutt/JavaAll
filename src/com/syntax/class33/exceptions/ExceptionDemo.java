package com.syntax.class33.exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {

        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        System.out.println("line 4");
        System.out.println("line 5");

        try {
            System.out.println(10 / 5);
        }catch(Exception yap){ //buraya once class name yaziyoruz sonra variable name.
            System.out.println("This is not possible on java");
        }

        System.out.println("line 1 after error");
        System.out.println("line 2 after error");
        System.out.println("line 3 after error");
        System.out.println("line 4 after error");
        System.out.println("line 5 after error");



    }

}
