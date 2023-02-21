Feature: Resources

  @WEB @RESOURCES @SANITY_PATH @SANITY_JENKINS
  Scenario Template: S1- User Successfully logs in to the beta v2 Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address                 | Password                         |
      | &EMAIL_FOR_MY_HEALTH_RECORDS& | &PASSWORD_FOR_MY_HEALTH_RECORDS& |


#    Note: {

#   419:Navigate to Resources and view Activated resources
#   420:Navigate to Health Navigator resource
#   421:Navigate to Everybody Resource
#   422:Navigate to Unite against Covid-19 resource
#    These test Case Covered The Scenario NO: S3
#  }

  @WEB @RESOURCES @SANITY_PATH @SANITY_JENKINS
  Scenario: S1- Navigate to Resources and view Activated resources.

    Given As a Existing user I am on HomePage and navigate to Resources
    And I view the Activated resources.
    And Navigate to Health Navigator resource
    And Navigate to Everybody Patient sheet Resource
    And Navigate to Unite against Covid resource
