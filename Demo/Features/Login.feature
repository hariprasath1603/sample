Feature: Login with Valid Credentials

@sanity 
  Scenario: Successful Login with Valid Credentials
    Given User Launch browser
    And opens URL "https://demo.nopcommerce.com/"
    When User navigate to MyAccount menu
    And click on Login
    And User enters Email as "Admin" and Password as "admin123"
    And Click on Login button
    Then User navigates to MyAccount Page
