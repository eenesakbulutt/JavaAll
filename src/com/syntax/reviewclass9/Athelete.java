package com.syntax.reviewclass9;

public class Athelete {

    String name;
    int age;
    int weight;
    String game;

    Athelete(String name,int age,int weight,String game){

        this.name=name;
        this.age=age;
        this.weight=weight;
        this.game=game;


    }

    void gameInfo(){
        String name="Michael";
        System.out.println(name+ this.age + this.weight + this.game);
    }

}
