package com.syntax.class23;

public class ImprovedCalculator {

    void add(int num1,int num2){
        System.out.println(num1+num2);
    }

void add(double num1,double num2){
    System.out.println(num1+num2);
}

void add(int ... arr){ //bu ... [] nun yerine geldi yani bir suru sayi ekleyebilirsin. all elements for calculation.
    int sum=0;
    for(int num:arr){
        sum+=num;
    }
    System.out.println(sum);
}











}
