package com.syntax.reviewclass9.superusing2;

public class Crocodile extends Animal{

int teeth=70;

void kill(){
    System.out.println("Crocodile kills zebra");
}

void nature(){
    System.out.println("Crocodile is a cold blooed animal");
}

void printTeeth(){
    System.out.println(teeth);
    System.out.println(super.teeth);
}

    public static void main(String[] args) {
       Crocodile c= new Crocodile();
       c.printTeeth();
       c.nature();
       c.kill();
       c.hunt();



    }

}
