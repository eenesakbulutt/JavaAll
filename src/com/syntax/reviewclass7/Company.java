package com.syntax.reviewclass7;

public class Company {
//CONSTRUCTOR


    String name;
    int year;
    String country;
    String state;
    int numberOfEmployees;

    Company(){
        name="MS";
        year=1996;
        country="USA";
        state="VA";
        numberOfEmployees=2000;
    }

    Company(String companyname){
        name=companyname;
        year=1996;
        country="USA";
        state="VA";
        numberOfEmployees=1000;

    }
    Company(String companyname,String countryname) {
        name = companyname;
        year = 1996;
        country = "USA";
        state = "VA";
        numberOfEmployees = 1000;

    }
        void printCompanyInfo () {

            System.out.println(name + " " + year + " " + country + " " + state + " " + numberOfEmployees);
        }



}
