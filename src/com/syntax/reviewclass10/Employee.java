package com.syntax.reviewclass10;

public class Employee {

    //create a class while creating object of this class
    //if nothing is passed to it, then print something
    //and if some string is passed into it then in place of
    //sth the value of the variable should be printed


Employee(){
    System.out.println("This employee is not good ");
}

Employee(String name){

    System.out.println(name+" is a good employee");

}

    public static void main(String[] args) {
        new Employee();
        new Employee("Sharif");



    }

}
