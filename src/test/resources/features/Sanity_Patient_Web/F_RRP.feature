Feature: Repeat Request Prescription

  @WEB @SANITY_PATH_RRP @SANITY_PATH
  Scenario Template: S1- User Successfully logs in to the beta v2 Portal.

    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |

#    Note: {
#    70:Login as Existing patient & view/click on Repeat Prescription
#    71:Click on Request Medication & Select Health Centre & select the location
#    72:Select the doctor/Provider, script instruction, script urgency & medication that are to be repeated
#    73:Enter the message & click on Pay Now or Pay at Health centre
#    74:Verify the fees displayed
#    75:Click on confirm & get Repeat Medication request submitted details
#    These test Case Covered The Scenario NO: S2
#  }

  @WEB @SANITY_PATH_RRP @SANITY_PATH
  Scenario Outline: S2- Existing Patient to Request the Repeat Prescription

    Given As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    And I select the Medication details "<Medication Details>"
    When I click pay now Button
    Then I enter the Card details on the Payment Page "<Payment Details>"
    And I should see the successful message and I navigate to view history of the Prescription
    And I should see the status of the Prescription and Verify the Medication"<Details>"

    Examples:
      | Medication Details   | Details                     | Payment Details       |
      | &MEDICATION DETAILS& | &VERIFY MEDICATION DETAILS& | &CREDIT CARD DETAILS& |


#    Note: {
#    77:Click on View History & view all the submitted request for Repeat Prescription
#    78:Click on more info for the submitted specific request
#    These test Case Covered The Scenario NO: S3
#  }
  @WEB @SANITY_PATH_RRP @SANITY_PATH
  Scenario Outline: S3- Request Repeat Prescription - View History

    Given As a user I am on HomePage and navigate to Repeat Medication Page in Repeat Prescription
    When I select the Medication details"<Medication Details>"
    Then I should see the successful message and I navigate to view history of the Prescription
    And I see the status for Patient to collect the Prescription"<Verification Medication Details>"
    And I should see the more info details of the prescription in view history"<More info details>"

    Examples:
      | Medication Details                            | Verification Medication Details                         | More info details                                                 |
      | &DATA FOR PATIENT TO COLLECT TO PRESCRIPTION& | &VERIFICATION DATA FOR PATIENT TO COLLECT PRESCRIPTION& | &MORE INFO VERIFICATION DATA FOR PATIENT TO COLLECT PRESCRIPTION& |


    #    Note: {
#    These test Case Covered The Scenario NO: S10
#  }
  @WEB @SANITY_PATH_RRP @SANITY_PATH
  Scenario Outline: S2- Existing Patient to view History of Request the Repeat Prescription

    Given As a Existing user I am on HomePage and I click the Repeat Prescription
    And I select the Medication details "<Medication Details>"
    When I click pay at health centre Button
    Then I should see the successful message and I navigate to view history of the Prescription
    And I should see the status of the Prescription and Verify the Medication"<Details>"

    Examples:
      | Medication Details   | Details                     |
      | &MEDICATION DETAILS& | &VERIFY MEDICATION DETAILS& |