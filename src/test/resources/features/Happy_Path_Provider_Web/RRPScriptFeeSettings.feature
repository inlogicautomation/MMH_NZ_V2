Feature: RRP_Script_Fee_Settings

  Background:Pref- User Successfully logs in to the Provider Portal

    Given As a user I am on Provider Portal login Page
    And I enter "&EMAIL&" and "&PASSWORD&" For Beta
    And I click SignIn button then I should see user successfully logs in to the MMH portal
    When As a user I am on Patient Portal login Page
    And I enter "&EMAIL_FOR_PATIENT&" and "&PASSWORD&" For Beta
    Then I click SignIn button then I should see user successfully logs in to the MMH portal

  @WEB @PROVIDER_RRP @PROVIDER_HAPPY_PATH @PROVIDER_RRP_SCRIPT_FEE_SETTING
  Scenario Template: S1- RRP Script Instructions Settings - Enable.
    Given As a Provider I am on HomePage and navigate to RRP Script Instructions in "<System_Menu>"
    And I navigate to RRP Script Instructions Settings and click edit button
    When I disable the RRP Script Instructions Settings "<Details>"
    Then I should verify disabled RRP Script Instructions Settings "<Details>"
    And  I Navigate to Provider Home Page
    Examples:
      | System_Menu             | Details                   |
      | RRP Script Fee Settings | &RRP_SCRIPT_INSTRUCTIONS& |

  @WEB @PROVIDER_RRP_SCRIPT_FEE_SETTING1 @PROVIDER_HAPPY_PATH
  Scenario Template: S2-create Provider RRP Script Instructions Fees(Patient to Collect Script Fees) Setup & verify it in Patient Portal

    Given As a Provider I am on HomePage and navigate to RRP Script Instructions in "<System_Menu>"
    And I navigate to RRP Script Instructions Settings and click the edit button Select Health center "<Health_Centre>"
    And I click Edit on a location record in Grid & Selected Location must be auto-populated
      | &EDIT_LOCATION_DATA& |
    When I click Patient to Collect Script checkbox &Enter Service Option Name Fees and Description for all four service option
      | &EDIT_PATIENT_TO_COLLECT_SCRIPT& |
    And As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    Then I select the Patient to collect Script Medication details"<Medication Details>" "<Patient to Collect Script DropDown Details>"
    And I should see the successful message and I navigate to view history of the Prescription
    And I see the status for Patient to collect the Prescription"<Verification Medication Details>"
    Examples:
      | System_Menu             | Health_Centre | Medication Details                            | Verification Medication Details                         | Patient to Collect Script DropDown Details   |
      | RRP Script Fee Settings | VM04Practice  | &DATA FOR PATIENT TO COLLECT TO PRESCRIPTION& | &VERIFICATION DATA FOR PATIENT TO COLLECT PRESCRIPTION& | &PATIENT_TO_COLLECT_SCRIPT_DROPDOWN_DETAILS& |


  @WEB @PROVIDER_RRP_SCRIPT_FEE_SETTING @PROVIDER_HAPPY_PATH
  Scenario Template: S3-create Provider RRP Script Instructions Fees(Send Script by Post Fees) Setup & verify it in Patient Portal

    Given As a Provider I am on HomePage and navigate to RRP Script Instructions in "<System_Menu>"
    And I navigate to RRP Script Instructions Settings and click the edit button Select Health center "<Health_Centre>"
    And I click Edit on a location record in Grid & Selected Location must be auto-populated
      | &EDIT_LOCATION_DATA& |
    When I click Send Script by Post checkbox &Enter Service Option Name Fees and Description for all four service option
      | &EDIT_PATIENT_TO_COLLECT_SCRIPT& |
    And As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    Then I select the Send Script By Post Medication details"<Medication Details>" "<Patient to Collect Script DropDown Details>"
    And I should see the successful message and I navigate to view history of the Prescription
    And I see the status for Patient to collect the Prescription"<Verification Medication Details>"
    Examples:
      | System_Menu             | Health_Centre | Medication Details             | Verification Medication Details             | Patient to Collect Script DropDown Details   |
      | RRP Script Fee Settings | VM04Practice  | &DATA FOR SENT SCRIPT BY POST& | &VERIFICATION DATA FOR SENT SCRIPT BY POST& | &PATIENT_TO_COLLECT_SCRIPT_DROPDOWN_DETAILS& |


  @WEB @PROVIDER_RRP_SCRIPT_FEE_SETTING @PROVIDER_HAPPY_PATH
  Scenario Template: S4-create Provider RRP Script Instructions Fees(Send Script to Pharmacy) Setup & verify it in Patient Portal

    Given As a Provider I am on HomePage and navigate to RRP Script Instructions in "<System_Menu>"
    And I navigate to RRP Script Instructions Settings and click the edit button Select Health center "<Health_Centre>"
    And I click Edit on a location record in Grid & Selected Location must be auto-populated
      | &EDIT_LOCATION_DATA& |
    When I click Send Send Script to Pharmacy checkbox &Enter Service Option Name Fees and Description for all four service option
      | &EDIT_PATIENT_TO_COLLECT_SCRIPT& |
    And As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    Then I select the Send Script to Pharmacy Medication details"<Medication Details>" "<Patient to Collect Script DropDown Details>"
    And I should see the successful message and I navigate to view history of the Prescription
    And I see the status for Patient to collect the Prescription"<Verification Medication Details>"
    Examples:
      | System_Menu             | Health_Centre | Medication Details                                 | Verification Medication Details                 | Patient to Collect Script DropDown Details   |
      | RRP Script Fee Settings | VM04Practice  | &DATA FOR PRESCRIPTION BY SENT SCRIPT TO PHARMACY& | &VERIFICATION DATA FOR SENT SCRIPT TO PHARMACY& | &PATIENT_TO_COLLECT_SCRIPT_DROPDOWN_DETAILS& |

  @WEB @PROVIDER_RRP_SCRIPT_FEE_SETTING @PROVIDER_HAPPY_PATH
  Scenario Template: S5-create Provider RRP Script Instructions Fees(Deliver Meds by Pharmacy) Setup & verify it in Patient Portal

    Given As a Provider I am on HomePage and navigate to RRP Script Instructions in "<System_Menu>"
    And I navigate to RRP Script Instructions Settings and click the edit button Select Health center "<Health_Centre>"
    And I click Edit on a location record in Grid & Selected Location must be auto-populated
      | &EDIT_LOCATION_DATA& |
    When I click Deliver Meds by Pharmacy checkbox &Enter Service Option Name Fees and Description for all four service option
      | &EDIT_PATIENT_TO_COLLECT_SCRIPT& |
    And As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    Then I select the Deliver Meds by Pharmacy Medication details"<Medication Details>" "<Patient to Collect Script DropDown Details>"
    And I should see the successful message and I navigate to view history of the Prescription
    And I see the status for Patient to collect the Prescription"<Verification Medication Details>"
    Examples:
      | System_Menu             | Health_Centre | Medication Details                   | Verification Medication Details                   | Patient to Collect Script DropDown Details   |
      | RRP Script Fee Settings | VM04Practice  | &DATA FOR DELIVERY MEDS BY PHARMACY& | &VERIFICATION DATA FOR DELIVERY MEDS BY PHARMACY& | &PATIENT_TO_COLLECT_SCRIPT_DROPDOWN_DETAILS& |


  @WEB @PROVIDER_RRP_SCRIPT_FEE_SETTING @PROVIDER_HAPPY_PATH
  Scenario Template: S6-create Provider RRP Script Instructions Fees(Deliver via Zoom Pharmacy) Setup & verify it in Patient Portal

    Given As a Provider I am on HomePage and navigate to RRP Script Instructions in "<System_Menu>"
    And I navigate to RRP Script Instructions Settings and click the edit button Select Health center "<Health_Centre>"
    And I click Edit on a location record in Grid & Selected Location must be auto-populated
      | &EDIT_LOCATION_DATA& |
    When I click Deliver via Zoom Pharmacy checkbox &Enter Service Option Name Fees and Description for all four service option
      | &EDIT_PATIENT_TO_COLLECT_SCRIPT& |
    And As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    Then I select the Patient to collect Script Medication details"<Medication Details>" "<Patient to Collect Script DropDown Details>"
    And I should see the successful message and I navigate to view history of the Prescription
    And I see the status for Patient to collect the Prescription"<Verification Medication Details>"
    Examples:
      | System_Menu             | Health_Centre | Medication Details                                 | Verification Medication Details                         | Patient to Collect Script DropDown Details   |
      | RRP Script Fee Settings | VM04Practice  | &DATA FOR PRESCRIPTION BY SENT SCRIPT TO PHARMACY& | &VERIFICATION DATA FOR PATIENT TO COLLECT PRESCRIPTION& | &PATIENT_TO_COLLECT_SCRIPT_DROPDOWN_DETAILS& |

