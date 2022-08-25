Feature: Repeat Request Prescription

  @WEB @Mobile @RRP @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: Changing machines timezone

    Given I change Windows "<TimeZone>"

    Examples:
      | TimeZone                  |
      | New Zealand Standard Time |

  @WEB @Mobile @RRP @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: User Successfully logs in to the MMH Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | Email Address   | Password           |
      | &EMAIL FOR RRP& | &PASSWORD FOR RRP& |

  @WEB @Mobile @RRP @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Outline: S2- Patient to collect the Prescription

    Given As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    When I select the Medication details"<Medication Details>"
    Then I should see the successful message and I navigate to view history of the Prescription
    And I see the status for Patient to collect the Prescription"<Verification Medication Details>"

    Examples:
      | Medication Details                            | Verification Medication Details                         | More info details                                                 |
      | &DATA FOR PATIENT TO COLLECT TO PRESCRIPTION& | &VERIFICATION DATA FOR PATIENT TO COLLECT PRESCRIPTION& | &MORE INFO VERIFICATION DATA FOR PATIENT TO COLLECT PRESCRIPTION& |


  @WEB @Mobile @RRP @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE @TEST123
  Scenario Outline: S3- Patient Collect the medication by Sent Script by Post

    Given As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    When I select the Medication details"<Medication Details>"
    Then I should see the successful message and I navigate to view history of the Prescription
    And I should see the Prescription status Sent Script by Post"<Verification Medication Details>"
    Examples:
      | Medication Details             | Verification Medication Details             | More info details                                     |
      | &DATA FOR SENT SCRIPT BY POST& | &VERIFICATION DATA FOR SENT SCRIPT BY POST& | &MORE INFO VERIFICATION DATA FOR SENT SCRIPT BY POST& |

  @WEB @Mobile @RRP @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE @TEST123
  Scenario Outline: S4- Patient Collect the medication by Sent Script by Pharmacy

    Given As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    When I select the Medication details for Sent Script by Pharmacy "<Medication Details>"
    Then I should see the successful message and I navigate to view history of the Prescription
    And I should see the Prescription status for Sent Script by Pharmacy"<Verification Medication Details>"
    Examples:
      | Medication Details                                 | Verification Medication Details                 | More info details                                            |
      | &DATA FOR PRESCRIPTION BY SENT SCRIPT TO PHARMACY& | &VERIFICATION DATA FOR SENT SCRIPT TO PHARMACY& | &MORE INFO DATA FOR PRESCRIPTION BY SENT SCRIPT TO PHARMACY& |

  @WEB @Mobile @RRP @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE @TEST123
  Scenario Outline: S5- Patient Collect the medication by Delivery Meds by Pharmacy

    Given As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    When I select the Medication details for Delivery Meds by Pharmacy "<Medication Details>"
    Then I should see the successful message and I navigate to view history of the Prescription
    And I should see the Prescription status for Delivery Meds by Pharmacy"<Verification Medication Details>"
    Examples:
      | Medication Details                   | Verification Medication Details                   | MM                                             |
      | &DATA FOR DELIVERY MEDS BY PHARMACY& | &VERIFICATION DATA FOR DELIVERY MEDS BY PHARMACY& | &MORE INFO DATA FOR DELIVERY MEDS BY PHARMACY& |

  @WEB @Mobile @RRP @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE @TEST123
  Scenario Outline: S6- Request Repeat Prescription - Pay Online (Card)

    Given As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    And I select the Medication details for Delivery Meds by Pharmacy and Pay Online with Card "<Medication Details>"
    And I see the successful message and I navigate to Payment Page
    When I enter the Card details on the Payment Page "<Payment Details>"
    Then I should see the Prescription status for Request by card "<Prescription Verification Details>"

    Examples:
      | Medication Details                   | Payment Details       | Prescription Verification Details            |
      | &DATA MEDS PAY BY USING ONLINE CARD& | &CREDIT CARD DETAILS& | &VERIFICATION MEDS PAY BY USING ONLINE CARD& |

  @WEB @Mobile @RRP @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Outline: S7- Request Repeat Prescription - Pay Online (A2A)

    Given As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    And I select the Medication details for Delivery Meds by Pharmacy and Pay Online with Card "<Medication Details>"
    And I see the successful message and I navigate to Payment Page
    When I enter the Account details on the Payment Page "<Payment Details>"
    Then I should see the Prescription status for Request by card "<Prescription Verification Details>"

    Examples:
      | Medication Details                  | Payment Details      | Prescription Verification Details             |
      | &DATA MEDS PAY BY USING ONLINE A2A& | &ACCOUNT TO ACCOUNT& | &VERIFICATION DATA FOR MEDS PAY BY USING A2A& |

  @WEB @Mobile @RRP @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Outline: S8- Request Repeat Prescription - View History

    Given As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    When I select the Medication details"<Medication Details>"
    Then I should see the successful message and I navigate to view history of the Prescription
    And I see the status for Patient to collect the Prescription"<Verification Medication Details>"
    And I should see the more info details of the prescription in view history"<More info details>"

    Examples:
      | Medication Details                            | Verification Medication Details                         | More info details                                                 |
      | &DATA FOR PATIENT TO COLLECT TO PRESCRIPTION& | &VERIFICATION DATA FOR PATIENT TO COLLECT PRESCRIPTION& | &MORE INFO VERIFICATION DATA FOR PATIENT TO COLLECT PRESCRIPTION& |

  @WEB @Mobile @RRP @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Outline: S9- Request Repeat Prescription - Script Urgency

    Given As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    When I select the "<Medication Details>"
    Then I should verify the Script "<Urgency Details>"

    Examples:
      | Medication Details               | Urgency Details |
      | &MEDICATION DETAILS FOR URGENCY& | &URGENCY PRICE& |