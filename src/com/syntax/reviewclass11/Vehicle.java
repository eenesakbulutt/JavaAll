package com.syntax.reviewclass11;

public abstract class Vehicle {

//definition.(burada method body ile birlikte)

    public void getSpeed(){
        System.out.println("Getting the speed of vehicle");
    }


public void measureAverage(){
    System.out.println("Calculating the average");
}

//declaration.(burada method without body)
public abstract void color();

public abstract  void  getPrice();

}

class Honda extends Vehicle{

    @Override
    public void color(){
        System.out.println("Honda color is black");
    }

    @Override
    public  void getPrice(){
        System.out.println("it is costly");

    }

}

class Audi extends Vehicle{

    @Override
    public void color() {
        System.out.println("Forget color focus on price");
    }

    @Override
    public void getPrice() {
        System.out.println("Not affordable");
    }
}