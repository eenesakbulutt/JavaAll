package com.syntax.reviewclass8;

public class Mobile {

  private String make;
  private String model;
  protected int mainMemory;
  public int secondaryMemory;


 Mobile(String make,String model,int mainMemory,int secondaryMemory){
       this.make=make;
       this.model=model;
       this.mainMemory=mainMemory;
       this.secondaryMemory=secondaryMemory;


   }

    private void printInfo(){
        System.out.println(make+ model+ mainMemory);
    }

    void printModel(){
        System.out.println(model);
    }

    void printMake(){
        System.out.println(make);


    }



    public static void main(String[]args){

       Mobile mobile=new Mobile("Iphone","Iphone 12",8,512);

       mobile.printInfo();

    }

}


class MobileTester {

    public static void main(String[] args) {

        Mobile mobile = new Mobile("Iphone", "Iphone 12", 8, 512);

    }
}