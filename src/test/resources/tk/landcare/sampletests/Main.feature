Feature: Learning selenium-cucumber using java
  As a tester I want to learn selenium-cucumber

  Scenario: I am learning selenium-cucumber
    Given I know "selenium-webdriver" and "Cucumber"
    When I navigate to "http://www.seleniumcucumber.info"
    And I make use of "Predefined Steps"
    Then I have learned "selenium-cucumber"

  Scenario: I open the Landcare Research website and look for jobs
    Given I navigate to "https://careers.sciencenewzealand.org/landcare-research/landcare-research-jobs"
    When I click on element having css "a[href='/search']"
    Then element having css "div.jobItem" should be present
    And I wait 5 seconds for element having css "a[href='landcare-research/about-us']" to display
    And I click on element having css "a[href='landcare-research/about-us']"
    And the sky is blue
    And I wait for 30 sec
