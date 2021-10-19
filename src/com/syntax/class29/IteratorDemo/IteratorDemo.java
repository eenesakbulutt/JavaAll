package com.syntax.class29.IteratorDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

//NOT; Java list iterator collection elemanlarimizin arasinda gezinmemize yarar. En onemli ozelliklerinden biri de
        // collection elemanlarini remove edebilmesidir.Yani belirtilen kriterlerdeki elemani silmemize yarar.

        //next() ileri dogru
        //previous geri dogru
        //hasNext(); ileride eleman var mi ?
        //hasprevious geride eleman var mi?


        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNg");
        Iterator<String>iterator=subjects.iterator();
        System.out.println(iterator.hasNext());


        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(subjects);
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());











    }

}
