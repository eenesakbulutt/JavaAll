package com.syntax.class22;

public class Dog extends Animal{


   int noOfLegs=4;

   void printLegs(){
       System.out.println(noOfLegs);

       System.out.println(super.noOfLegs);
   }


    public static void main(String[] args) {

   Dog dog=new Dog();

        System.out.println(dog.noOfLegs);




    }


}
