Feature: Fundamentals

#    Note: {
#    5:Login as Existing patient with valid email address & password
#    6:Click on Reset password now & receive mail
#    7:Click Logout after Successful login
#    8:Homepage is displayed after successful login
#    These test Case Covered The Scenario NO: S1
#  }

  @WEB  @FUNDAMENTALS @SANITY_PATH
  Scenario Template: S1- User Successfully logs in to the beta v2 Portal.

    Given As a Existing Patient Login with valid "<Email Address>" and "<Password>"
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    And I log out from Patient Portal and Verify the Login page
    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |