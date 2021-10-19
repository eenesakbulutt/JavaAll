package com.syntax.class25.class25CastingDemo;

public class Tester {
    public static void main(String[] args) {

     Father container=new Son("Abdul")   ;

container.eat();
container.sleep();

container=new Fawad("Fawad");

Object[] object= {"hdjvskadl",234,'A',false};

//CONVERSION YAPTIGI YER :

      //((Son)container).playGamesOnComputer(); // bende calismadi ama bu sekilde yapiliyor.
container.eat();
container.sleep();


//buradan sonra conversion part gerekli.




// Abdullah abdul=(Abdul) abdullah; // abdullah i abdul a ceviriyor.

        // simdi yazacagi seyleri direk abdul class tan cekebilir.

//abdul.playGamesOnComputer();
//abdul.eat();
//abdul.sleep();


    }
}
