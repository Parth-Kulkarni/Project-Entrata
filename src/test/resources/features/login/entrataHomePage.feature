Feature: As a end user I want to validate the Entrata home page

#  The below feature demonstrates the testcases by highlighting the testing of
#  the different functionalities and scenarios we use Scenario Scenario Outline:
#  to pass the test data for checking the valid and invalid scenarios
#  Use the TestRunner file to run the testcases and for running a specific scenarios
#  pass the Tags in tags section of the testrunner

  @SignIn
  Scenario Outline: To validate the Sign In Page
  	Given I click on the Sign In button
    Then I click on Property Manager Login button
    Then I enter username "<Username>"
    And I enter password "<Password>"
    Then I click on SignIn button

    Examples:
    | Username | Password |
    | abc      | acc1123  |

  @ResidentialPay
  Scenario: To validate the ResidentialPay page under Property Management section
    Given I hover on Products section
    Then I click on Residential Pay which is under Products section
    And I validate whether I am on the Residential Page

  @PropertyManagement
  Scenario: To validate the Property Management section
    Given I click on Property Management section
    And I validate whether I am on the Property Management Page
    Then I click on Access Control button
    And I validate whether I am on Entrata Access Connect page

  
   
