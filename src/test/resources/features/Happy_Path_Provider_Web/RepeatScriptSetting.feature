Feature: Repeat Script Setting

  @WEB @PROVIDER_RRP @PROVIDER_HAPPY_PATH
  Scenario Template: S1- User Successfully logs in to the Provider Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |

  @WEB @PROVIDER_RRP @PROVIDER_HAPPY_PATH
  Scenario Template: S1- RRP Script Instructions Settings - Disable.
    Given As a Provider I am on HomePage and navigate to RRP Script Instructions in "<System_Menu>"
    And I navigate to RRP Script Instructions Settings and click edit button
    When I disable the RRP Script Instructions Settings "<Details>"
    Then I should verify disabled RRP Script Instructions Settings "<Details>"

    Examples:
      | System_Menu       | Details                            |
      | Repeat Script Fee | &RRP_SCRIPT_INSTRUCTIONS_SETTINGS& |











#  Login as Provider with valid credentials in MMH
#  Click Systems Menu -> RRP Script Fee Settings -> RRP Script Instructions Settings
#  Click Edit
#  Select Health centre
#  Enable RRP Script Instructions Fee for Location(s) wise: "No"
#  Click Save
#  Only then changes made in Repeat Script Settings are applicable
