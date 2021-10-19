package com.syntax.reviewclass11.tasks;

import com.syntax.reviewclass11.interfacepage.CheckInterfaceOne;
import com.syntax.reviewclass11.interfacepage.CheckInterfaceTwo;

public abstract class File {

    abstract void open();



    void edit(){
    System.out.println("I am here edit the files");

}

void close(){
    System.out.println("I am here to close the file ");

}

}

class JavaFile extends File implements CheckInterfaceOne, CheckInterfaceTwo {


    @Override
    void open() {
        System.out.println("Java file opened in java class");
    }

    @Override
    public void testMethod() {

    }

    @Override
    public void testMethodInSecondInterface() {

    }
}

class PDFFile extends File{

    @Override
    void open() {
        System.out.println("Opening pdf in pdf file class");
    }
}

class WordFile extends File{


    @Override
    void open() {
        System.out.println("Opening word file in word class ");
    }
}