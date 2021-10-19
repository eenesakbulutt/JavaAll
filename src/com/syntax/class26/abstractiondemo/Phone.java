package com.syntax.class26.abstractiondemo;

import javax.xml.bind.SchemaOutputResolver;

public abstract class Phone {


public void makePhoneCall(){
        System.out.println("Calling");
    }

public void sendSMS(){
    System.out.println("Sending a message");
}

public abstract void takePictures();
public abstract void unlock();

}

class Iphone extends Phone {

    @Override
    public void takePictures() {
        System.out.println("Take pictures with 12 Mega pixel camera");
    }

    public void unlock() {
        System.out.println("unlocks with face id");
    }
}
    class Samsung extends Phone{

    public void takePictures(){

            System.out.println("Take pictures with 108 Megapixels camera");

        }

        @Override
        public void unlock() {
            System.out.println("unlocks with fingerprint");
        }
    }









