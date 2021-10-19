package com.syntax.reviewclass10;

public class Carr {
    //override ornegi

   String name;
   int speed;
   Carr(String name, int speed){
      this.name=name;
      this.speed= this.speed;
   }


    void getCarSpeed(){
       System.out.println(name+ "can run at "+ speed);
    }

}

class Mercedes extends Carr {
   Mercedes(String name, int speed) {
      super(name, speed);
   }

   void getCarSpeed() {
      System.out.println(name + "can run at " + speed);

   }
}
   class BMW extends Carr {
      BMW(String name, int speed) {
         super(name, speed);
      }

      void getCarSpeed() {
         System.out.println(name + "can run at " + speed);


      }
   }
