package com.syntax.reviewclass13.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


       /*
        How would handle InputMismatchException? Input Mismatch Exception when user
        enters mismatch value then programmer expected
         */


        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please input proper data");
            }
        }

    }
}


