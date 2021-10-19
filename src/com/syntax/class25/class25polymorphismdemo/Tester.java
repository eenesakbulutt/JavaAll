package com.syntax.class25.class25polymorphismdemo;

public class Tester {
    public static void main(String[] args) {

        WebDriver[] drivers = {new GoogleChrome(), new Firefox(), new Safari()};

        for (WebDriver drive : drivers) {
            testOnAllBrowsers(drive);
        }
    }


static void testOnAllBrowsers(WebDriver webDriver){

        webDriver.openBrowser();
        webDriver.loadWebsite("www.google.com");
        webDriver.Test1();
        webDriver.Test2();
        webDriver.TestFileDownload();
        webDriver.closeBrowser();




}










}