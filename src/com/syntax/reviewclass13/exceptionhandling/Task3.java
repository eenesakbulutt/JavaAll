package com.syntax.reviewclass13.exceptionhandling;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create a method to check age eligibility that will throw a runtime exception.
         Method should throw an exception age is less than 16.
         */
        try {
            checkAge(15);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void checkAge(int age) {
        if (age < 16) {
            throw new AgeException("you are not allowed");
        } else {
            System.out.println("you should work");
        }

    }
}
