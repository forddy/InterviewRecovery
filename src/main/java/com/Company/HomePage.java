package com.Company;

public class HomePage {

    static private String homePage = "https://randstad.com";
    static private String homePageTitle = "Randstad";

    public void goTo() {
        Browser.goTo(homePage);
    }

    public boolean isAt() {
        return Browser.title().equals(homePageTitle);

    }


}
