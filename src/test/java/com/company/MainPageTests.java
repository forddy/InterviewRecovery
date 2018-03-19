package com.company;

import com.Company.Browser;
import com.Company.Pages;
import org.junit.After;
import org.junit.AfterClass;
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
    public void jobLinkOpens() {
        Pages.jobLink().goToJobLink();
        Assert.assertTrue(Pages.jobLink().isAt());
        }

    @Test
    //Search for an awesome job
    public void searchJob() {
        Pages.jobLink().goToJobLink();
        Pages.jobLink().searchJob();
    }


    @Test
    //Confirm about link page opens and title correct
    public void aboutLinkOpens() {
        Pages.homePage().goTo();
        Pages.aboutLink().goToAboutLink();
        Assert.assertTrue(Pages.aboutLink().isAt());

        }


@AfterClass
public static void cleanup() {
Browser.close();
}

}