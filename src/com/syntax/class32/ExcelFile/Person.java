package com.syntax.class32.ExcelFile;

public class Person {
   String firstName;
   String lastName;
   String age;


   public Person(String firstName, String lastName, String age) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
   }

   @Override
   public String toString() {
      return "Person{" +
              "firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", age='" + age + '\'' +
              '}';
   }
}

// override yaparken to STRING  YAZDIK GERISINI KENDI YAZDI.