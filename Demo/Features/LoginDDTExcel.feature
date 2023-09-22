
@tag
Feature:  Login data driven with Excel

  @tag1
  Scenario: Login data driven Excel
    Given User Launch browser
    Andpens URL "http://localhost/opencart/uplaod"
    When User navigate to MyAccount menu
    And click on login
    And check user navigates to MyAccount page by passing Excel
    Then I validate the outcomes
    And check more outcomes



    Examples: 
     	|row_index|
			|1|
			|2|
			|3|