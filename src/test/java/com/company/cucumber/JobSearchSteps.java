package com.company.cucumber;

import com.Company.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class JobSearchSteps {

    @Given("^I have a job search URL$")
    public void iHaveAJobSearchURL()  {
    }
    @When("^I click on job search$")
    public void iClickOnTheJobURL()  {
        Pages.jobLink().goToJobLink();
        Assert.assertTrue(Pages.jobLink().isAt());
    }
    @Then("^the number of jobs is displayed$")
    public void theNumberOfJobsIsDisplayed()  {
        Pages.jobLink().goToJobLink();
        Pages.jobLink().searchJob();
    }
}
