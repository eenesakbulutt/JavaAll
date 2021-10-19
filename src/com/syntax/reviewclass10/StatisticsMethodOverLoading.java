package com.syntax.reviewclass10;

public class StatisticsMethodOverLoading {

    void add(int i1,int i2){
        System.out.println(i1+i2);
    }

    void add(double d1, double d2){
        System.out.println(d1+d2);
    }

    void add(int i1,int i2,int i3){
        System.out.println(i1+i2+i3);
    }

    void add(int[] arr){
        int sum=0;
        for(int num: arr){
            sum+=num;
        }
        System.out.println(sum);
    }
}
