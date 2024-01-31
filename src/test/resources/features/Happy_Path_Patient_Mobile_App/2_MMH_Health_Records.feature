Feature: Mobile_Health_Records_Scenarios

  @MOBILE @RELAUNCH @Mobile_Health_Record1 @HAPPY_PATH_MOBILE
  Scenario Outline: S1 - User login with valid credential and verifies MMH Home screen

    Given I am on MMH Login screen
    And I enter "<Username>" and "<Password>" in login screen
    When I tap on Sign-In button
    Then I should see MMH Home screen

    Examples:
      | Username | Password   |
      | &EMAIL&  | &PASSWORD& |


  @MOBILE @Mobile_Health_Record @HAPPY_PATH_MOBILE
  Scenario Outline: S2 - Patient to View Health Records - Test Results (Entries from Health Centre)

    Given I am on MMH Home screen
    And I tap on "Health Records" option in home screen
    When I tap on "Test results" in Health Records
    Then I should see "<Test Result Records>" and "<Test Result Details>" in "Test results"
#    And I should see Pathology Tests Explanation under Help

    Examples:
      | Test Result Records    | Test Result Details    |
      | &TEST_RESULTS_RECORDS& | &TEST_RESULTS_DETAILS& |

  @MOBILE @Mobile_Health_Record @HAPPY_PATH_MOBILE @TestPres
  Scenario Outline: S3 - Patient to View Health Records - Prescription (Entries from Health Centre)

    Given I am on MMH Home screen
    And I tap on "Health Records" option in home screen
    When I tap on "Prescriptions" in Health Records
    Then I should see "<Test Result Records>" and "<Test Result Details>" in "Prescriptions"

    Examples:
      | Test Result Records     | Test Result Details     |
      | &PRESCRIPTIONS_RECORDS& | &PRESCRIPTIONS_DETAILS& |

  @MOBILE @Mobile_Health_Record @HAPPY_PATH_MOBILE
  Scenario Outline: S4 - Patient to View Health Records - Allergies (Entries from Health Centre)

    Given I am on MMH Home screen
    And I tap on "Health Records" option in home screen
    When I tap on "Allergies" in Health Records
    Then I should see "<Test Result Records>" and "<Test Result Details>" in "Allergies"

    Examples:
      | Test Result Records | Test Result Details |
      | &ALLERGIES_RECORDS& | &ALLERGIES_DETAILS& |

  @MOBILE @Mobile_Health_Record @HAPPY_PATH_MOBILE
  Scenario Outline: S5 -Patient to View Health Records - Conditions (Entries from Health Centre)

    Given I am on MMH Home screen
    And I tap on "Health Records" option in home screen
    When I tap on "Conditions" in Health Records
    Then I should see "<Test Result Records>" and "<Test Result Details>" in "Conditions"

    Examples:
      | Test Result Records  | Test Result Details  |
      | &CONDITIONS_RECORDS& | &CONDITIONS_DETAILS& |

  @MOBILE @Mobile_Health_Record @HAPPY_PATH_MOBILE
  Scenario Outline: S6 - Patient to View Health Records -Immunisations (Entries from Health Centre)

    Given I am on MMH Home screen
    And I tap on "Health Records" option in home screen
    When I tap on "Immunisations" in Health Records
    Then I should see "<Test Result Records>" and "<Test Result Details>" in "Immunisations"

    Examples:
      | Test Result Records     | Test Result Details     |
      | &IMMUNISATIONS_RECORDS& | &IMMUNISATIONS_DETAILS& |

  @MOBILE @Mobile_Health_Record @HAPPY_PATH_MOBILE @TEstD
  Scenario Outline: S7 - Patient to View Health Records -Doctor notes (Entries from Health Centre)

    Given I am on MMH Home screen
    And I tap on "Health Records" option in home screen
    When I tap on "Doctor Notes" in Health Records
    Then I should see "<Test Result Records>" and "<Test Result Details>" in "Doctor notes"

    Examples:
      | Test Result Records    | Test Result Details    |
      | &DOCTOR_NOTES_RECORDS& | &DOCTOR_NOTES_DETAILS& |


  @MOBILE @Mobile_Health_Record1 @HAPPY_PATH_MOBILE
  Scenario Outline: S8 - Patient to View Health Records - Recalls (Entries from Health Centre)

    Given I am on MMH Home screen
    And I tap on "Health Records" option in home screen
    When I tap on "Recalls" in Health Records
    Then I should see "<Test Result Records>" and "<Test Result Details>" in "Recalls"

    Examples:
      | Test Result Records | Test Result Details |
      | &RECALLS_RECORDS&   | &RECALLS_DETAILS&   |


  @MOBILE @Mobile_Health_Record11 @HAPPY_PATH_MOBILE11
  Scenario:  S9 - Patient to View Health Summary

    Given I am on MMH Home screen
    And I tap on "Health Records" option in home screen
    When I tap on "Health Summary" in Health Records
    Then I should see Health Summary Page and Click Export icon

