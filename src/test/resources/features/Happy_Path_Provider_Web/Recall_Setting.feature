Feature: Recall Setting

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&PATIENT_USER_LOGIN&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_HAPPY_PATH @RECALL_SETTING1
  Scenario Template:S1-Provider Enable Recall Remainder

    Given As a Provider I am on HomePage and navigate to Recall Setting page
    And I click edit button select the Recall Setting Health centre "<Location>"
    When I enter the number of days recall reminder text box and click save button "<Recall_Reminder_Details>"
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    Examples:
      | Location     | Recall_Reminder_Details |
      | VM03Location | 1                       |

  @WEB @PROVIDER_HAPPY_PATH @RECALL_SETTING
  Scenario Template:S2-Provider Disable Recall Remainder

    Given As a Provider I am on HomePage and navigate to Recall Setting page
    And I click edit button select the Recall Setting Health centre "<Location>" Disable Recalls Remainder No button
    When I enter the number of days recall reminder text box and click save button "<Recall_Reminder_Details>"
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    Examples:
      | Location     | Recall_Reminder_Details |
      | VM03Location | 1                       |


  @WEB @PROVIDER_HAPPY_PATH @RECALL_SETTING
  Scenario Template:S3-Patient Read Recall Remainder Message

    Given As a Provider I am on HomePage and navigate to Recall Setting page
    And I click edit button select the Recall Setting Health centre "<Location>" Disable Recalls Remainder No button
    When I enter the number of days recall reminder text box and click save button "<Recall_Reminder_Details>"
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    Examples:
      | Location     | Recall_Reminder_Details |
      | VM03Location | 1                       |

  @WEB @PROVIDER_HAPPY_PATH @RECALL_SETTING
  Scenario Template:S4-Patient Book Appointment through Recall Remainder Message

    Given As a Provider I am on HomePage and navigate to Recall Setting page
    And I click edit button select the Recall Setting Health centre "<Location>" Disable Recalls Remainder No button
    When I enter the number of days recall reminder text box and click save button "<Recall_Reminder_Details>"
    And As a user I am on HomePage and navigate to Book Appointment Page in Appointments
    Examples:
      | Location     | Recall_Reminder_Details |
      | VM03Location | 1                       |




