package com.syntax.reviewclass9.superusing;

public class Clerk extends Employee{
//BURADAKI SUPER KULLANIMI PARANTEZLI CONSTRUCTORLU KULLANIMI
  Clerk(String name, int age, int empID,double salary){

      super(name,age,empID,salary);

  }

  void adminTask(){
      System.out.println("it works fine");
  }

    public static void main(String[] args) {
        Clerk c= new Clerk( "Hilal",35,101,10000);
        c.adminTask();
        c.work();
        c.earn();
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.empId);
        System.out.println(c.salary);



    }



}
