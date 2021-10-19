package com.syntax.class25.class25CastingDemo;

public class Son extends Father {

    Son(String name) {

        super(name);

    }

    void sleep() {
        System.out.println(name + "like ti sleep 20 hours a day");
    }

    void eat() {
        System.out.println(name + " like to eat qabeli");
    }

    void playGamesOnComputer(){
        System.out.println(name+ "I can play games on computer");
    }

}