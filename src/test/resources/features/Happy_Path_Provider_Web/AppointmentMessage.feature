Feature: Appointment Message


  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&EMAIL_FOR_PATIENT_HARRY_HARRY&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_HAPPY_PATH @PRE-SCREENING_SETTINGS
  Scenario Template: As a User I have to enable Banner Message to Yes in Appointment Message page

    Given As a user I am on Provider Homepage
    And I click Systems Menu and I navigating to Appointment Message page
    And I select Health Center "<Health_Centre_VM3>" and I enable Banner Message to Yes
    And I fill Banner Heading "<Banner_Heading>" and Banner Message fields "<Banner_Message>"
    When I click the Update Button
    Then I should Verify the Appointment Message "<Health_Centre_VM3>" and "<Banner_Message>" details are saved

    Examples:

      | Health_Centre_VM3             | Banner_Heading   | Banner_Message   |
      | &PRE_SCREENING_HEALTH_CENTRE& | &BANNER_HEADING& | &BANNER_MESSAGE& |


  @WEB @PROVIDER_HAPPY_PATH @PRE-SCREENING_SETTINGS
  Scenario Template: As a user I have to verify the Banner heading and Banner Messages are updated

    Given As a user Iam on Patient login page
    And I logout from the Patient login and click All radio button
    And I Enter the Location in search box and I verify the created Appointment "<Location_VM3>"
    When I click the Book Now button "<Location_VM3>"
    Then I should verify the Banner heading "<Banner_Heading>" and Banner Messages "<Banner_Message>" are saved

    Examples:

      | Banner_Heading   | Banner_Message   | Location_VM3                 |
      | &BANNER_HEADING& | &BANNER_MESSAGE& | &PRE_SCREENING_LOCATION_VM3& |





  @WEB @PROVIDER_HAPPY_PATH @PRE-SCREENING_SETTINGS
  Scenario Template: As a User I have to enable Banner Message to No in Appointment Message page

    Given As a user I navigate to Provider Page
    And I click Systems Menu and I navigating to Appointment Message page
    And I select Health Center "<Health_Centre_VM3>" and I enable Banner Message to No
    And I fill Banner Heading "<Banner_Heading>" and Banner Message fields "<Banner_Message>"
    When I click the Update Button
    Then I should Verify the Appointment Message "<Health_Centre_VM3>" and "<Banner_Message>" details are saved

    Examples:

      | Health_Centre_VM3             | Banner_Heading   | Banner_Message   |
      | &PRE_SCREENING_HEALTH_CENTRE& | &BANNER_HEADING& | &BANNER_MESSAGE& |


  @WEB @PROVIDER_HAPPY_PATH @PRE-SCREENING_SETTINGS
  Scenario Template: As a user I should verify the Banner heading and Banner Messages are not displayed

    Given As a user Iam on Patient login page
    And I logout from the Patient login and click All radio button
    And I Enter the Location in search box and I verify the created Appointment "<Location_VM3>"
    When I click the Book Now button "<Location_VM3>"
    Then I should verify the Banner heading "<Banner_Heading>" and Banner Messages "<Banner_Message>" are not displayed

    Examples:

      | Banner_Heading   | Banner_Message   | Location_VM3                 |
      | &BANNER_HEADING& | &BANNER_MESSAGE& | &PRE_SCREENING_LOCATION_VM3& |

