Feature: Search Memberships
  As a admin I have be able to success login
  So that i can manage memberships feature

  @SearchMembershipsByName
  Scenario: As an admin I can search for data in the membership page
    Given admin on login page
    When admin input valid username
    And admin input valid password
    And admin click login button
    And admin on dashboard page
    And admin click memberships menu
    And admin click filter icon
    And admin click search icon
    Then admin input membership name keywords listed in the search field

  @SearchMembershipsInvData
  Scenario: As an admin I can search for data invalid in the membership page
    Given admin on login page
    When admin input valid username
    And admin input valid password
    And admin click login button
    And admin on dashboard page
    And admin click memberships menu
    And admin click filter icon
    And admin click search icon
    And admin input invalid membership name keywords listed in the search field
    Then system displays data not found

  @SearchMembershipsById
  Scenario: As an admin I can search for data in the membership page by valid id
    Given admin on login page
    When admin input valid username
    And admin input valid password
    And admin click login button
    And admin on dashboard page
    And admin click memberships menu
    And admin click filter icon
    And admin click search icon
    Then admin input membership id keywords listed in the search field

  @SearchMembershipsInvId
  Scenario: As an admin I can search for data invalid id in the membership page
    Given admin on login page
    When admin input valid username
    And admin input valid password
    And admin click login button
    And admin on dashboard page
    And admin click memberships menu
    And admin click filter icon
    And admin click search icon
    And admin input invalid membership id keywords listed in the search field
    Then system displays data not found

  @SearchMembershipsByLevel
  Scenario: As an admin I can search for data membership by level on membership page
    Given admin on login page
    When admin input valid username
    And admin input valid password
    And admin click login button
    And admin on dashboard page
    And admin click memberships menu
    And admin click filter icon
    And admin click dropdown level
    And admin select level
    Then system displays data membership by level

  @SearchMembershipsByLevelAndSearch
  Scenario: As an admin I can search for data membership by level on membership page
    Given admin on login page
    When admin input valid username
    And admin input valid password
    And admin click login button
    And admin on dashboard page
    And admin click memberships menu
    And admin click filter icon
    And admin click dropdown level
    And admin select level
    And system displays data membership by level
    And admin click search icon
    Then admin input membership name keywords listed in the search field by level

