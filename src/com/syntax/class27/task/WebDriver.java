package com.syntax.class27.task;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public interface WebDriver {


/*Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser(),
closeBrowser(),
maximizeWindow();
findElement();
Create 2 classes that implements Webdriver interface:
ChromeDriver and FirefoxDriver.
 */

    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();
}

class ChromeDriver implements WebDriver{


    @Override
    public void openBrowser() {
        System.out.println("Open Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Google Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the Google Chrome Window");
    }

    @Override
    public void findElement() {
        System.out.println("Find elements in Google Chrome");
    }
}

class FirefoxDriver implements  WebDriver{


    @Override
    public void openBrowser() {
        System.out.println("Open FireFox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close FireFox Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize FireFox window");
    }

    @Override
    public void findElement() {
        System.out.println("Find elements in FireFox");
    }
}








