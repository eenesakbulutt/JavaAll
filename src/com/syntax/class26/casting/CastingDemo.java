package com.syntax.class26.casting;

public class CastingDemo {

    public static void main(String[] args) {

      Object [] objects={"Hi",10,'A'};
        for(Object obj: objects) {

            if (obj instanceof String) {
                System.out.println(((String) obj).length());
            }
            // normalde burada hata veriyor cunku integer ifade de var.
            //ama instance of kullanarak bunu cozebiliriz yukarda yazdik.
//sadece string olsaydi sorun yoktu. ama iceride char da var integer da var.
//burada sonuc string deki uzunluk. hi iki harf ve sonuc iki cikti.
        }





    }




}
