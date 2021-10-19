package com.syntax.class21;

public class Developer extends Employee {

String programmingLanguage;

void code(){

    System.out.println("Developer having Id " +empId+" Developer having age "+ age+ "can program in"+programmingLanguage );


}


    public static void main(String[] args) {
       Developer developer = new Developer();

       developer.empId="123";
       developer.age=40;
       developer.programmingLanguage="Java";
       developer.code();
       developer.work();
       developer.sleep();








    }


}
