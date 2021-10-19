package com.syntax.reviewclass9;

public class HumanBeing {

String name;
int age;
double weight;

HumanBeing(){
    System.out.println("Testing the constructor");
    name="Elon Musk";
    age=46;
    weight=69;

}
   HumanBeing(String humanName) {
    this();
       System.out.println("Testing the constructor");
       name = "humanName";

   }

    HumanBeing(String humanName,int humanAge) {
    this(humanName);
        System.out.println("Testing the constructor");
        name = "humanName";
        age = humanAge;

    }

    void printHumanInformation(){
        System.out.println(name+" "+" "+age+" " +weight);
    }



}
