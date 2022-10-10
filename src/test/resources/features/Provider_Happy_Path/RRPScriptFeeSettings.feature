Feature: RRP_Script_Fee_Settings


  @WEB @PROVIDER_RRP_SCRIPT_FEE_SETTING @PROVIDER_HAPPY_PATH
  Scenario Template: S1- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |

  @WEB @PROVIDER_RRP_SCRIPT_FEE_SETTING @PROVIDER_HAPPY_PATH
  Scenario Template: S2- RRP Script Instructions Fee Setup - Patient to Collect Script

    Given As a Provider I am on HomePage and navigate to RRP Script Instructions in "<System_Menu>"
    And I navigate to RRP Script Instructions Settings and i click edit button
    When I navigate to RRP Script Instructions Fee Setup Page and Select Health centre "<Health_Centre>"
    And I Click Edit on a location record in Grid & Selected Location must be auto-populated
         |&EDIT_LOCATION_DATA&|

    Examples:
      | System_Menu       | Health_Centre |
      | Repeat Script Fee | VM04Practice  |

#  @WEB @PROVIDER_HAPPY_PATH @RRP_SCRIPT_FEE_SETTING
#  Scenario Template: S1- User Successfully logs in to the beta v2 Portal.
#    Given As a user I am on beta MMH login Page
#    And I enter "<Email Address>" and "<Password>" For Beta
#    When I click SignIn button
#    Then I should see user successfully logs in to the MMH portal
#    Examples:
#      | Email Address | Password   |
#      | &EMAIL&       | &PASSWORD& |


#  @WEB @PROVIDER_RRP1 @PROVIDER_HAPPY_PATH
#  Scenario Template: S1- RRP Script Instructions Settings - Disable.
#    Given As a Provider I am on HomePage and navigate to RRP Script Instructions in "<System_Menu>"
#    And I navigate to RRP Script Instructions Settings and click edit button
#    When I disable the RRP Script Instructions Settings "<Details>"
#    Then I should verify disabled RRP Script Instructions Settings "<Details>"
#
#    Examples:
#      | System_Menu       | Details    |
#      | Repeat Script Fee | &PASSWORD& |