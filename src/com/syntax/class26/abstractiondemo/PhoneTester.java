package com.syntax.class26.abstractiondemo;

public class PhoneTester {

// Phone phone= new Phone();
// CE Not possible to create object directly.
public static void main(String[] args) {

    Phone phone=new Iphone();
    phone.makePhoneCall();
    phone.sendSMS();
    phone.takePictures();
    phone.unlock();







}

}
