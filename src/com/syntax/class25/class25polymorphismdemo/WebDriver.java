package com.syntax.class25.class25polymorphismdemo;

public class WebDriver {

   void openBrowser(){System.out.println("Opening browser");}
    void loadWebsite(String website){System.out.println("Load the website inside the browser");}
    void Test1(){System.out.println("Enter login info and check if you can login");}
    void Test2(){System.out.println("Click on buy button and make sure you can place order");}
    void TestFileDownload(){System.out.println("Testing file download");}
    void closeBrowser(){System.out.println("Close browser");
    }

}

class GoogleChrome extends WebDriver{
    void openBrowser(){System.out.println("Opening browser");}
    void loadWebsite(String website){System.out.println("Load the website inside the browser in Google Chrome");}
    void Test1(){System.out.println("Enter login info and check if you can login in Google Chrome");}
    void Test2(){System.out.println("Click on buy button and make sure you can place order in Google Chrome");}
    void TestFileDownload(){System.out.println("Testing file download in Google Chrome");
    }void closeBrowser() {
        System.out.println("Close browser Google Chrome");

    }

}
class Firefox extends WebDriver {
    void openBrowser() {System.out.println("Opening browser in FireFox");}
    void loadWebsite(String website) {System.out.println("Load the website inside the browser using Firefox");}
    void Test1() {System.out.println("Enter login info and check if you can login in Firefox");}
    void Test2() {System.out.println("Click on buy button and make sure you can place order in Firefox");}
    void TestFileDownload() {System.out.println("Testing file download in Firefox");}
    void closeBrowser() {
        System.out.println("Close browser Firefox in Firefox");

    }
}
class Safari extends WebDriver{
    void openBrowser(){System.out.println("Opening browser in Safari");}
    void loadWebsite(String website){System.out.println("Load the website inside the browser using Safari");}
    void Test1(){System.out.println("Enter login info and check if you can login in Safari");}
    void Tes2(){System.out.println("Click on buy button and make sure you can place order in Safari");}
    void TestFileDownload() {System.out.println("Testing file download in Safari");}
    void closeBrowser() {System.out.println("Close browser in Safari");


        }
    }

