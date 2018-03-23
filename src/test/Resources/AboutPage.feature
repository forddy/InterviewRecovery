Feature: about page

  @UITests
  Scenario: about page title
    Given I have an about page URL
    When I click on about page URL
    Then the about page is displayed

