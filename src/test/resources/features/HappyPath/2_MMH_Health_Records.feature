Feature: My Health Records Demo

  @WEB @S1 @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: Prep - User Successfully logs in to the MMH v2 Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | Email Address      | Password              |
      | &EMAIL_FOR_HEALTH& | &PASSWORD_FOR_HEALTH& |

  @WEB @S1 @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S1 - Verify My Health Records can view all the My Entries Future in Prescription page.

    Given As a user I am on HomePage
    When I navigate to the Prescription "<Prescription>" page
    Then I should see all the Entries From Health Centre future Grid View in Prescription page
      | &PRESCRIPTION_TABLE_DATA&   |
      | &PRESCRIPTION_TABLE_DATA_1& |
      | &PRESCRIPTION_TABLE_DATA_2& |
    And  I Click Info Icon to see Prescription page
      | &PRESCRIPTION_TABLE_DATA&   | &PRESCRIPTION_ICON_DATA&   | &PRESCRIPTION_MOBILE_ICON_DATA&|
      | &PRESCRIPTION_TABLE_DATA_1& | &PRESCRIPTION_ICON_DATA_1& | &PRESCRIPTION_MOBILE_ICON_DATA_1&|
      | &PRESCRIPTION_TABLE_DATA_2& | &PRESCRIPTION_ICON_DATA_2& |&PRESCRIPTION_MOBILE_ICON_DATA_2& |
    And I navigate to the Homepage
    Examples:
      | Prescription     |
      | &FILTER_BY_DATA& |

  @WEB @S1 @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S2 - Verify My Health Records can view all the My Entries Future in Prescriptions.

    Given As a user I am on HomePage
    And I navigate to the Prescriptions
    And I should see all the Entries From Health Centre future Grid View in Prescription page
      | &PRESCRIPTION_TABLE_DATA&   |
      | &PRESCRIPTION_TABLE_DATA_1& |
      | &PRESCRIPTION_TABLE_DATA_2& |
    When I select "<Option>" filter dropdown
    And I should see all My Entries in Prescription page
      | &DATA_MY_ENTRIES_PRESCRIPTIONS& |
    And  I Click Info Icon in My Entries to see Prescription page
      | &DATA_MY_ENTRIES_PRESCRIPTIONS& | &DATA_MY_ENTRIES_INSIDE_PRESCRIPTIONS& |&MOBILE_DATA_MY_ENTRIES_INSIDE_PRESCRIPTIONS&|
    Then I Create New Record in My Entries in Prescription page
      | &VISITED_NAME_RANDOM&            |
      | &VISITED_DOSE_NAME&              |
      | &VISITED_PRESCRIPTION_DROPDOWN&  |
      | &VISITED_PRESCRIPTION_DROPDOWN1& |
      | &ADDITIONAL_INFORMATION&         |
      | &VISITED_MOBILE_VALUE&           |

    Examples:
      | Option     |
      | My Entries |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S2 - Patient Edit Created Record in Prescriptions
    Given I am on "<Tab>" Prescriptions page
    And I edit Created "<Record>" in Prescription page
    And I change "<FrequencyDrop>" in Prescription page
    When I am on "<Tab>" Prescriptions page
    And I delete Created "<Record>" in Prescriptions page
    Then I should see Patient Record is deleted
    And I navigate to the Homepage
    Examples:
      | Tab           | Record                | FrequencyDrop  |
      | Prescriptions | &VISITED_NAME_RANDOM& | 3 time per day |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S3- Verify My Health Records can view all the My Entries Future in Allergies.

    Given As a user I am on HomePage
    When I navigate to the "<Allergies>"Allergies page dropdown
    Then I should see all the Entries From Health Centre future Grid View in Allergies page
      | &ALLERGIES_TABLE_DATA&   |
      | &ALLERGIES_TABLE_DATA_1& |
      | &ALLERGIES_TABLE_DATA_2& |
    And  I Click Info Icon to see Allergies page
      | &ALLERGIES_TABLE_DATA&   | &ALLERGIES_ICON_DATA&   |&ALLERGIES_MOBILE_ICON_DATA&|
      | &ALLERGIES_TABLE_DATA_1& | &ALLERGIES_ICON_DATA_1& |&ALLERGIES_MOBILE_ICON_DATA_1&|
      | &ALLERGIES_TABLE_DATA_2& | &ALLERGIES_ICON_DATA_2& | &ALLERGIES_MOBILE_ICON_DATA_2&|
    And I navigate to the Homepage
    Examples:
      | Allergies        |
      | &FILTER_BY_DATA& |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S4- Verify My Health Records can view all the My Entries Future in Allergies.

    Given As a user I am on HomePage
    And I navigate to the Allergies
    And I should see all the Entries From Health Centre future Grid View in Allergies page
      | &ALLERGIES_TABLE_DATA&   |
      | &ALLERGIES_TABLE_DATA_1& |
      | &ALLERGIES_TABLE_DATA_2& |
    When I select "<Option>" filter dropdown
    And I should see all My Entries Allergies page
      | &DATA_MY_ENTRIES_ALLERGIES& |
    And  I Click Info Icon in My Entries to see Allergies page
      | &DATA_MY_ENTRIES_ALLERGIES& | &DATA_MY_ENTRIES_INSIDE_ALLERGIES& |  &MOBILE_DATA_MY_ENTRIES_INSIDE_ALLERGIES&|
    And I Create New Record in My Entries in Allergies page
      | &VISITED_NAME_RANDOM&         |
      | &VISITED_ALLERGIES_DROPDOWN&  |
      | &VISITED_ALLERGIES_DROPDOWN1& |
      | &ADDITIONAL_INFORMATION&      |
    Then I should see created Record in Allergies page
      | &VISITED_ALLERGIES_DROPDOWN& |
      | &VISITED_NAME_RANDOM&        |

    Examples:
      | Option     |
      | My Entries |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S4- Patient Edit Created Record in Allergies
    Given I am on "<Tab>" Allergies page
    And I edit Created "<Record>" in Allergies page
    And I change "<SeverityDrop>" in Allergies page
    When I am on "<Tab>" Allergies page
    And I delete Created "<Record>" in Allergies page
    Then I should see Patient Record is deleted
    And I navigate to the Homepage
    Examples:
      | Tab       | Record                | SeverityDrop |
      | Allergies | &VISITED_NAME_RANDOM& | Low          |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S5- Verify My Health Records can view all the My Entries Future in Immunisations.

    Given As a user I am on HomePage
    When I navigate to the "<Immunisations>"Immunisations page dropdown
    Then I should see all the Entries From Health Centre future Grid View in Immunisations page
      | &IMMUNISATIONS_TABLE_DATA&   |
      | &IMMUNISATIONS_TABLE_DATA_1& |
    And  I Click Info Icon to see Immunisations page
      | &IMMUNISATIONS_TABLE_DATA&   | &IMMUNISATIONS_ICON_DATA&   |&IMMUNISATION_MOBILE_ICON_DATA&|
      | &IMMUNISATIONS_TABLE_DATA_1& | &IMMUNISATIONS_ICON_DATA_1& |&IMMUNISATION_MOBILE_ICON_DATA_1&|
    And I navigate to the Homepage
    Examples:
      | Immunisations    |
      | &FILTER_BY_DATA& |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S6- Verify My Health Records can view all the My Entries Future in Immunisations.

    Given As a user I am on HomePage
    And I navigate to the Immunisations
    And I should see all the Entries From Health Centre future Grid View in Immunisations page
      | &IMMUNISATIONS_TABLE_DATA&   |
      | &IMMUNISATIONS_TABLE_DATA_1& |
    When I select "<Option>" filter dropdown
    And I should see all My Entries Immunisations page
      | &DATA_MY_ENTRIES_IMMUNISATIONS& |
    And  I Click Info Icon in My Entries to see Immunisations page
      | &DATA_MY_ENTRIES_IMMUNISATIONS& | &DATA_MY_ENTRIES_INSIDE_IMMUNISATIONS& |&MOBILE_DATA_MY_ENTRIES_INSIDE_IMMUNISATIONS&|
    And I Create New Record in Immunisations page
      | &VISITED_NAME_RANDOM&    |
      | &ADDITIONAL_INFORMATION& |
    Then I should see created Record in Immunisations page
      | &VISITED_NAME_RANDOM& |

    Examples:
      | Option     |
      | My Entries |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S6- Patient Edit Created Record in  Immunisations
    Given I am on "<Tab>" Immunisation page
    And I edit Created "<Record>" in Immunisations page
    And I change "<AdditionalName>" in Immunisations page
    When I am on "<Tab>" Immunisation page
    And I delete Created "<Record>" in Immunisations page
    Then I should see Patient Record is deleted

    Examples:
      | Tab           | Record                | AdditionalName    |
      | Immunisations | &VISITED_NAME_RANDOM& | &EDIT_ADDITIONAL& |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S6- Patient Edit Created Record in  COVIDImmunisations
    Given I am on "<Tab>" CovidImmunisation page
    And  I Click Info Icon in My Entries to see COVID Immunisation Details page
      | &DATA_MY_ENTRIES_COVID_IMMUNISATIONS& | &DATA_MY_ENTRIES_INSIDE_COVID_IMMUNISATIONS& |&MOBILE_DATA_MY_ENTRIES_INSIDE_COVID_IMMUNISATIONS&|
    And I Create New Record in COVIDImmunisations page
      | &VACCINE_NAME&           |
      | &BATCH_NO&               |
      | &ADDITIONAL_INFORMATION& |
      | &FILE_UPLOAD&            |
    When I edit Created "<Record>" in CovidImmunisations page
    And I change "<AdditionalName>" in CovidImmunisations page
    And I am on "<Tab>" CovidImmunisation page
    Then I delete Created "<Record>" in CovidImmunisations page
    And I navigate to the Homepage
    Examples:
      | Tab           | Record                                     | AdditionalName    |
      | Immunisations | Comirnaty, COVID-19 mRNA (Pfizer-BioNTech) | &EDIT_ADDITIONAL& |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S7- Verify My Health Records can view all the My Entries Future in Classifications.

    Given As a user I am on HomePage
    When I navigate to the "<Classifications>" Classifications page Dropdown
    Then I should see all the Entries From Health Centre future Grid View in Classifications page
      | &CLASSIFICATIONS_TABLE_DATA&   |
      | &CLASSIFICATIONS_TABLE_DATA_1& |
      | &CLASSIFICATIONS_TABLE_DATA_2& |

    And  I Click Info Icon to see Classifications page
      | &CLASSIFICATIONS_TABLE_DATA&   | &CLASSIFICATIONS_ICON_DATA&   |&CLASSIFICATIONS_MOBILE_ICON_DATA&|
      | &CLASSIFICATIONS_TABLE_DATA_1& | &CLASSIFICATIONS_ICON_DATA_1& | &CLASSIFICATIONS_MOBILE_ICON_DATA_1& |
      | &CLASSIFICATIONS_TABLE_DATA_2& | &CLASSIFICATIONS_ICON_DATA_2& | &CLASSIFICATIONS_MOBILE_ICON_DATA_2& |
    And I navigate to the Homepage
    Examples:
      | Classifications  |
      | &FILTER_BY_DATA& |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S8- Verify My Health Records can view all the My Entries Future in Classifications.

    Given As a user I am on HomePage
    And I navigate to the Classifications
    And I should see all the Entries From Health Centre future Grid View in Classifications page
      | &CLASSIFICATIONS_TABLE_DATA&   |
      | &CLASSIFICATIONS_TABLE_DATA_1& |
      | &CLASSIFICATIONS_TABLE_DATA_2& |
    When I select "<Option>" filter dropdown
    And I should see all My Entries Classifications page
      | &DATA_MY_ENTRIES_CLASSIFICATIONS& |
    And  I Click Info Icon in My Entries to see Classifications page
      | &DATA_MY_ENTRIES_CLASSIFICATIONS& | &DATA_MY_ENTRIES_INSIDE_CLASSIFICATIONS& |&DATA_MOBILE_MY_ENTRIES_INSIDE_CLASSIFICATIONS&|
    And I Create New Record in My Entries in Classifications page
      | &VISITED_NAME_RANDOM&    |
      | &VISITED_DROPDOWN&       |
      | &ADDITIONAL_INFORMATION& |
    Then I should see created Record in Classifications page
      | &VISITED_NAME_RANDOM& |

    Examples:
      | Option     |
      | My Entries |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S8- Patient Edit Created Record in  Classifications
    Given I am on "<Tab>" Classifications page
    And I edit Created "<Record>" in Classifications page
    And I change "<StatusDrop>" in Classifications page
    When I am on "<Tab>" Classifications page
    And I delete Created "<Record>" in Classifications page
    Then I should see Patient Record is deleted
    And I navigate to the Homepage
    Examples:
      | Tab             | Record                | StatusDrop |
      | Classifications | &VISITED_NAME_RANDOM& | Long Term  |


  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario: S9- Verify My Health Records can view all the My Entries Future in Lab Results.

    Given As a user I am on HomePage
    When I navigate to the Lab Results page
    And I should see all the Entries From Health Centre future Grid View in Lab Results page
      | &LAB_RESULT_TABLE_DATA&   |
      | &LAB_RESULT_TABLE_DATA_1& |
    When  I Click Info Icon to see Lab Results page
      | &LAB_RESULT_TABLE_DATA&   | &LAB_RESULT_ICON_DATA&   |&LAB_RESULT_MOBILE_ICON_DATA&|
      | &LAB_RESULT_TABLE_DATA_1& | &LAB_RESULT_ICON_DATA_1& |&LAB_RESULT_MOBILE_ICON_DATA_1&|
    And I Click Info Icon to see Test Results in Lab Results page
      | &LAB_RESULT_TABLE_DATA&   | &TEST_RESULT_ICON_DATA&   | &TEST_MOBILE_RESULT_ICON_DATA&|
      | &LAB_RESULT_TABLE_DATA_1& | &TEST_RESULT_ICON_DATA_1& | &TEST_MOBILE_RESULT_ICON_DATA_1&|
    And I navigate to the Homepage

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S10- Verify My Health Records can view all the My Entries Future in Clinic Notes.

    Given As a user I am on HomePage
    When I navigate to the "<ClinicNotes>"Clinic Notes page dropdown
    Then I should see all the Entries From Health Centre future Grid View in Clinic Notes page
      | &CLINIC_TABLE_DATA&   |
      | &CLINIC_TABLE_DATA_1& |
      | &CLINIC_TABLE_DATA_2& |
      | &CLINIC_TABLE_DATA_3& |
    And I Click Info Icon to see Clinic Notes page
      | &CLINIC_TABLE_DATA&   | &CLINIC_ICON_DATA&   |&CLINIC_MOBILE_ICON_DATA&|
      | &CLINIC_TABLE_DATA_1& | &CLINIC_ICON_DATA_1& |&CLINIC_MOBILE_ICON_DATA_1&|
      | &CLINIC_TABLE_DATA_2& | &CLINIC_ICON_DATA_2& |&CLINIC_MOBILE_ICON_DATA_2&|
      | &CLINIC_TABLE_DATA_3& | &CLINIC_ICON_DATA_3& | &CLINIC_MOBILE_ICON_DATA_3&|
    And I navigate to the Homepage
    Examples:
      | ClinicNotes      |
      | &FILTER_BY_DATA& |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S11- Patient Create New Record in Clinic Notes
    Given As a user I am on HomePage
    And I navigate to the Clinic Notes
    And I should see all the Entries From Health Centre future Grid View in Clinic Notes page
      | &CLINIC_TABLE_DATA&   |
      | &CLINIC_TABLE_DATA_1& |
      | &CLINIC_TABLE_DATA_2& |
      | &CLINIC_TABLE_DATA_3& |
    When I select "<Option>" filter dropdown
    And I should see all My Entries in my health records
      | &DATA_MY_ENTRIES_CLINIC_NOTES_1& |
    And  I Click Info Icon in My Entries to see my health records
      | &DATA_MY_ENTRIES_CLINIC_NOTES_1& | &DATA_MY_ENTRIES_INSIDE_CLINIC_NOTES_1& | &MOBILE_DATA_MY_ENTRIES_INSIDE_CLINIC_NOTES_1&|
    And I Create New Record in My Health Records
      | &VISITED_NAME_RANDOM&    |
      | &VISITED_LOCATION&       |
      | &ADDITIONAL_INFORMATION& |
    Then I should see created Record in My Health Records
      | &VISITED_NAME_RANDOM& |

    Examples:
      | Option     |
      | My Entries |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Template: S11- Patient Edit Created Record in Clinic Notes
    Given I am on "<Tab>" Clinic Notes page
    And I edit Created "<Record>" in My Health Records
    And I change "<Location>" in Clinic Notes
    When   I am on "<Tab>" Clinic Notes page
    And I delete Created "<Record>" in Clinic Notes
    Then I should see Patient Record is deleted
    And I navigate to the Homepage
    Examples:
      | Tab             | Record                | Location        |
      | Clinician Notes | &VISITED_NAME_RANDOM& | &EDIT_LOCATION& |

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario: S13- Verify My Health Records can view all the My Entries Future in Summary.

    Given As a user I am on HomePage
    And I navigate to the Health Summary
    When I click Export Health Summary
    Then I navigate to the Homepage

  @WEB @Mobile @HEALTH_RECORDS @HAPPY_PATH @HAPPY_PATH_MOBILE_RESPONSE
  Scenario Outline: S12- Verify My Health Records can view all the My Entries Future in Recalls.

    Given As a user I am on HomePage
    And As I am on MMH login Page
    And I enter "<Email Address>" and "<Password>"
    And I click login button
    When I navigate to the Recalls page
    And I should see all the Entries From Health Centre future Grid View in Recalls page
      | &RECALLS_TABLE_DATA_1& |
    And I Click Info Icon to see Recalls page
      | &RECALLS_TABLE_DATA_1& | &RECALLS_ICON_DATA_1& |&MOBILE_RECALLS_ICON_DATA_1&|
    Then I should see all the Entries From Health Centre Recall Remainder Details future Grid View in Recalls page
      | &RECALLS_REMAINDER_TABLE_DATA& |
    And  I Click Info Icon to see Recall Remainder Details in Recalls page
      | &RECALLS_REMAINDER_TABLE_DATA& | &RECALLS_REMAINDER_ICON_DATA& | &MOBILE_RECALLS_REMAINDER_ICON_DATA& |
    And I navigate to the Homepage

    Examples:
      | Email Address | Password              |
      | &EMAIL_MMH&   | &PASSWORD_FOR_HEALTH& |

