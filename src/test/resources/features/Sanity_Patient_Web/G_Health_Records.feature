Feature: Health_Records
  @WEB   @HEALTH_RECORDS @SANITY_PATH
  Scenario Template: Changing machines timezone

    Given I change Windows "<TimeZone>"

    Examples:
      | TimeZone                  |
      | New Zealand Standard Time |

  @WEB  @SANITY_PATH  @HEALTH_RECORDS
  Scenario Template:Pref- User Successfully logs in to the beta v2 Portal.
    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address   | Password           |
      | &EMAIL FOR RRP& | &PASSWORD FOR RRP& |

#Note: {80:Login as Existing patient & view/click on Health Records
    #81:Click on Prescription
    #82:Health centre entries displays all the medicine given by provider/updated from pms
    #83:View all the details in grid & click on more info icon for specific medicine details in prescription tab
     #These test Case Covered The Scenario NO: S1
      #}
  @WEB  @SANITY_PATH  @HEALTH_RECORDS
  Scenario Template: S1-Verify the Prescription Entries From Health center Medicine Details in Existing Patient

    Given As a Existing user I am on HomePage and I click the Health Records
    When I click on "<Prescription>" Prescription Page
    Then I should see all the Prescription Entries From Health center Medicine Details in a grid view
      | &PRESCRIPTION_TABLE_DATA& |
    And I click on the more info icon to see all the Prescription Entries From the Health center Medicine details
      | &PRESCRIPTION_TABLE_DATA& | &PRESCRIPTION_ICON_DATA& | &PRESCRIPTION_MOBILE_ICON_DATA& |
    Examples:
      | Prescription     |
      | &FILTER_BY_DATA& |



#Note:{84:My entries grid displays all the medicine added by patient in prescription tab
  #85:Click on add record & enter the Medicine name, dosage, start date & end date, additional info & share with doctor in prescription tab
  #86:Click on confirm & save button, Record is submitted & added in My entries grid in prescription tab
  #88:Click on Edit icon for specific record in My entries grid to edit added data in prescription tab
  #89:Click on More info icon for specific record in My entries grid to view details in prescription tab
  #90:Click on delete icon for specific record in My entries grid to delete added data in prescription tab
   #These tests Case Covered The Scenario NO: S2
  #}
  @WEB   @HEALTH_RECORDS @SANITY_PATH
  Scenario Template: S2-Existing Patient Verify Medicine details and validate edit ,delete,Share With Doctor in My entries Prescription Medicine Details

    Given As a Existing user I am on HomePage and I click the Health Records
    And I select My Entries "<My Entries>"
    And I click on add record & Enter the Medicine Details
      | &VISITED_NAME&                   |
      | &VISITED_DOSE_NAME&              |
      | &VISITED_PRESCRIPTION_DROPDOWN&  |
      | &VISITED_PRESCRIPTION_DROPDOWN1& |
      | &ADDITIONAL_INFORMATION&         |
      | &VISITED_MOBILE_VALUE&           |
    And I click on Confirm & Save Button
    When I click on "<Edit Icon>"edit icon & I Edit Prescription of My Entries records "<Records>"
    Then I should see all the Prescription My Entries Medicine details in more info
      | &MY_ENTRIES_PRESCRIPTIONS_DATA& | &SHARE_WITH_DOCTOR_PRESCRIPTIONS_DATA& | &MOBILE_DATA_MY_ENTRIES_INSIDE_PRESCRIPTIONS& |
    And I click on Delete Icon "<Edit Icon>"& I verify the Prescription My Entries Record is deleted
    Examples:
      | My Entries | Edit Icon      | Records |
      | My Entries | &VISITED_NAME& | 3 time  |

#  @WEB  @HEALTH_RECORDS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |



#Note:{87:If share with doctor is uncheck then the records is not shared to health centre/provider & kept private in prescription tab
   #These test Case Covered The Scenario NO: S3
  #}
  @WEB   @HEALTH_RECORDS @SANITY_PATH
  Scenario Template: S3-Existing Patient Verify Medicine details and validate edit ,delete,Share WithOut Doctor in My entries Prescription Medicine Details

    Given As a Existing user I am on HomePage and I click the Health Records
    And I select My Entries "<My Entries>"
    And I click on Add record & Enter the Medicine Details
      | &VISITED_NAME&                   |
      | &VISITED_DOSE_NAME&              |
      | &VISITED_PRESCRIPTION_DROPDOWN&  |
      | &VISITED_PRESCRIPTION_DROPDOWN1& |
      | &ADDITIONAL_INFORMATION&         |
      | &VISITED_MOBILE_VALUE&           |
    And I click on Confirm & Save Button
    When I click on "<Edit Icon>"edit icon & I Edit Prescription of My Entries records "<Records>"
    Then I should see all the Prescription My Entries Medicine details in more info
      | &MY_ENTRIES_PRESCRIPTIONS_DATA& | &SHARE_WITH_OUT_DOCTOR_PRESCRIPTIONS_DATA& | &MOBILE_DATA_MY_ENTRIES_INSIDE_PRESCRIPTIONS& |
    And I click on Delete Icon "<Edit Icon>"& I verify the Prescription My Entries Record is deleted
    Examples:
      | My Entries | Edit Icon      | Records |
      | My Entries | &VISITED_NAME& | 3 time  |

#Note:{91:Click on Allergies
  #92:Health centre entries displays all the allergies name given by provider/updated from pms
  #93:View all the details in grid & click on more info icon for specific allergies name details in allergies tab
  #94:My entries grid displays all the allergies added by patient in allergies tab
   #These tests Case Covered The Scenario NO: S4
  #}
  @WEB  @SANITY_PATH @HEALTH_RECORDS
  Scenario Template: S4-Verify the Allergies Entries From Health center Medicine Details in Existing Patient

    Given As a Existing user I am on HomePage and I click the Health Records
    When I click on "<Allergies>" Allergies Page
    Then I should see all the Allergies Entries From Health center Medicine Details in a grid view
      | &ALLERGIES_TABLE_DATA& |
    And I click on the more info icon to see all the Allergies Entries From the Health center Medicine details
      | &ALLERGIES_TABLE_DATA& | &ALLERGIES_ICON_DATA& | &ALLERGIES_MOBILE_ICON_DATA& |
    Examples:
      | Allergies        |
      | &FILTER_BY_DATA& |

#  @WEB   @HEALTH_RECORDS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |
#Note:{#95:Click on add record & enter the allergies name, severity, status, start date & end date, additional info & share with doctor in allergies tab
  #96:Click on confirm & save button, Record is submitted & added in My entries grid in allergies tab
  #98:Click on edit icon for specific record in My entries grid to edit added data in allergies tab
  #99:Click on More info icon for specific record in My entries grid to view details in allergies tab
  #100:Click on delete icon for specific record in My entries grid to delete added data in allergies tab
   #These tests Case Covered The Scenario NO: S5
  #}
  @WEB  @HEALTH_RECORDS @SANITY_PATH
  Scenario Template: S5-Existing Patient Verify Medicine details and validate edit ,delete,Share With Doctor in My entries Allergies Medicine Details

    Given As a Existing user I am on HomePage and I click the Health Records
    And I select My Entries "<My Entries>" Allergies Page
    And I click on add record & Enter the Allergies Medicine Details
      | &VISITED_NAME&                |
      | &VISITED_ALLERGIES_DROPDOWN&  |
      | &VISITED_ALLERGIES_DROPDOWN1& |
      | &ADDITIONAL_INFORMATION&      |
    And I click on Allergies Confirm & Save Button
    When I click on "<Edit Icon>"edit icon & I Edit Allergies of My Entries records "<Records>"
    Then I should see all the  Allergies My Entries Medicine details in more info
      | &MY_ENTRIES_ALLERGIES_DATA& | &SHARE_WITH_DOCTOR_ALLERGIES_DATA& | &MOBILE_DATA_MY_ENTRIES_INSIDE_ALLERGIES& |
    And I click on Delete Icon "<Edit Icon>"& I verify the  Allergies My Entries Record is deleted
    Examples:
      | My Entries | Edit Icon      | Records |
      | My Entries | &VISITED_NAME& | Low     |

#  @WEB  @HEALTH_RECORDS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |
#Note:{#97:If share with doctor is uncheck then the records is not shared to health centre/provider & kept private in allergies tab
   #These tests Case Covered The Scenario NO: S6
  #}

  @WEB  @HEALTH_RECORDS @SANITY_PATH
  Scenario Template: S6-Existing Patient Verify Medicine details and validate edit ,delete,Share WithOut Doctor in My entries Allergies Medicine Details

    Given As a Existing user I am on HomePage and I click the Health Records
    And I select My Entries "<My Entries>" Allergies Page
    And I click on Add record & Enter the Allergies Medicine Details
      | &VISITED_NAME&                |
      | &VISITED_ALLERGIES_DROPDOWN&  |
      | &VISITED_ALLERGIES_DROPDOWN1& |
      | &ADDITIONAL_INFORMATION&      |
    And I click on Allergies Confirm & Save Button
    When I click on "<Edit Icon>"edit icon & I Edit Allergies of My Entries records "<Records>"
    Then I should see all the  Allergies My Entries Medicine details in more info
      | &MY_ENTRIES_ALLERGIES_DATA& | &SHARE_WITH_OUT_DOCTOR_ALLERGIES_DATA& | &MOBILE_DATA_MY_ENTRIES_INSIDE_ALLERGIES& |
    And I click on Delete Icon "<Edit Icon>"& I verify the  Allergies My Entries Record is deleted
    Examples:
      | My Entries | Edit Icon      | Records |
      | My Entries | &VISITED_NAME& | Low     |
#Note:{#101:Click on Immunisation
  #102:Health centre entries displays all the Immunisation/vaccine name given by provider/updated from pms
  #103:View all the details in grid & click on more info icon for specific vaccine name details in immunisation tab
  #104:My entries grid displays all the Immunisation added by patient in immunisation tab
   #These test Case Covered The Scenario NO: S7
  #}
  @WEB  @SANITY_PATH  @HEALTH_RECORDS
  Scenario Template: S7-Existing Verify the Immunisations Entries From Health center Medicine Details in Existing Patient

    Given As a Existing user I am on HomePage and I click the Health Records
    When I click on "<Immunisations>"Immunisations Page
    Then I should see all the Immunisations Entries From Health center Medicine Details in a grid view
      | &IMMUNISATIONS_TABLE_DATA& |
    And I click on the more info icon to see all the Immunisations Entries From the Health center Medicine details
      | &IMMUNISATIONS_TABLE_DATA& | &IMMUNISATIONS_ICON_DATA& | &IMMUNISATION_MOBILE_ICON_DATA& |
    Examples:
      | Immunisations    |
      | &FILTER_BY_DATA& |

#  @WEB  @HEALTH_RECORDS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |
#Note:{#105:Click on add record & enter the vaccine name, date given, additional info & share with doctor in immunisation tab
  #106:Click on confirm & save button, Record is submitted & added in My entries grid in immunisation tab
  #109:Click on edit icon for specific record in My entries grid to edit added data in immunisation tab
  #110:Click on More info icon for specific record in My entries grid to view details in immunisation tab
  #111:Click on delete icon for specific record in My entries grid to delete added data in immunisation tab
  #These tests Case Covered The Scenario NO: S8
  #}
  @WEB  @HEALTH_RECORDS @SANITY_PATH
  Scenario Template: S8-Existing Patient Verify Medicine details and validate edit ,delete,Share With Doctor in My entries Immunisations Medicine Details

    Given As a Existing user I am on HomePage and I click the Health Records
    And I select My Entries "<My Entries>"Immunisations Page
    And I click on add record & Enter the Immunisations Medicine Details
      | &VISITED_NAME&           |
      | &ADDITIONAL_INFORMATION& |
    And I click on Immunisations Confirm & Save Button
    When I click on "<Edit Icon>"edit icon & I Edit Immunisations of My Entries records "<AdditionalName>"
    Then I should see all the  Immunisations My Entries Medicine details in more info
      | &MY_ENTRIES_IMMUNISATIONS_DATA& | &SHARE_WITH_DOCTOR_IMMUNISATION_ICON_DATA& | &MOBILE_DATA_MY_ENTRIES_INSIDE_IMMUNISATIONS& |
    And I click on Delete Icon "<Edit Icon>"& I verify the Immunisations My Entries Record is deleted
    Examples:
      | My Entries | Edit Icon      | AdditionalName    |
      | My Entries | &VISITED_NAME& | &EDIT_ADDITIONAL& |
#Note:{#108:If share with doctor is uncheck then the records is not shared to health centre/provider & kept private in immunisation tab
   #These tests Case Covered The Scenario NO: S9
  #}

  @WEB  @HEALTH_RECORDS @SANITY_PATH
  Scenario Template: S9-Existing Patient Verify Medicine details and validate edit ,delete,Share WithOut Doctor in My entries Immunisations Medicine Details

    Given As a Existing user I am on HomePage and I click the Health Records
    And I select My Entries "<My Entries>"Immunisations Page
    And I click on Add record & Enter the Immunisations Medicine Details
      | &VISITED_NAME&           |
      | &ADDITIONAL_INFORMATION& |
    And I click on Immunisations Confirm & Save Button
    When I click on "<Edit Icon>"edit icon & I Edit Immunisations of My Entries records "<AdditionalName>"
    Then I should see all the  Immunisations My Entries Medicine details in more info
      | &MY_ENTRIES_IMMUNISATIONS_DATA& | &SHARE_WITH_OUT_DOCTOR_IMMUNISATION_ICON_DATA& | &MOBILE_DATA_MY_ENTRIES_INSIDE_IMMUNISATIONS& |
    And I click on Delete Icon "<Edit Icon>"& I verify the Immunisations My Entries Record is deleted
    Examples:
      | My Entries | Edit Icon      | AdditionalName    |
      | My Entries | &VISITED_NAME& | &EDIT_ADDITIONAL& |
#
#  @WEB  @HEALTH_RECORDS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |
#Note:{#107:Add Covid Immunisation -  Dose 1/Dose2
   #These tests Case Covered The Scenario NO: S10
  #}
  @WEB  @HEALTH_RECORDS @SANITY_PATH
  Scenario Template: S10-Existing Patient Verify Medicine details and validate edit ,delete,Share With Doctor in My entries COVIDImmunisations Medicine Details

    Given As a Existing user I am on HomePage and I click the Health Records
    And I select My Entries "<My Entries>"Immunisations Page
    And I click on add record & Enter the COVIDImmunisations Medicine Details
      | &VACCINE_NAME&           |
      | &BATCH_NO&               |
      | &ADDITIONAL_INFORMATION& |
      | &FILE_UPLOAD&            |
    And I click on COVIDImmunisations Confirm & Save Button
    When I click on edit icon & I Edit COVIDImmunisations of My Entries records "<AdditionalName>"
    Then I should see all the COVIDImmunisations My Entries Medicine details in more info
      | &MY_ENTRIES_COVID_IMMUNISATIONS_DATA& | &SHARE_WITH_DOCTOR_COVID_IMMUNISATIONS& | &MOBILE_DATA_MY_ENTRIES_INSIDE_COVID_IMMUNISATIONS& |
    And I click on Delete Icon & I verify the COVIDImmunisations My Entries Record is deleted
    Examples:
      | My Entries | AdditionalName    |
      | My Entries | &EDIT_ADDITIONAL& |

  @WEB  @HEALTH_RECORDS @SANITY_PATH
  Scenario Template: S11-Existing Patient Verify Medicine details and validate edit ,delete,Share WithOut Doctor in My entries COVIDImmunisations Medicine Details

    Given As a Existing user I am on HomePage and I click the Health Records
    And I select My Entries "<My Entries>"Immunisations Page
    And I click on Add record & Enter the COVIDImmunisations Medicine Details
      | &VACCINE_NAME&           |
      | &BATCH_NO&               |
      | &ADDITIONAL_INFORMATION& |
      | &FILE_UPLOAD&            |
    And I click on COVIDImmunisations Confirm & Save Button
    When I click on edit icon & I Edit COVIDImmunisations of My Entries records "<AdditionalName>"
    Then I should see all the COVIDImmunisations My Entries Medicine details in more info
      | &MY_ENTRIES_COVID_IMMUNISATIONS_DATA& | &SHARE_WITH_OUT_DOCTOR_COVID_IMMUNISATIONS& | &MOBILE_DATA_MY_ENTRIES_INSIDE_COVID_IMMUNISATIONS& |
    And I click on Delete Icon & I verify the COVIDImmunisations My Entries Record is deleted
    Examples:
      | My Entries | AdditionalName    |
      | My Entries | &EDIT_ADDITIONAL& |

#  @WEB   @HEALTH_RECORDS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |



#Note:{#112:Click on Classification
  #113:Health centre entries displays all the Classification name given by provider/updated from pms
  #114:View all the details in grid & click on more info icon for specific Classification name details in classification tab
   #These tests Case Covered The Scenario NO: S12
  #}


  @WEB  @SANITY_PATH  @HEALTH_RECORDS
  Scenario Template: S12-Verify the Classifications Entries From Health center Medicine Details in Existing Patient

    Given As a Existing user I am on HomePage and I click the Health Records
    When I click on "<Classifications>" Classifications Page
    Then I should see all the Conditions Entries From Health center Medicine Details in a grid view
      | &CLASSIFICATIONS_TABLE_DATA& |
    And I click on the more info icon to see all the Classifications Entries From the Health center Medicine details
      | &CLASSIFICATIONS_TABLE_DATA& | &CLASSIFICATIONS_ICON_DATA& | &CLASSIFICATIONS_MOBILE_ICON_DATA& |
    Examples:
      | Classifications  |
      | &FILTER_BY_DATA& |

#Note:{#115:My entries grid displays all the Classification added by patient in classification tab in classification tab
  #116:Click on add record & enter the Classification name, status, start date, end date, additional info & share with doctor in classification tab
  #117:Click on confirm & save button, Record is submitted & added in My entries grid in classification tab
  #119:Click on edit icon for specific record in My entries grid to edit added data in classification tab
  #120:Click on More info icon for specific record in My entries grid to view details in classification tab
  #121:Click on delete icon for specific record in My entries grid to delete added data in classification tab
   #These tests Case Covered The Scenario NO: S13
  #}
  @WEB @HEALTH_RECORDS @SANITY_PATH
  Scenario Template: S13-Existing Patient Verify Medicine details and validate edit ,delete,Share With Doctor in My entries Classifications Medicine Details

    Given As a Existing user I am on HomePage and I click the Health Records
    And I select My Entries "<My Entries>" Classifications Page
    And I click on add record & Enter the  Classifications Medicine Details
      | &VISITED_NAME&           |
      | &VISITED_DROPDOWN&       |
      | &ADDITIONAL_INFORMATION& |
    And I click on Classifications Confirm & Save Button
    When I click on "<Edit Icon>"edit icon & I Edit  Classifications of My Entries records "<Records>"
    Then I should see all the  Classifications My Entries Medicine details in more info
      | &DATA_MY_ENTRIES_CLASSIFICATIONS& | &SHARE_WITH_DOCTOR_CLASSIFICATIONS_DATA& | &MOBILE_DATA_MY_ENTRIES_INSIDE_CLASSIFICATION& |
    And I click on Delete Icon "<Edit Icon>"& I verify the  Classifications My Entries Record is deleted
    Examples:
      | My Entries | Edit Icon      | Records   |
      | My Entries | &VISITED_NAME& | Long Term |

#  @WEB  @HEALTH_RECORDS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |
#Note:{#118:If share with doctor is uncheck then the records is not shared to health centre/provider & kept private in classification tab
   #These tests Case Covered The Scenario NO: S14
  #}
  @WEB @HEALTH_RECORDS @SANITY_PATH
  Scenario Template: S14-Existing Patient Verify Medicine details and validate edit ,delete,Share WithOut Doctor in My entries Classifications Medicine Details

    Given As a Existing user I am on HomePage and I click the Health Records
    And I select My Entries "<My Entries>" Classifications Page
    And I click on Add record & Enter the  Classifications Medicine Details
      | &VISITED_NAME&           |
      | &VISITED_DROPDOWN&       |
      | &ADDITIONAL_INFORMATION& |
    And I click on Classifications Confirm & Save Button
    When I click on "<Edit Icon>"edit icon & I Edit  Classifications of My Entries records "<Records>"
    Then I should see all the  Classifications My Entries Medicine details in more info
      | &DATA_MY_ENTRIES_CLASSIFICATIONS& | &SHARE_WITH_OUT_DOCTOR_CLASSIFICATIONS_DATA& | &MOBILE_DATA_MY_ENTRIES_INSIDE_CLASSIFICATION& |
    And I click on Delete Icon "<Edit Icon>"& I verify the  Classifications My Entries Record is deleted
    Examples:
      | My Entries | Edit Icon      | Records   |
      | My Entries | &VISITED_NAME& | Long Term |

#  @WEB  @SANITY_PATH  @HEALTH_RECORDS
#  Scenario Template:Pref- User Successfully logs in to the beta v2 Portal.
#    Given As a user I am on beta MMH login Page
#    And I enter "<Email Address>" and "<Password>" For Beta
#    When I click SignIn button
#    Then I should see user successfully logs in to the MMH portal
#    Examples:
#      | Email Address   | Password           |
#      | &EMAIL FOR RRP& | &PASSWORD FOR RRP& |



        #Note:{#122:Click on Lab Results
  #123:Health centre entries displays all the Lab Results given by provider/updated from pms
  #124:View all the details in grid & click on more info icon for specific Lab Results details in Lab Results tab
  # These tests Case Covered The Scenario NO: S15
  #}
  @WEB  @SANITY_PATH  @HEALTH_RECORDS
  Scenario: S15-Verify the Lab Results Entries From Health center Medicine Details in Existing Patient

    Given As a Existing user I am on HomePage and I click the Health Records
    When I click on Lab Results Page
    Then I should see all theLab Results Entries From Health center Medicine Details in a grid view
      | &LAB_RESULT_TABLE_DATA& |
    And I click on the more info icon to see all the Lab Results Entries From the Health center Medicine details
      | &LAB_RESULT_TABLE_DATA& | &LAB_RESULT_ICON_DATA& | &LAB_RESULT_MOBILE_ICON_DATA& |
    And I click on the more info icon to see all the Test Results Entries From the Health center Medicine details
      | &LAB_RESULT_TABLE_DATA& | &TEST_RESULT_ICON_DATA& | &TEST_MOBILE_RESULT_ICON_DATA& |

#  @WEB   @HEALTH_RECORDS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |



#Note:{#125:Click on Clinic Notes
  #126:Health centre entries displays all the clinic notes given by provider/updated from pms
  #127:View all the details in grid & click on more info icon for specific clinic notes details in clinic notes tab
    # These tests Case Covered The Scenario NO: S16
  #}
  @WEB  @SANITY_PATH  @HEALTH_RECORDS
  Scenario Template: S16-Verify the Clinic Notes Entries From Health center Medicine Details in Existing Patient

    Given As a Existing user I am on HomePage and I click the Health Records
    When I click on "<Clinic Notes>" Clinic Notes Page
    Then I should see all the Clinic Notes Entries From Health center Medicine Details in a grid view
      | &CLINIC_TABLE_DATA& |
    And I click on the more info icon to see all theClinic Notes Entries From the Health center Medicine details
      | &CLINIC_TABLE_DATA& | &CLINIC_ICON_DATA& | &CLINIC_MOBILE_ICON_DATA& |
    Examples:
      | Clinic Notes     |
      | &FILTER_BY_DATA& |
    #Note:{#128:My entries grid displays all the clinic notes added by patient in clinic notes tab
  #129:Click on add record & enter who I visited, visited location, visited date, additional info & share with doctor in clinic notes tab
  #130:Click on confirm & save button, Record is submitted & added in My entries grid in clinic notes tab
  #132:Click on edit icon for specific record in My entries grid to edit added data in clinic notes tab
  #133:Click on More info icon for specific record in My entries grid to view details in clinic notes tab
  #134:Click on delete icon for specific record in My entries grid to delete added data in clinic notes tab
  # These tests Case Covered The Scenario NO: S17
  #}
  @WEB  @HEALTH_RECORDS @SANITY_PATH
  Scenario Template: S17-Existing Patient Verify Medicine details and validate edit ,delete,Share With Doctor in My entries Clinic Notes Medicine Details

    Given As a Existing user I am on HomePage and I click the Health Records
    And I select My Entries "<My Entries>" Clinic Notes Page
    And I click on add record & Enter the Clinic Notes Medicine Details
      | &VISITED_NAME&           |
      | &VISITED_LOCATION&       |
      | &ADDITIONAL_INFORMATION& |
    And I click on Clinic Notes Confirm & Save Button
    When I click on "<Edit Icon>"edit icon & I Edit  Clinic Notes of My Entries records "<Records>"
    Then I should see all the  Clinic Notes My Entries Medicine details in more info
      | &DATA_MY_ENTRIES_CLINIC_NOTES_1& | &SHARE_WITH_DOCTOR_CLINIC_NOTES_DATA& | &MOBILE_DATA_MY_ENTRIES_INSIDE_CLINIC_NOTES_1& |
    And I click on Delete Icon "<Edit Icon>"& I verify the Clinic Notes My Entries Record is deleted
    Examples:
      | My Entries | Edit Icon      | Records         |
      | My Entries | &VISITED_NAME& | &EDIT_LOCATION& |

#  @WEB  @HEALTH_RECORDS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |
#Note:{#131:If share with doctor is uncheck then the records is not shared to health centre/provider & kept private in clinic notes tab
   # These tests Case Covered The Scenario NO: S18
  #}
  @WEB  @HEALTH_RECORDS @SANITY_PATH
  Scenario Template: S18-Existing Patient Verify Medicine details and validate edit ,delete,Share WithOut Doctor in My entries Clinic Notes Medicine Details

    Given As a Existing user I am on HomePage and I click the Health Records
    And I select My Entries "<My Entries>" Clinic Notes Page
    And I click on Add record & Enter the Clinic Notes Medicine Details
      | &VISITED_NAME&           |
      | &VISITED_LOCATION&       |
      | &ADDITIONAL_INFORMATION& |
    And I click on Clinic Notes Confirm & Save Button
    When I click on "<Edit Icon>"edit icon & I Edit  Clinic Notes of My Entries records "<Records>"
    Then I should see all the  Clinic Notes My Entries Medicine details in more info
      | &DATA_MY_ENTRIES_CLINIC_NOTES_1& | &SHARE_WITH_OUT_DOCTOR_CLINIC_NOTES_DATA& | &MOBILE_DATA_MY_ENTRIES_INSIDE_CLINIC_NOTES_1& |
    And I click on Delete Icon "<Edit Icon>"& I verify the Clinic Notes My Entries Record is deleted
    Examples:
      | My Entries | Edit Icon      | Records         |
      | My Entries | &VISITED_NAME& | &EDIT_LOCATION& |
#Note:{#135:Click on Recall
  #136:Health centre entries displays all the recall details scheduled by provider/updated from pms
  #137:View all the details in grid & click on more info icon for specific recall scheduled details in recall tab
  #138:View Recall Remainders
  # These tests Case Covered The Scenario NO: S19
  #}
  @WEB  @SANITY_PATH  @HEALTH_RECORDS
  Scenario: S19-Verify the Recalls Entries From Health center Medicine Details in Existing Patient

    Given As a Existing user I am on HomePage and I click the Health Records
    And I navigate to the Recalls page
    When I should see all the Recalls Entries From Health center Medicine Details in a grid view
      | &RECALLS_TABLE_DATA_1& |
    And I click on the more info icon to see all the Recalls Entries From the Health center Medicine details
      | &RECALLS_TABLE_DATA_1& | &RECALLS_ICON_DATA_1& | &MOBILE_RECALLS_ICON_DATA_1& |
    Then I should see all the Recall Remainder Entries From Health center Medicine Details in a grid view
      | &RECALLS_REMAINDER_TABLE_DATA& |
    And I click on the more info icon to see all the Recall Remainder Entries From the Health center Medicine details
      | &RECALLS_REMAINDER_TABLE_DATA& | &RECALLS_REMAINDER_ICON_DATA& | &MOBILE_RECALLS_REMAINDER_ICON_DATA& |


#Note:{#139:Navigate to Health Records summary page
  #140:Export Health Summary to PDF
  #141:Navigate to Edit Profile page from Health Summary page
   # These tests Case Covered The Scenario NO: S20
  #}
  @WEB  @SANITY_PATH @HEALTH_RECORDS
  Scenario: S20- Verify My Health Records can view all the My Entries Future in Summary.

    Given As a Existing user I am on HomePage and I click the Health Records
    And I navigate to the Health Summary
    When I click Export Health Summary
    Then Navigate to Edit Profile page from Health Summary page

    #Note:{#108:If share with doctor is uncheck then the records is not shared to health centre/provider & kept private in COVIDImmunisations tab
   #These tests Case Covered The Scenario NO: S11
  #}
