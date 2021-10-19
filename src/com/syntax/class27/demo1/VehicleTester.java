package com.syntax.class27.demo1;

import com.syntax.class27.demo1.BMW;
import com.syntax.class27.demo1.Car;
import com.syntax.class27.demo1.Toyota;
import com.syntax.class27.demo1.Vehicle;

public class VehicleTester {

    public static void main(String[] args) {

   BMW bmw=new BMW("BMW","X5","123","Sedan");

bmw.drive();
bmw.start();
bmw.stop();
//bmw.toString(); coming from object classes are automatically.
//inherit from that class.
 bmw.displayInfo();
 Vehicle.displayTotalVehicles();
Car car= new Toyota("Toyota","Yaris","Sedan","342");
        ((Toyota)car).displayInfo();

    }

}
