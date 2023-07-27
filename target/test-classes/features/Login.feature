Feature: Login
  As an admin I have be able to success login
  so that i can see dashboard page

  @TC01-PositiveLogin
  Scenario: As an admin I want to login with valid username dan password
    Given admin on login page
    When admin input valid username
    And admin input valid password
    And admin click login button
    Then admin on dashboard page
