Feature: Randstad SDET Job Search

  @UITests
  Scenario: Job Search
    Given I have a job search URL
    When I click on job search
    Then the number of jobs is displayed