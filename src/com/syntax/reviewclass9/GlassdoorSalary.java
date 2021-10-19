package com.syntax.reviewclass9;

public class GlassdoorSalary {

    int empID;
    double salaryOne;
    double salaryTwo;
    double salaryThree;

    GlassdoorSalary(int empID,double salaryOne,double salaryTwo,double salaryThree){
     this.empID=empID;
     this.salaryOne=salaryOne;
     this.salaryTwo=salaryTwo;
     this.salaryThree=salaryThree;


    }

void printAverageSalary(){
    System.out.println("Average salary="+ (salaryOne+salaryTwo+salaryThree)/3+ '$' );



}












}




