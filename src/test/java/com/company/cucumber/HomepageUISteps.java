package com.company.cucumber;

import com.Company.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class HomepageUISteps {
    @Given("^I have a URL$")
        public void I_have_a_URL() {

    }
    @When("^I click on the URL$")
        public void I_click_on_the_URL() {
        Pages.homePage().goTo();
    }
    @Then("^the home page is displayed$")
        public void the_home_page_is_displayed() {
        Assert.assertTrue(Pages.homePage().isAt());

    }

}
