package com.company;

import com.Company.Browser;
import com.Company.Pages;
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
        //Pages.homePage().goTo();
        Pages.jobLink().goToJobLink();
        Assert.assertTrue(Pages.jobLink().isAt());
        }

    @Test
    //Search for an awesome job
    public void searchJob() {
      //Pages.homePage().goTo()
        Pages.jobLink().goToJobLink();
        Pages.jobLink().searchJob();

    }



    @Test
    //Confirm about link page opens and title correct
    public void aboutLinkOpens() {
        Pages.aboutLink().goToAboutLink();
        Assert.assertTrue(Pages.aboutLink().isAt());
        Browser.close();
    }

}