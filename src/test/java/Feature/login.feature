
@Login

Feature: login functionality

  Scenario: verify the login by entering the valid username and password

    Given Launch the browser and navigates to login page

    When Enters the username and password
    |username |password   |
    |student  |Password123|

    Then User should be on home page

  Scenario: verify the login by entering the invalid username and password

    Given Launch the browser and navigates to login page

    When Enters the cedentials
      |username |password   |
      |student123  |Password123|

    Then verify the login status

  Scenario: verify the login by entering the valid username and invalid password

    When Enters the cedential
      |username |password   |
      |student  |Pass123   |




