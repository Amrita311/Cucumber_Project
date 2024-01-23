@Login_Outline

Feature: Login functionality

  Scenario Outline: verify the login by entering the username and password

    Given Navigates to login page

    When Enters the credentials
      | username   | password   |
      | <userName> | <Password> |

    Then verify the login status
      | text   |
      | <text> |

    Examples:
      | userName | Password    | text                      |
      | student  | Password123 | Logged In Successfully    |
      | student  | invalid     | Your password is invalid! |
      | invalid  | Password123 | Your username is invalid! |
      | invalid  | invalid     | Your username is invalid! |
