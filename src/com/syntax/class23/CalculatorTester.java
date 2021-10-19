package com.syntax.class23;

public class CalculatorTester {

    public static void main(String[] args) {

       /* Calculator calculator= new Calculator();

        calculator.addDouble(14.5,14.5);*/

ImprovedCalculator improvedCalculator=new ImprovedCalculator();
improvedCalculator.add(15.0,14.5);
int[]arr={10,20,30};
improvedCalculator.add(arr);
improvedCalculator.add(15,14,12);
improvedCalculator.add(15,14);
improvedCalculator.add(15,14,12,45,567);
improvedCalculator.add(15,14,12,89,8,78);
    }
}
