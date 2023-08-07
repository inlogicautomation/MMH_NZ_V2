Feature: Appointment Message

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_MESSAGE1
  Scenario Template:S1-As a User I have to enable Easy Booking Banner Message to Yes in Appointment Message page

    Given As a Provider I am on HomePage and navigate to Appointment Message page
    And I select Health Center "<Health_Centre>" and I enable Banner Message to Yes
    And I fill Banner Heading "<Banner_Heading>" and Banner Message fields "<Banner_Message>"
    When I should Verify the Appointment Message "<Health_Centre>" and "<Banner_Message>" details are saved
    And As a user I am on Patient HomePage and I logout from the Patient login
    Then I Enter the Location in search box and I verify the created Appointment "<Location>"
    And I click the Book Now button "<Location>"
    And I should verify the Banner heading "<Banner_Heading>" and Banner Messages "<Banner_Message>" are saved

    Examples:
      | Health_Centre                 | Banner_Heading   | Banner_Message   | Location                 |
      | &PRE_SCREENING_HEALTH_CENTRE& | &BANNER_HEADING& | &BANNER_MESSAGE& | &PRE_SCREENING_LOCATION& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_MESSAGE1
  Scenario Template:S2-As a User I have to enable Easy Booking Banner Message to No in Appointment Message page

    Given As a Provider I am on HomePage and navigate to Appointment Message page
    And I select Health Center "<Health_Centre>" and I enable Banner Message to No
    And I fill Banner Heading "<Banner_Heading>" and Banner Message fields "<Banner_Message>"
    When I should Verify the Appointment Message "<Health_Centre>" and "<Banner_Message>" details are saved
    And As a user I am on Patient HomePage and I logout from the Patient login
    And I Enter the Location in search box and I verify the created Appointment "<Location>"
    Then I click the Book Now button "<Location>"
    And I should verify the Banner heading "<Banner_Heading>" and Banner Messages "<Banner_Message>" are not displayed

    Examples:
      | Health_Centre                 | Banner_Heading   | Banner_Message   | Location                 |
      | &PRE_SCREENING_HEALTH_CENTRE& | &BANNER_HEADING& | &BANNER_MESSAGE& | &PRE_SCREENING_LOCATION& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_MESSAGE1
  Scenario Template:S3-As a User I have to enable Patient Portal(Web) Banner Message to yes in Appointment Message page

    Given As a Provider I am on HomePage and navigate to Appointment Message page
    And I select Health Center "<Health_Centre>" and I enable Patient Portal Web Banner Message to yes
    And I fill Patient Portal Web Banner Heading "<Banner_Heading>" and Banner Message fields "<Banner_Message>"
    When I should Verify the Appointment Message "<Health_Centre>" and "<Banner_Message>" details are saved
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    Then I should verify the Patient Portal Web Banner heading "<Banner_Heading>" and Banner Messages "<Banner_Message>" are displayed

    Examples:
      | Health_Centre                 | Banner_Heading   | Banner_Message   |
      | &PRE_SCREENING_HEALTH_CENTRE& | &BANNER_HEADING& | &BANNER_MESSAGE& |

  @WEB @PROVIDER_HAPPY_PATH @APPOINTMENTS_MESSAGE
  Scenario Template:S4-As a User I have to enable Patient Portal(Web) Banner Message to No in Appointment Message page

    Given As a Provider I am on HomePage and navigate to Appointment Message page
    And I select Health Center "<Health_Centre>" and I enable Patient Portal Web Banner Message to No
    And I fill Patient Portal Web Banner Heading "<Banner_Heading>" and Banner Message fields "<Banner_Message>"
    When I should Verify the Appointment Message "<Health_Centre>" and "<Banner_Message>" details are saved
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    And I navigate to Appointments Menu and I click the Book Appointment
    Then I should verify the Patient Portal Web Banner heading "<Banner_Heading>" and Banner Messages "<Banner_Message>" are not displayed

    Examples:
      | Health_Centre                 | Banner_Heading   | Banner_Message   |
      | &PRE_SCREENING_HEALTH_CENTRE& | &BANNER_HEADING& | &BANNER_MESSAGE& |


