package BrowserManipulation;

import org.openqa.selenium.By;

public class HomePage {

    static private String homePage = "https://randstad.com";
    static private String homePageTitle = "Randstad";

    public void goTo() {
        Browser.goTo(homePage);
    }

    public boolean isAt() {
        return Browser.title().equals(homePageTitle);

    }

    public void goToJobLink() {
        Browser.driver.findElement(By.linkText("find a job")).click();

    }
}
