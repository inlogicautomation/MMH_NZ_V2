Feature: My Health Records

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE @JENKINS
  Scenario Template: Changing machines timezone

    Given I change Windows "<TimeZone>"

    Examples:
      | TimeZone                  |
      | New Zealand Standard Time |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE @test @JENKINS
  Scenario Template: User Successfully logs in to the MMH Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address      | Password              |
      | &EMAIL_FOR_HEALTH& | &PASSWORD_FOR_HEALTH& |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE @JENKINS
  Scenario Template:S1-Patient to View Health Records & Verify the Prescription Entries from Health Centre Medicine Details

    Given As a user I am on HomePage
    When I navigate to the Prescription "<Prescription>" page
    Then I should see all the Prescription Entries From Health center Medicine Details in a grid view
      | &PRESCRIPTION_TABLE_DATA&   |
      | &PRESCRIPTION_TABLE_DATA_1& |
      | &PRESCRIPTION_TABLE_DATA_2& |
    And I click on the more info icon on the grid & view the details of the prescription added
      | &PRESCRIPTION_TABLE_DATA&   | &PRESCRIPTION_ICON_DATA&   | &PRESCRIPTION_MOBILE_ICON_DATA&   |
      | &PRESCRIPTION_TABLE_DATA_1& | &PRESCRIPTION_ICON_DATA_1& | &PRESCRIPTION_MOBILE_ICON_DATA_1& |
      | &PRESCRIPTION_TABLE_DATA_2& | &PRESCRIPTION_ICON_DATA_2& | &PRESCRIPTION_MOBILE_ICON_DATA_2& |
    And I navigate to the Homepage
    Examples:
      | Prescription  |
      | Prescriptions |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S2 -Verify Entries from Health Centre Medicine details and validate Add health Records in My entries Prescriptions Details

    Given As a user I am on HomePage
    And I navigate to the Prescriptions "<Header>"
    And  I should see all the Prescription Entries From Health center Medicine Details in a grid view
      | &PRESCRIPTION_TABLE_DATA&   |
      | &PRESCRIPTION_TABLE_DATA_1& |
      | &PRESCRIPTION_TABLE_DATA_2& |
    When I select "<Option>" filter dropdown
    And I Create New Record in My Entries in Prescription page
      | &VISITED_NAME&                   |
      | &VISITED_DOSE_NAME&              |
      | &VISITED_PRESCRIPTION_DROPDOWN&  |
      | &VISITED_PRESCRIPTION_DROPDOWN1& |
      | &ADDITIONAL_INFORMATION&         |
      | &VISITED_MOBILE_VALUE&           |
    Then I should see all the Prescription My Entries Medicine details in more info
      | &MY_ENTRIES_PRESCRIPTIONS_DATA& | &PRESCRIPTIONS_INFO_ICON_DATA& | &MOBILE_DATA_MY_ENTRIES_INSIDE_PRESCRIPTIONS& |
    Examples:
      | Header        |
      | Prescriptions |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S2 -Patient validate edit and delete in My entries Prescriptions Details

    Given I am on "<Tab>" Prescriptions page
    And I edit Created "<Record>" in Prescription page
    And I change "<FrequencyDrop>" in Prescription page
    When I am on "<Tab>" Prescriptions page
    And I delete Created "<Record>" in Prescriptions page
    Then I should see Patient Record is deleted
    And I navigate to the Homepage

    Examples:
      | Tab           | Record         | FrequencyDrop |
      | Prescriptions | &VISITED_NAME& | 3 time        |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S3-Patient to View Health Records & Verify the Allergies Entries from Health Centre Medicine Details

    Given As a user I am on HomePage
    When I navigate to the "<Allergies>"Allergies page dropdown
    Then I should see all the Allergies Entries From Health center Medicine Details in a grid view
      | &ALLERGIES_TABLE_DATA&   |
      | &ALLERGIES_TABLE_DATA_1& |
      | &ALLERGIES_TABLE_DATA_2& |
    And I click on the more info icon on the grid & view the details of the Allergies added
      | &ALLERGIES_TABLE_DATA&   | &ALLERGIES_ICON_DATA&   | &ALLERGIES_MOBILE_ICON_DATA&   |
      | &ALLERGIES_TABLE_DATA_1& | &ALLERGIES_ICON_DATA_1& | &ALLERGIES_MOBILE_ICON_DATA_1& |
      | &ALLERGIES_TABLE_DATA_2& | &ALLERGIES_ICON_DATA_2& | &ALLERGIES_MOBILE_ICON_DATA_2& |
    And I navigate to the Homepage

    Examples:
      | Allergies |
      | Allergies |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S4-Verify Entries from Health Centre Medicine details and validate Add health Records in My entries Allergies Details

    Given As a user I am on HomePage
    And I navigate to the Allergies "<Header>"
    And I should see all the Allergies Entries From Health center Medicine Details in a grid view
      | &ALLERGIES_TABLE_DATA&   |
      | &ALLERGIES_TABLE_DATA_1& |
      | &ALLERGIES_TABLE_DATA_2& |
    When I select "<Option>" filter dropdown
    And I Create New Record in My Entries in Allergies page
      | &VISITED_NAME&                |
      | &VISITED_ALLERGIES_DROPDOWN&  |
      | &VISITED_ALLERGIES_DROPDOWN1& |
      | &ADDITIONAL_INFORMATION&      |
    Then I should see all the Allergies My Entries Medicine details in more info
      | &MY_ENTRIES_ALLERGIES_DATA& | &ALLERGIES_INFO_ICON_DATA& | &MOBILE_DATA_MY_ENTRIES_INSIDE_ALLERGIES& |
    Examples:
      | Header    |
      | Allergies |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S4-Patient validate edit and delete in My entries Allergies Details

    Given I am on "<Tab>" Allergies page
    And I edit Created "<Record>" in Allergies page
    And I change "<SeverityDrop>" in Allergies page
    When I am on "<Tab>" Allergies page
    And I delete Created "<Record>" in Allergies page
    Then I should see Patient Record is deleted
    And I navigate to the Homepage
    Examples:
      | Tab       | Record         | SeverityDrop |
      | Allergies | &VISITED_NAME& | Low          |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S5-Patient to View Health Records & Verify the Immunisations Entries from Health Centre Medicine Details

    Given As a user I am on HomePage
    When I navigate to the "<Immunisations>"Immunisations page dropdown
    Then I should see all the Immunisations Entries From Health center Medicine Details in a grid view
      | &IMMUNISATIONS_TABLE_DATA&   |
      | &IMMUNISATIONS_TABLE_DATA_1& |
    And I click on the more info icon on the grid & view the details of the Immunisations added
      | &IMMUNISATIONS_TABLE_DATA&   | &IMMUNISATIONS_ICON_DATA&   | &IMMUNISATION_MOBILE_ICON_DATA&   |
      | &IMMUNISATIONS_TABLE_DATA_1& | &IMMUNISATIONS_ICON_DATA_1& | &IMMUNISATION_MOBILE_ICON_DATA_1& |
    And I navigate to the Homepage
    Examples:
      | Immunisations |
      | Immunisations |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE @test
  Scenario Template: S6-Verify Entries from Health Centre Medicine details and validate Add health Records in My entries Immunisations Details

    Given As a user I am on HomePage
    And I navigate to the Immunisations "<Header>"
    And I should see all the Immunisations Entries From Health center Medicine Details in a grid view
      | &IMMUNISATIONS_TABLE_DATA&   |
      | &IMMUNISATIONS_TABLE_DATA_1& |
    When I select "<Option>" filter dropdown
    And I Create New Record in Immunisations page
      | &VISITED_NAME&           |
      | &ADDITIONAL_INFORMATION& |
    Then I should see all the Immunisations My Entries Medicine details in more info
      | &MY_ENTRIES_IMMUNISATIONS_DATA& | &IMMUNISATION_INFO_ICON_DATA& | &MOBILE_DATA_MY_ENTRIES_INSIDE_IMMUNISATIONS& |
    Examples:
      | Header        |
      | Immunisations |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE @test
  Scenario Template: S6-Patient validate edit and delete in My entries Immunisation Details

    Given I am on "<Tab>" Immunisation page
    And I edit Created "<Record>" in Immunisations page
    And I change "<AdditionalName>" in Immunisations page
    When I am on "<Tab>" Immunisation page
    And I delete Created "<Record>" in Immunisations page
    Then I should see Patient Record is deleted
    Examples:
      | Tab           | Record         | AdditionalName    |
      | Immunisations | &VISITED_NAME& | &EDIT_ADDITIONAL& |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE @test
  Scenario Template: S6-Patient validate edit and delete in My entries COVID Immunisation Details

    Given I am on "<Tab>" CovidImmunisation page
    And I Create New Record in COVIDImmunisations page
      | &VACCINE_NAME&           |
      | &BATCH_NO&               |
      | &ADDITIONAL_INFORMATION& |
      | &FILE_UPLOAD&            |
    When I should see all the COVIDImmunisations My Entries Medicine details in more info
      | &MY_ENTRIES_COVID_IMMUNISATIONS_DATA& | &COVID_IMMUNISATIONS_INFO_ICON_DATA& | &MOBILE_DATA_MY_ENTRIES_INSIDE_COVID_IMMUNISATIONS& |
    And I edit Created "<Record>" in CovidImmunisations page
    Then I change "<AdditionalName>" in CovidImmunisations page
    And I should see all the COVIDImmunisations Edit My Entries Medicine details in more info
      | &MY_ENTRIES_COVID_IMMUNISATIONS_DATA& | &EDIT_COVID_IMMUNISATIONS_INFO_ICON_DATA& | &EDIT_MOBILE_DATA_MY_ENTRIES_INSIDE_COVID_IMMUNISATIONS& |
    And I delete Created "<Record>" in CovidImmunisations page
    And I navigate to the Homepage
    Examples:
      | Tab           | Record                                     | AdditionalName    |
      | Immunisations | Comirnaty, COVID-19 mRNA (Pfizer-BioNTech) | &EDIT_ADDITIONAL& |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE @test
  Scenario Template: S7-Patient to View Health Records & Verify the Conditions Entries from Health Centre Medicine Details

    Given As a user I am on HomePage
    When I navigate to the "<Conditions>" Conditions page Dropdown
    Then I should see all the Conditions Entries From Health center Medicine Details in a grid view
      | &CLASSIFICATIONS_TABLE_DATA&   |
      | &CLASSIFICATIONS_TABLE_DATA_1& |
      | &CLASSIFICATIONS_TABLE_DATA_2& |
    And I click on the more info icon on the grid & view the details of the Conditions added
      | &CLASSIFICATIONS_TABLE_DATA&   | &CLASSIFICATIONS_ICON_DATA&   | &CLASSIFICATIONS_MOBILE_ICON_DATA&   |
      | &CLASSIFICATIONS_TABLE_DATA_1& | &CLASSIFICATIONS_ICON_DATA_1& | &CLASSIFICATIONS_MOBILE_ICON_DATA_1& |
      | &CLASSIFICATIONS_TABLE_DATA_2& | &CLASSIFICATIONS_ICON_DATA_2& | &CLASSIFICATIONS_MOBILE_ICON_DATA_2& |
    And I navigate to the Homepage
    Examples:
      | Conditions |
      | Conditions |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S8-Verify Entries from Health Centre Medicine details and validate Add health Records in My entries Classifications Details

    Given As a user I am on HomePage
    And I navigate to the Conditions "<Header>"
    And I should see all the Conditions Entries From Health center Medicine Details in a grid view
      | &CLASSIFICATIONS_TABLE_DATA&   |
      | &CLASSIFICATIONS_TABLE_DATA_1& |
      | &CLASSIFICATIONS_TABLE_DATA_2& |
    When I select "<Option>" filter dropdown
    And I Create New Record in My Entries in Conditions page
      | &VISITED_NAME&           |
      | &VISITED_DROPDOWN&       |
      | &ADDITIONAL_INFORMATION& |
    Then I should see all the Conditions My Entries Medicine details in more info
      | &DATA_MY_ENTRIES_CLASSIFICATIONS& | &CLASSIFICATIONS_INFO_ICON_DATA& | &MOBILE_DATA_MY_ENTRIES_INSIDE_CLASSIFICATION& |
    Examples:
      | Header     |
      | Conditions |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S8-Patient validate edit and delete in My entries Classifications Details

    Given I am on "<Tab>" Conditions page
    And I edit Created "<Record>" in Conditions page
    And I change "<StatusDrop>" in Conditions page
    When I am on "<Tab>" Conditions page
    And I delete Created "<Record>" in Conditions page
    Then I should see Patient Record is deleted
    And I navigate to the Homepage

    Examples:
      | Tab        | Record         | StatusDrop |
      | Conditions | &VISITED_NAME& | Long Term  |


  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario: S9-Patient to View Health Records & Verify the Lab Results Entries from Health Centre Medicine Details

    Given As a user I am on HomePage
    When I navigate to the Lab Results page
    And  I should see all the Lab Results Entries From Health center Medicine Details in a grid view
      | &LAB_RESULT_TABLE_DATA&   |
      | &LAB_RESULT_TABLE_DATA_1& |
    Then I click on the more info icon on the grid & view the details of the Lab Results added
      | &LAB_RESULT_TABLE_DATA&   | &LAB_RESULT_ICON_DATA&   | &LAB_RESULT_MOBILE_ICON_DATA&   |
      | &LAB_RESULT_TABLE_DATA_1& | &LAB_RESULT_ICON_DATA_1& | &LAB_RESULT_MOBILE_ICON_DATA_1& |
    And I click on the more info icon on the grid & view the details of the Test Results added
      | &LAB_RESULT_TABLE_DATA&   | &TEST_RESULT_ICON_DATA&   | &TEST_MOBILE_RESULT_ICON_DATA&   |
      | &LAB_RESULT_TABLE_DATA_1& | &TEST_RESULT_ICON_DATA_1& | &TEST_MOBILE_RESULT_ICON_DATA_1& |
    And I navigate to the Homepage

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S10-Patient to View Health Records & Verify the Clinic Notes Entries from Health Centre Medicine Details

    Given As a user I am on HomePage
    When I navigate to the "<ClinicNotes>"Clinic Notes page dropdown
    Then I should see all the Clinic Notes Entries From Health center Medicine Details in a grid view
      | &CLINIC_TABLE_DATA&   |
      | &CLINIC_TABLE_DATA_1& |
      | &CLINIC_TABLE_DATA_2& |
      | &CLINIC_TABLE_DATA_3& |
    And I click on the more info icon on the grid & view the details of the Clinic Notes added
      | &CLINIC_TABLE_DATA&   | &CLINIC_ICON_DATA&   | &CLINIC_MOBILE_ICON_DATA&   |
      | &CLINIC_TABLE_DATA_1& | &CLINIC_ICON_DATA_1& | &CLINIC_MOBILE_ICON_DATA_1& |
      | &CLINIC_TABLE_DATA_2& | &CLINIC_ICON_DATA_2& | &CLINIC_MOBILE_ICON_DATA_2& |
      | &CLINIC_TABLE_DATA_3& | &CLINIC_ICON_DATA_3& | &CLINIC_MOBILE_ICON_DATA_3& |
    And I navigate to the Homepage

    Examples:
      | ClinicNotes     |
      | Clinician Notes |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S11-Verify Entries from Health Centre Medicine details and validate Add health Records in My entries Clinic Notes Details

    Given As a user I am on HomePage
    And I navigate to the Clinic Notes "<Header>"
    And I should see all the Clinic Notes Entries From Health center Medicine Details in a grid view
      | &CLINIC_TABLE_DATA&   |
      | &CLINIC_TABLE_DATA_1& |
      | &CLINIC_TABLE_DATA_2& |
      | &CLINIC_TABLE_DATA_3& |
    When I select "<Option>" filter dropdown
    And I Create New Record in My Health Records
      | &VISITED_NAME&           |
      | &VISITED_LOCATION&       |
      | &ADDITIONAL_INFORMATION& |
    Then I should see all the Clinic Notes My Entries Medicine details in more info
      | &DATA_MY_ENTRIES_CLINIC_NOTES_1& | &CLINIC_NOTES_INFO_ICON_DATA& | &MOBILE_DATA_MY_ENTRIES_INSIDE_CLINIC_NOTES_1& |

    Examples:
      | Header          |
      | Clinician Notes |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S11-Patient validate edit and delete in My entries Clinic Notes Details

    Given I am on "<Tab>" Clinic Notes page
    And I edit Created "<Record>" in My Health Records
    And I change "<Location>" in Clinic Notes
    When   I am on "<Tab>" Clinic Notes page
    And I delete Created "<Record>" in Clinic Notes
    Then I should see Patient Record is deleted
    And I navigate to the Homepage
    Examples:
      | Tab             | Record         | Location        |
      | Clinician Notes | &VISITED_NAME& | &EDIT_LOCATION& |

#  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
#  Scenario Template: User Successfully logs in to the MMH Portal.
#
#    Given As a user I am on MMH login Page
#    And I enter "<Email Address>" and "<Password>" For Beta
#    When I click SignIn button
#    Then I should see user successfully logs in to the MMH portal
#    Examples:
#      | Email Address      | Password              |
#      | &EMAIL_FOR_HEALTH& | &PASSWORD_FOR_HEALTH& |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario: S12-Patient to View Health Records & Verify the Recalls Entries from Health Centre Medicine Details

    Given As a user I am on HomePage
    And I navigate to the Recalls page
    When I should see all the Recalls Entries From Health center Medicine Details in a grid view
      | &RECALLS_TABLE_DATA_1& |
    And I click on the more info icon on the grid & view the details of the Recalls added
      | &RECALLS_TABLE_DATA_1& | &RECALLS_ICON_DATA_1& | &MOBILE_RECALLS_ICON_DATA_1& |
    Then I should see all the Recalls Remainder Entries From Health center Medicine Details in a grid view
      | &RECALLS_REMAINDER_TABLE_DATA& |
    And I click on the more info icon on the grid & view the details of the Recalls regarding the clinical added
      | &RECALLS_REMAINDER_TABLE_DATA& | &RECALLS_REMAINDER_ICON_DATA& | &MOBILE_RECALLS_REMAINDER_ICON_DATA& |
    And I navigate to the Homepage

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario: S13-Patient to View Summary

    Given As a user I am on HomePage
    And I navigate to the Health Summary
    When I click Export Health Summary
    Then I navigate to the Homepage



