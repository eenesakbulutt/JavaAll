package com.syntax.class26.task2;

public abstract class File {

/*
* Create a class File that will have the following behaviors: open, edit, close.
* Edit and close are implemented method while open is an abstract.
*  Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
* Example: to open .java file we need notepad++ or sublime text, to open .doc file
* we need Microsoft word to be installed etc
* */


abstract void open();

void edit(){
    System.out.println("Editing the file");
}
void close(){
    System.out.println("File closed");
}

}

class JavaFile extends File{
void open(){
    System.out.println("Use Intellij To open");
}
}

class PDFFile extends File{
    void open(){
        System.out.println("Use Adobe PDF Reader To open this file");
    }

}

class WordFile extends File{
    void open(){
        System.out.println("Use MS Word To open");
    }
}




