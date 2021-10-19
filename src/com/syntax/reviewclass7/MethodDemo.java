package com.syntax.reviewclass7;

public class MethodDemo {
    public static void main(String[] args) {

        String employeeFirstName = "Michael";
        String employeeLastName = "Lopez";
        String level = "permanent";

        if (level.equalsIgnoreCase("permanent")) {

            String firstHalfOfFirstName = employeeFirstName.substring(0, employeeFirstName.length() / 2);
            String secondHalfOfFirstName = employeeFirstName.substring(employeeLastName.length() / 2);


            System.out.println(firstHalfOfFirstName +secondHalfOfFirstName );
        } else {

            String firstHalfOfLastName = employeeFirstName.substring(0, employeeLastName.length() / 2);

            String firstHalfOfFirstName = employeeFirstName.substring(employeeFirstName.length() / 2);
            System.out.println(firstHalfOfLastName + firstHalfOfLastName);
        }




    }








}
