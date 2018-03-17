package com.Company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//set browser as chrome
public class Browser {

    static public WebDriver driver = new ChromeDriver();

    //create goTo method to accept url variable
    public static void goTo(String url) {
        driver.get(url);
    }
//create title method to return current title for assertion
    public static String title() {
        return driver.getTitle();
    }

    //close the browser after tests
    public static void close() {

        driver.quit();
    }

}

