package com.syntax.class27.encapsulation;

public class Person {
private String name;
private int age;
private int weight;
private int height;

public void setName(String name){
 if(name.length()<15){
     this.name=name;
 }else{
     System.out.println("Not allowed");
 }
}

public void setAge(int age){
   if(age>0 && age<120){
       this.age=age;
   }else{
       System.out.println("Age out of range");
   }
}

public void setWeight(int weight){

    if(weight>0 && weight<150){
        this.weight=weight;
    }else{
        System.out.println("Weight is out of range");
    }

}





void printInfo(){
    System.out.println("Name" + name+ " Age"+ age + "weight"+ weight+ "height"+ height);


}


}
