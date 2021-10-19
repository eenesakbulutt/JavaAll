package com.syntax.class22;

public class Employee extends Person{

Employee(String name,int age,double height,double weight){
super(name, age, height, weight); // must be the first line
//super(name, age, height, weight); can only use once
}


    public static void main(String[] args) {
     Employee employee= new Employee("Oxana",16,5,45);

    employee.eat();
    employee.sleep();

        System.out.println(employee.name);
        System.out.println(employee.age);
        System.out.println(employee.height);
        System.out.println(employee.weight);



    }


}
