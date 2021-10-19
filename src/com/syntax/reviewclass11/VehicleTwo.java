package com.syntax.reviewclass11;

public abstract class VehicleTwo {
    String name;
    static int registrationNumber=1;


    VehicleTwo(String name){
        this.name=name;
        registrationNumber++;


    }

abstract  void speedOfVehicle();
    static void displayTheNameQuantityOfVehicle(){

        System.out.println("Vehicle numbers are"+ registrationNumber);
    }

public void color(){
    System.out.println("Color of ghe vehicle is black");
}

protected void price(){

    System.out.println("It is in budget");
}

//private abstract void sleep();

}

abstract class Car extends VehicleTwo{

    String model;
    Car(String name,String model){
        super(name);
      this.model=model;


    }

   public abstract void breakMyCar();


}

class Bike extends Car{
String color;

Bike(String name,String model,String color){
    super(name,model);
    this.color=color;
}

    @Override
    void speedOfVehicle() {

    }

    @Override
    public void breakMyCar() {

    }
}
