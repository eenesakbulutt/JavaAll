package com.syntax.class18;

import com.sun.corba.se.spi.orbutil.threadpool.NoSuchThreadPoolException;

public class Dog {

    String name;
    int age;
    double height;
    double weight;
    String breed;
    String color;
    static int noOfLegs = 4;

    Dog(String dogName, int dogAge, double dogHeight, double dogWeight, String dogBreed, String dogColor) {

        name = dogName;
        age = dogAge;
        height = dogHeight;
        weight = dogWeight;
        breed = dogBreed;
        color = dogColor;

    }

    Dog(String dogName) {
        //constructor 1
        name = dogName;
        age = 10;
        height = 10;
        weight = 10;
        breed = "None";
        color = "None";

    }

    Dog(String dogName, int dogAge) {
       // constructor 2
        name = dogName;
        age = dogAge;
        height = 10;
        weight = 10;
        breed = "None";
        color = "None";
    }
    Dog(String dogName, int dogAge,double dogHeight) {
        //constructor 3
        name = dogName;
        age = dogAge;
        height = dogHeight;
        weight = 10;
        breed = "None";
        color = "None";

    }


        void printDogInfo () {
            System.out.println(" Name " + name + " age " + age + " height " + height + " breed " + breed + " color " + color);
        }


    }

    //parameterleri once 1 sonra 2 sonra 3 lu yapti.. yani arttira arttira yapabilirsin.