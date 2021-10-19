package com.syntax.class28.arrayList;

import java.util.ArrayList;

public class ArrayListDemo9 {

    public static void main(String[] args) {


        ArrayList<String> subjects=new ArrayList<>();

        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNg");
//reverse loops yaparsak error vericek dedi.
        for (int i = 0; i < subjects.size() ; i++) {
           if(subjects.get(i).length()>4){
               subjects.remove(i);
               //for loops cok tercih etmiyoruz dedi.
           }
        }
        System.out.println(subjects);



    }
}
