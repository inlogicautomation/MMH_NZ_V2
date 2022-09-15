Feature: My Health Centre

  @WEB  @MY_HEALTH_CENTRE @SANITY_PATH
  Scenario Template: S1- User Successfully logs in to the beta v2 Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address                 | Password                         |
      | &EMAIL_FOR_MY_HEALTH_RECORDS& | &PASSWORD_FOR_MY_HEALTH_RECORDS& |

#    Note: {
#    412:Login into ManageMyHealth as a Patient
#    413:Click on the Practice Name under My Health Menu
#    414:Click on the Notice Board Tab
#    416:Click On connect health centre
#    These test Case Covered The Scenario NO: S2
#  }

  @WEB @MY_HEALTH_CENTRE @SANITY_PATH
  Scenario Template: S2- Existing Patient view the My Health Centre details.

    Given As a Existing user I am on HomePage and I click to Practice "<Name>" under the My health menu
    And I am on HomePage and I click Notice board under the My health menu
    And I am on HomePage and I click connect health centre under the My health menu
    When I click Connect a health centre
    Then I search for the Health Centre "<Name>"and click connect
    Examples:
      | Name            |
      | &HEALTH_CENTRE_NAME& |