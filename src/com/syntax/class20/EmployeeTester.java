package com.syntax.class20;

import com.syntax.class21.Person;

public class EmployeeTester  {
    public static void main(String[] args) {


        EmployeeFromOtherP employee = new EmployeeFromOtherP();

//employee.name ; I can not access it because it is private
// employee.age; I can not access because it has default access modifier.
 //  employee.height ; I can not access because no extends keyword
  employee.weight=50;


  employee.sleep();

  //employee.eat(); can not access bc do not have extend keyword.

//employee.walk(); no because i am not in same package.


        Person.run();
        EmployeeFromOtherP.run();

      //   Person.takeLeaves();
// Inheritance is one way.we can not do that.

    }

}
