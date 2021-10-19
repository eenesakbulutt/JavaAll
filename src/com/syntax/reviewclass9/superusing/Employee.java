package com.syntax.reviewclass9.superusing;

public class Employee {

    String name;
    int age;
    int empId;
    double salary;


    public Employee(String name, int age, int empId, double salary) {
        this.name = name;
        this.age = age;
        this.empId = empId;
        this.salary = salary;
    }

   public void work(){
       System.out.println("Every employee work");
   }

    public void earn(){

        System.out.println("All employees earn");

    }

}
