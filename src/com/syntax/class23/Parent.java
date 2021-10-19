package com.syntax.class23;

public class Parent {

    String name = "akbulut";

    void printName() {
        System.out.println("Name is " + name);
    }


    void getMarried(){
        System.out.println("my children will get marry by my choice");
    }


}

class Child extends Parent{
    String name="Enes";
    void printName(){
        String name="Nuri";

        System.out.println("Name is"+ name);   // oncelik her zaman lokalin
        System.out.println("Name is "+ this.name); // this koydugu icin instance variable gider.
        System.out.println("Name is "+ super.name); // super koydugu icin de direk another class a yani parent a gider.
    }

    void getMarried(){
        System.out.println("But I like someone else");
    }

    void letsDoSomethingCrazy(){
        getMarried();
        this.getMarried();
        super.getMarried();
        getMarried(); // we can have methods and fields on the second line as well
    }


}
