package com.syntax.reviewclass10;

public class Studenttt {
//burada overriding yapiyoruz.
  String name;
  String course;


  Studenttt(String name, String course) {
    this.name = name;
    this.course = course;


  }

  void getCourseInformation() {
    System.out.println(name + "is learning" + course);
  }
}

  class Selenium extends Studenttt{
    Selenium(String name,String course){
      super(name,course);
    }

void getCourseInformation(){
  System.out.println(name + "is learning" + course);
}


}
class Java extends Studenttt{
  Java(String name, String course){
    super(name,course);
    System.out.println(name + "is learning" + course);
  }

  public static void main(String[] args) {

    Java j= new Java("olena", "java 9");

    j.getCourseInformation();

    Selenium s=new Selenium("Sharif", "Selenium");
    s.getCourseInformation();

  }





}