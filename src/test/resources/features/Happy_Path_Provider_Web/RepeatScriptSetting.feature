Feature: Repeat Script Setting

  Background:Pref- User Successfully logs in to the Provider Portal.

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH Provider portal
    When As a user I am on Patient Portal login Page
    And I enter "&EMAIL_FOR_PATIENT&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal


  @WEB @PROVIDER_RRPS @PROVIDER_HAPPY_PATH @REPEAT_SCRIPT_SETTING
  Scenario Template: S1- RRP Script Instructions Settings - Disable.
    Given As a Provider I am on HomePage and navigate to RRP Script Instructions in "<System_Menu>"
    And I navigate to RRP Script Instructions Settings and click edit button
    When I disable the RRP Script Instructions Settings "<Details>"
    Then I should verify disabled RRP Script Instructions Settings "<Details>"

    Examples:
      | System_Menu             | Details                            |
      | RRP Script Fee Settings | &RRP_SCRIPT_INSTRUCTIONS_SETTINGS& |

  @WEB @PROVIDER_RRPS @PROVIDER_HAPPY_PATH @REPEAT_SCRIPT_SETTING
  Scenario Outline: S2- RRP Script Settings Default Provider - Rule A
    Given As a Provider I am on HomePage and navigate to Repeat Script Settings in "<System_Menu>"
    And I click the edit button and changing the data as per Rule A"<Details>"
    When I navigate to patient portal and verify the change
    Then I should see the changes based on Rule A
    Examples:
      | System_Menu            | Details                       |
      | Repeat Script Settings | &REPEAT_SCRIPT_SETTINGS_DATA& |

  @WEB @PROVIDER_RRPS @PROVIDER_HAPPY_PATH @REPEAT_SCRIPT_SETTING
  Scenario Outline: S3- RRP Script Settings Default Provider - Rule B
    Given As a Provider I am on HomePage and navigate to Repeat Script Settings in "<System_Menu>"
    And I click the edit button and changing the data as per Rule B"<Details>"
    When I navigate to patient portal and verify the change
    Then I should see the changes based on Rule B
    Examples:
      | System_Menu            | Details                       |
      | Repeat Script Settings | &REPEAT_SCRIPT_SETTINGS_DATA& |

  @WEB @PROVIDER_RRPS @PROVIDER_HAPPY_PATH @REPEAT_SCRIPT_SETTING
  Scenario Outline: S4- RRP Script Settings Default Provider - Rule C
    Given As a Provider I am on HomePage and navigate to Repeat Script Settings in "<System_Menu>"
    And I click the edit button and changing the data as per Rule C"<Details>"
    When I navigate to patient portal and verify the change
    Then I should see the changes based on Rule C
    Examples:
      | System_Menu            | Details                       |
      | Repeat Script Settings | &REPEAT_SCRIPT_SETTINGS_DATA& |

  @WEB @PROVIDER_RRPS @PROVIDER_HAPPY_PATH @REPEAT_SCRIPT_SETTING
  Scenario Outline: S5- RRP Script Settings - Restrict to Named Provider in each Location
    Given As a Provider I am on HomePage and navigate to Repeat Script Settings in "<System_Menu>"
    And I click the edit button and changing the data restricting to Named Provider in each Location"<Details>"
    When I navigate to patient portal and verify the change
    Then I should see the changes based on restricting to Named Provider in each Location"<Data_Details>"
    Examples:
      | System_Menu            | Data_Details                  | Details                       |
      | Repeat Script Settings | &REPEAT_SCRIPT_SETTINGS_INFO& | &REPEAT_SCRIPT_SETTINGS_DATA& |
#
  @WEB @PROVIDER_RRPS @PROVIDER_HAPPY_PATH @REPEAT_SCRIPT_SETTING
  Scenario Outline: S6- RRP Script Settings - Patient to Collect Script
    Given As a Provider I am on HomePage and navigate to Repeat Script Settings in "<System_Menu>"
    And I click the edit button and changing the data as per Patient to Collect Script requirements"<Details>"
    When I navigate to patient portal and verify the change
    Then I should see the changes based on Patient to Collect Script"<Script_Instructions>","<Script_Urgencies>","<Medication Details>" and "<Location Details>"
    Examples:
      | System_Menu            | Details                     | Script_Instructions   | Script_Urgencies   | Medication Details                            | Location Details              |
      | Repeat Script Settings | &PATIENT_TO_COLLECT_SCRIPT& | &SCRIPT_INSTRUCTIONS& | &SCRIPT_URGENCIES& | &DATA FOR PATIENT TO COLLECT TO PRESCRIPTION& | &REPEAT_SCRIPT_SETTINGS_DATA& |

  @WEB @PROVIDER_RRPS @PROVIDER_HAPPY_PATH @REPEAT_SCRIPT_SETTING
  Scenario Outline: S7- RRP Script Settings - Send Script by Post
    Given As a Provider I am on HomePage and navigate to Repeat Script Settings in "<System_Menu>"
    And I click the edit button and changing the data as per Send Script by Post requirements"<Details>"
    When I navigate to patient portal and verify the change
    Then I should see the changes based on Send Script by Post"<Script_Instructions>","<Script_Urgencies>","<Medication Details>" and "<Location Details>"
    Examples:
      | System_Menu            | Details               | Script_Instructions   | Script_Urgencies   | Medication Details             | Location Details              |
      | Repeat Script Settings | &SEND_SCRIPT_BY_POST& | &SCRIPT_INSTRUCTIONS& | &SCRIPT_URGENCIES& | &DATA FOR SENT SCRIPT BY POST& | &REPEAT_SCRIPT_SETTINGS_DATA& |

  @WEB @PROVIDER_RRPS @PROVIDER_HAPPY_PATH @REPEAT_SCRIPT_SETTING
  Scenario Outline: S8- RRP Script Settings - Send Script to Pharmacy
    Given As a Provider I am on HomePage and navigate to Repeat Script Settings in "<System_Menu>"
    And I click the edit button and changing the data as per Send Script to Pharmacy requirements"<Details>"
    When I navigate to patient portal and verify the change
    Then I should see the changes based on Send Script to Pharmacy"<Script_Instructions>","<Script_Urgencies>","<Medication Details>" and "<Location Details>"
    Examples:
      | System_Menu            | Details                   | Script_Instructions   | Script_Urgencies   | Medication Details                                 | Location Details              |
      | Repeat Script Settings | &SEND_SCRIPT_TO_PHARMACY& | &SCRIPT_INSTRUCTIONS& | &SCRIPT_URGENCIES& | &DATA FOR PRESCRIPTION BY SENT SCRIPT TO PHARMACY& | &REPEAT_SCRIPT_SETTINGS_DATA& |

  @WEB @PROVIDER_RRPS @PROVIDER_HAPPY_PATH @REPEAT_SCRIPT_SETTING
  Scenario Outline: S9- RRP Script Settings - Deliver Meds by Pharmacy
    Given As a Provider I am on HomePage and navigate to Repeat Script Settings in "<System_Menu>"
    And I click the edit button and changing the data as per Deliver Meds By Pharmacy requirements"<Details>"
    When I navigate to patient portal and verify the change
    Then I should see the changes based on Deliver Meds By Pharmacy"<Script_Instructions>","<Script_Urgencies>","<Medication Details>" and "<Location Details>"
    Examples:
      | System_Menu            | Details                    | Script_Instructions   | Script_Urgencies   | Medication Details                   | Location Details              |
      | Repeat Script Settings | &DELIVER_MEDS_BY_PHARMACY& | &SCRIPT_INSTRUCTIONS& | &SCRIPT_URGENCIES& | &DATA FOR DELIVERY MEDS BY PHARMACY& | &REPEAT_SCRIPT_SETTINGS_DATA& |


  @WEB @PROVIDER_RRPS @PROVIDER_HAPPY_PATH @REPEAT_SCRIPT_SETTING
  Scenario Outline: S10- RRP Script Settings - Deliver Via Zoom Pharmacy
    Given As a Provider I am on HomePage and navigate to Repeat Script Settings in "<System_Menu>"
    And I click the edit button and changing the data as per Deliver Via Zoom Pharmacy requirements"<Details>"
    When I navigate to patient portal and verify the change
    Then I should see the changes based on Deliver Via Zoom Pharmacy"<Script_Instructions>","<Script_Urgencies>","<Medication Details>" and "<Location Details>"
    Examples:
      | System_Menu            | Details                     | Script_Instructions   | Script_Urgencies   | Medication Details                            | Location Details              |
      | Repeat Script Settings | &DELIVER_VIA_ZOOM_PHARMACY& | &SCRIPT_INSTRUCTIONS& | &SCRIPT_URGENCIES& | &DATA FOR PATIENT TO COLLECT TO PRESCRIPTION& | &REPEAT_SCRIPT_SETTINGS_DATA& |

  @WEB @PROVIDER_RRPS @PROVIDER_HAPPY_PATH @REPEAT_SCRIPT_SETTING
  Scenario Outline: S11- RRP Script Settings - Repeat Script Terms & Conditions
    Given As a Provider I am on HomePage and navigate to Repeat Script Settings in "<System_Menu>"
    And I click the edit button and changing the data as per Patient to Collect Script requirements"<Details>"
    When I navigate to patient portal and verify the change
    Then I should see the changes based on Patient to Collect Script"<Script_Instructions>","<Script_Urgencies>","<Medication Details>" and "<Location Details>"
    Examples:
      | System_Menu            | Details                     | Script_Instructions   | Script_Urgencies   | Medication Details                            | Location Details              |
      | Repeat Script Settings | &PATIENT_TO_COLLECT_SCRIPT& | &SCRIPT_INSTRUCTIONS& | &SCRIPT_URGENCIES& | &DATA FOR PATIENT TO COLLECT TO PRESCRIPTION& | &REPEAT_SCRIPT_SETTINGS_DATA& |

  @WEB @PROVIDER_RRPS @PROVIDER_HAPPY_PATH @REPEAT_SCRIPT_SETTING
  Scenario Outline: S12- RRP Script Settings - Reason for RRP is Mandatory
    Given As a Provider I am on HomePage and navigate to Repeat Script Settings in "<System_Menu>"
    And I click the edit button and changing the Reason for RRP is Mandatory data as per Patient to Collect Script requirements"<Details>"
    When I navigate to patient portal and verify the change
    Then I should see the changes based on Patient to Collect Script"<Script_Instructions>","<Script_Urgencies>","<Medication Details>" and "<Location Details>"
    Examples:
      | System_Menu            | Details                     | Script_Instructions   | Script_Urgencies   | Medication Details                            | Location Details              |
      | Repeat Script Settings | &PATIENT_TO_COLLECT_SCRIPT& | &SCRIPT_INSTRUCTIONS& | &SCRIPT_URGENCIES& | &DATA FOR PATIENT TO COLLECT TO PRESCRIPTION& | &REPEAT_SCRIPT_SETTINGS_DATA& |

  @WEB @PROVIDER_RRPS @PROVIDER_HAPPY_PATH @REPEAT_SCRIPT_SETTING
  Scenario Outline: S13- RRP Script Settings - Pay at Health Centre
    Given As a Provider I am on HomePage and navigate to Repeat Script Settings in "<System_Menu>"
    And I click the edit button and changing the Payment Settings as per Patient to Collect Script requirements"<Details>"
    When I navigate to patient portal and verify the change
    Then I should see the only show Pay at Health center Button on Patient to Collect Script"<Script_Instructions>","<Script_Urgencies>","<Medication Details>" and "<Location Details>"
    Examples:
      | System_Menu            | Details                     | Script_Instructions   | Script_Urgencies   | Medication Details                            | Location Details              |
      | Repeat Script Settings | &PATIENT_TO_COLLECT_SCRIPT& | &SCRIPT_INSTRUCTIONS& | &SCRIPT_URGENCIES& | &DATA FOR PATIENT TO COLLECT TO PRESCRIPTION& | &REPEAT_SCRIPT_SETTINGS_DATA& |

  @WEB @PROVIDER_RRPS @PROVIDER_HAPPY_PATH @REPEAT_SCRIPT_SETTING
  Scenario Outline: S14- RRP Script Settings - Pay at Online only
    Given As a Provider I am on HomePage and navigate to Repeat Script Settings in "<System_Menu>"
    And I click the edit button and changing the Payment Settings to Pay online as per Patient to Collect Script requirements"<Details>"
    When I navigate to patient portal and verify the change
    Then I should see the only show Pay Now Button on Patient to Collect Script"<Script_Instructions>","<Script_Urgencies>","<Medication Details>" and "<Location Details>","<Card_Details>"
    Examples:
      | System_Menu            | Details                     | Script_Instructions   | Script_Urgencies   | Medication Details                            | Location Details              | Card_Details          |
      | Repeat Script Settings | &PATIENT_TO_COLLECT_SCRIPT& | &SCRIPT_INSTRUCTIONS& | &SCRIPT_URGENCIES& | &DATA FOR PATIENT TO COLLECT TO PRESCRIPTION& | &REPEAT_SCRIPT_SETTINGS_DATA& | &CREDIT CARD DETAILS& |


  @WEB @PROVIDER_RRPS @PROVIDER_HAPPY_PATH @REPEAT_SCRIPT_SETTING
  Scenario Outline: S15- RRP Script Settings -  Pay at Health Centre (or) Online
    Given As a Provider I am on HomePage and navigate to Repeat Script Settings in "<System_Menu>"
    And I click the edit button and changing the Payment Settings to Pay at Health Centre or Online as per Patient to Collect Script requirements"<Details>"
    When I navigate to patient portal and verify the change
    Then I should see the show Pay at Health center Button and Pay Now Button on Patient to Collect Script"<Script_Instructions>","<Script_Urgencies>","<Medication Details>" and "<Location Details>"
    Examples:
      | System_Menu            | Details                     | Script_Instructions   | Script_Urgencies   | Medication Details                            | Location Details              |
      | Repeat Script Settings | &PATIENT_TO_COLLECT_SCRIPT& | &SCRIPT_INSTRUCTIONS& | &SCRIPT_URGENCIES& | &DATA FOR PATIENT TO COLLECT TO PRESCRIPTION& | &REPEAT_SCRIPT_SETTINGS_DATA& |


