package com.syntax.reviewclass12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set1 {

    public static void main(String[] args) {
//NO DUPLICATE IN SET
        //duzensiz bir sekilde siralar.
        HashSet<String>names=new HashSet<>();
        names.add("Enes");
        names.add("Hilal");
        names.add("Oxana");
        names.add("Sharif");
        names.add("Hilal");
        names.add("Burcu");

        System.out.println(names);


        LinkedHashSet<String>names2=new LinkedHashSet<>();
        //no duplicate also cunku sette duplicate yok.
        //burada order duzen var
        names2.add("Anne");
        names2.add("Blake");
        names2.add("Sharif");
        names2.add("Mike");
        names2.add("Mike");

        System.out.println(names2);


        TreeSet<String>t=new TreeSet<>();
        //burada alfabetik yaziyor.
        t.add("Enes");
        t.add("dinara");
        t.add("mars");
        t.add("sule");
        t.add("olena");

        System.out.println(t);






    }

}
