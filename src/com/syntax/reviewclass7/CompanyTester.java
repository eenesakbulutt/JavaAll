package com.syntax.reviewclass7;

public class CompanyTester {
    public static void main(String[] args) {
        Company c=new Company();
        c.printCompanyInfo();


       Company c1=new Company("xyz");
       c1.printCompanyInfo();


       Company c2= new Company("abc", "USA");
       c2.printCompanyInfo();


    }
}
