package com.syntax.class33.exceptions;

public class ExceptionDemo5 {

    public static void main(String[] args) {
        System.out.println("Important code");

        try{
            System.out.println(10/0);
            //System.out.println("code after 10/0");
            int arr []=new int[-10];
        }catch(ArithmeticException e){
            System.out.println("Not possible in math");
        }catch(NegativeArraySizeException e){
            System.out.println("Please give positive size");
        }

        System.out.println("Important code");


    }
}
