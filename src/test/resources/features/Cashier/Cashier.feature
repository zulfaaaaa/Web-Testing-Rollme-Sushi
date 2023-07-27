Feature: Cashier
  As a admin I have be able to success login
  So that i can manage cashier feature

  @DeleteCashier
  Scenario: As an admin I can Delete Cashier
    Given admin on login page
    When admin input valid username
    And admin input valid password
    And admin click login button
    And admin on dashboard page
    And admin click cashier menu
    And admin select target delete cashier
    And admin click icon delete cashier
    Then admin click pop up yes delete cashier

  @SearchCashierByName
  Scenario: As an admin I can search for data in the membership page
    Given admin on login page
    When admin input valid username
    And admin input valid password
    And admin click login button
    And admin on dashboard page
    And admin click cashier menu
    And admin click filter icon on page cashier
    And admin click search icon on page cashier
    Then admin input cashier name keywords listed in the search field

    @AddCashier
    Scenario: As an admin I can add cashier
      Given admin on login page
      When admin input valid username
      And admin input valid password
      And admin click login button
      And admin on dashboard page
      And admin click cashier menu
      And admin click add employee
      And admin input name cashier
      And admin input valid password for add cashier
      And admin input confirm password
      And admin select role
      And admin click save for add cashier
      And admin confirm yes
      Then system display success add new cashier


