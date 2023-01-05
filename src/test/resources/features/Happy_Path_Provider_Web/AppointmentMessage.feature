Feature: Appointment Message

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_HAPPY_PATH @PRE-SCREENING_SETTINGS
  Scenario Template: As a User I have to enable Banner Message to Yes in Appointment Message page

    Given As a Provider I am on HomePage and navigate to Appointment Message page
    And I select Health Center "<Health_Centre_VM3>" and I enable Banner Message to Yes
    And I fill Banner Heading "<Banner_Heading>" and Banner Message fields "<Banner_Message>"
    When I should Verify the Appointment Message "<Health_Centre_VM3>" and "<Banner_Message>" details are saved
    And As a user I am on Patient HomePage and I logout from the Patient login
    Then I Enter the Location in search box and I verify the created Appointment "<Location_VM3>"
    And I click the Book Now button "<Location_VM3>"
    And I should verify the Banner heading "<Banner_Heading>" and Banner Messages "<Banner_Message>" are saved

    Examples:
      | Health_Centre_VM3             | Banner_Heading   | Banner_Message   | Location_VM3                 |
      | &PRE_SCREENING_HEALTH_CENTRE& | &BANNER_HEADING& | &BANNER_MESSAGE& | &PRE_SCREENING_LOCATION_VM3& |

  @WEB @PROVIDER_HAPPY_PATH @PRE-SCREENING_SETTINGS
  Scenario Template: As a User I have to enable Banner Message to No in Appointment Message page

    Given As a Provider I am on HomePage and navigate to Appointment Message page
    And I select Health Center "<Health_Centre_VM3>" and I enable Banner Message to No
    And I fill Banner Heading "<Banner_Heading>" and Banner Message fields "<Banner_Message>"
    Then I should Verify the Appointment Message "<Health_Centre_VM3>" and "<Banner_Message>" details are saved
    And As a user I am on Patient HomePage and I logout from the Patient login
    And I Enter the Location in search box and I verify the created Appointment "<Location_VM3>"
    When I click the Book Now button "<Location_VM3>"
    Then I should verify the Banner heading "<Banner_Heading>" and Banner Messages "<Banner_Message>" are not displayed

    Examples:
      | Health_Centre_VM3             | Banner_Heading   | Banner_Message   | Location_VM3                 |
      | &PRE_SCREENING_HEALTH_CENTRE& | &BANNER_HEADING& | &BANNER_MESSAGE& | &PRE_SCREENING_LOCATION_VM3& |



