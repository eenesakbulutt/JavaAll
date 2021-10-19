package com.syntax.class21;

public class Employee extends Person {

 // person is parent class(super class ,base class)
 //employee is a child class(subclass,derived class) here.

//employee, person, employee class bunlarin hepsi bir package icindeydi.
    String empId;
    double salary;

    void work(){
        System.out.println("Employee"+ empId+ "having age"+age+"is working");
    }

void getPaid(){
    System.out.println(empId+" is paid"+ salary);

}





}
