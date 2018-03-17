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
    //click on job link and check title on new job page
    public void homePageHasJobLink() {
        Pages.homePage().goTo();
        Pages.homePage().goToJobLink();

        //TEST PARTIALLY WORKING - clicks link but need to handle cookie popup / sub frame
        //Assert.assertTrue(Pages.jobLink().isAt());
    }
// fix up below after cookie is handled
//    @After
//    public void cleanUp() {
//        Browser.close();
//
//    }
}