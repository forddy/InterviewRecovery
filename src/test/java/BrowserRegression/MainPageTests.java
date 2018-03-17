package BrowserRegression;

import BrowserManipulation.Browser;
import BrowserManipulation.HomePage;
import BrowserManipulation.JobLink;
import BrowserManipulation.Pages;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class MainPageTests {

    @Test
    public void homePageOpens() {
        Pages.homePage().goTo();
        Assert.assertTrue(Pages.homePage().isAt());

    }
    @After
    public void cleanUp() {
        Browser.close();

    }
}