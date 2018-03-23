package com.company.cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class UIHooks {

    @Before
    public void beforeCallingScenario() {
        System.out.println("************* About to start the scenario.");
    }

    @After
    public void afterCallingScenario() {
        System.out.println("************* YAY - finished running the scenario. ");

    }
//    @After("@UITests")
//    public static void tearDown() {
//        Browser.close();
//    }
}
