package com.syntax.class21;

public class Car {
  String model;
  String make;
  int year;

Car() {
  System.out.println("Empty constructor with zero parameters");
}

Car(String model){
  this();
  this.model=model;
  this.make="None";
  this.year=0;
  System.out.println("Constructor with 1 parameters");
}

Car(String make,String model){

  this.model=model;
  this.make=make;
  this.year=0;

  System.out.println("Constructor with 2 parameters");
}


  Car(String make,String model,int year){

    /*this.model=model;
    this.make=make;*/
    this(make, model);
    this.year=year;
    System.out.println("Constructor with 3 parameters");
  }

  void printInfo(){
    String make="Honda";
    String model="Civic";
    int year=2022;

System.out.println(this.model+make+this.year);

//eger local degilde instanca variable ciksin istiyorsan this i buradaki model e yaz.


//Ayrica print yaptigi eger local variable de yoksa instance de aramaya gider.

// void in icerisi local variable oluyor. Ust taraf class in altinda kalan kisim ise instance variable.
  }









}
