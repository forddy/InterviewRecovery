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
    //Confirm home page opens and the title is correct
    public void homePageOpens() {
        Pages.homePage().goTo();
        Assert.assertTrue(Pages.homePage().isAt());
      }

    @Test
    //Confirm job link page opens and title correct
    public void homePageHasJobLink() {
        //Pages.homePage().goTo();
        Pages.jobLink().goToJobLink();
        Assert.assertTrue(Pages.jobLink().isAt());
        Browser.close();
    }


}