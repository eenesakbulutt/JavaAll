package com.syntax.class26.casting;

public class AnimalTester {

    public static void main(String[] args) {

Animal animal= new Cat();  //cat burada animal gibi davraniyor.
Animal animal1=new Dog();// animal 1 burada dog deil animal gibi davraniyor.
Cat cat=(Cat)animal; // bu calismaz buada once casting yapman lazim. sonra calisir.
                      //parantez icinde (Cat) yazarak yapti bunu.

        //shorter way da su sekilde ((Cat)animal).meow();

cat.meow();


    }



}
