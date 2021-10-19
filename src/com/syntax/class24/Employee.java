package com.syntax.class24;

public class Employee {

double salary;
String name;
Employee(String name,double salary){
    this.salary=salary;
    this.name=name;
}
void getPaid(){

    System.out.println(name+ " is getting paid "+ salary);
}

static class Contractor extends Employee{
    Contractor(String name,double salary){
        super(name,salary);
    }
    @Override
  void getPaid(){
      System.out.println(name+ "is getting paid"+ salary+ "/hourly" );
  }

}

static class FullTimeEmployee extends Employee{

    FullTimeEmployee(String name,double salary){
        super(name,salary);
    }


}

    public static void main(String[] args) {


    FullTimeEmployee fullTimeEmployee=new FullTimeEmployee("Dilnoza",100);

fullTimeEmployee.getPaid();

Contractor contractor=new Contractor("Jesus", 45);
contractor.getPaid();




    }




}
