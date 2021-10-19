package com.syntax.class18;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class CarTester {
    public static void main(String[] args) {

        Car car1 = new Car("Civic", "Honda", 2021);

        car1.printCarInfo();


        Car car2= new Car("Sportage", "Kia", 2022);

        car2.printCarInfo();


    }


}
