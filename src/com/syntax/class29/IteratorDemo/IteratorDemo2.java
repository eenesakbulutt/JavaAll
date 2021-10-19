package com.syntax.class29.IteratorDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {

    public static void main(String[] args) {

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNg");

        Iterator<String>iterator=subjects.iterator();

while(iterator.hasNext()){
    System.out.println(iterator.next());
    String subject=iterator.next();
    if(subject.length()>4){
        iterator.remove();
    }

}
        System.out.println(subjects);

    }

}