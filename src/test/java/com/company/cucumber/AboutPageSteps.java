package com.company.cucumber;

import com.Company.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AboutPageSteps {

    @Given("^I have an about page URL$")
    public void iHaveAnAboutPageURL() {

    }

    @When("^I click on about page URL$")
    public void iClickOnAboutPageURL() {
        Pages.aboutLink().goToAboutLink();
    }

    @Then("^the about page is displayed$")
    public void theAboutPageIsDisplayed() {
        Assert.assertTrue(Pages.aboutLink().isAt());

    }

}