Feature: RRP_Pre-Screening Settings

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&EMAIL_FOR_PATIENT_HARRY_HARRY&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_HAPPY_PATH @PRE-SCREENING_SETTINGS
  Scenario Template:S1-Disable Pre-Screening Covid PopUp Settings in Provider

    Given As a Provider I am on HomePage and navigate to  Pre-Screening Settings
    And I click Systems Menu and I navigating to Pre-Screening Settings page
    And I click Edit button to select "<Health_Centre>" and "<Location>"
    When As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    And I navigate to Appointmet Menu and I click the Book Appointment
    And I select "<Health_Centre>" and "<Location>"
    Then I should verify the Covid Pre-Screening popup is displayed
    Examples:
      | Health_Centre                 | Location                     |
      | &PRE_SCREENING_HEALTH_CENTRE& | &PRE_SCREENING_LOCATION_VM3& |

  @WEB @PROVIDER_HAPPY_PATH @PRE-SCREENING_SETTINGS
  Scenario Template:S2-Enable Pre-Screening Covid PopUp Settings in Provider
    Given As a Provider I am on HomePage and navigate to  Pre-Screening Settings
    And I click Systems Menu and I navigating to Pre-Screening Settings page
    And I click Edit button to select "<Health_Centre_VM4>" and "<Location_VM4>"
    When As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    And I navigate to Appointmet Menu and I click the Book Appointment
    And I select "<Health_Centre>" and "<Location>"
    Then I should verify the Covid Pre-Screening popup is displayed

    Examples:
      | Health_Centre_VM4   | Location_VM4   |
      | &HEALTH_CENTER_VM4& | &LOCATION_VM4& |