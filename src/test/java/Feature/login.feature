
@Login

Feature: login functionality

  Scenario: verify the login by entering the valid username and password

    Given Navigates to login page

    When Enters the credentials
    |username |password   |
    |student  |Password123|

    Then verify the login status
      | text                   |
      | Logged In Successfully |

  Scenario: verify the login by entering valid username and invalid password

    Given Navigates to login page

    When Enters the credentials
      | username | password |
      | student  | invalid  |

    Then verify the login status
      | text                      |
      | Your password is invalid! |

  Scenario: verify the login by entering invalid username and valid password

    Given Navigates to login page

    When Enters the credentials
      | username | password |
      | invalid  | invalid  |

    Then verify the login status
      | text                      |
      | Your username is invalid! |

  Scenario: verify the login by entering invalid username and invalid password

    Given Navigates to login page

    When Enters the credentials
      | username | password |
      | invalid  | invalid  |

    Then verify the login status
      | text                      |
      | Your username is invalid! |



    




