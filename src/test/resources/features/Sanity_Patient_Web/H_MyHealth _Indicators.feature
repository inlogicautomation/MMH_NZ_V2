Feature:MyHealth_Indicators

  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template: Changing machines timezone

    Given I change Windows "<TimeZone>"

    Examples:
      | TimeZone                  |
      | New Zealand Standard Time |

  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template:Pref- User Successfully logs in to the beta v2 Portal.
    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address   | Password           |
      | &EMAIL FOR RRP& | &PASSWORD FOR RRP& |
      #Note:{#142:Login as Existing patient & view/click on My Health Indicators
  #143:By default All tab is selected to view Active & Inactive indicators in card
  #144:Click on Active to view all active indicators in card view
  #145:Click on Inactive to view all inactive indicators in card view
   # These tests Case Covered The Scenario NO: S1
  #}
  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS1
  Scenario:S1-Patient can view all the Active & Inactive My Health Indicators Records in the card view.

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    When I Click on Active to view all active indicators in card view
      | &CARD_DETAILS& |
    Then I Click on Inactive to view all inactive indicators in card view
      | &CARD_DETAILS& |

      #Note:{ #150:Navigate to Alcohol indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           # 167:Click on menu in Alcohol card & add new value & added value must be displayed in My entries
           #168:Click on menu in Alcohol card & set reminder
           #169: Click on menu in Alcohol card & change privacy settings - Keep this private(No data shared)/show this entry to my provider(shared to provider)
           #170:Click on menu in Alcohol card & change status - Active/Inactive
           #172:Click on All tab to view both values added by patient & provider in grid
           #173:Click on My entries to view entries added by patient in grid
           #174:Click Edit/Delete in All/My Entries Records
           # These tests Case Covered The Scenario NO: S2
      #}
  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template: S2-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder,privacy settings in My entries Alcohol Details

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    And I click the view summary button & Navigate to My Health indicators from the Alcohol
    And I click on add new Button & Enter the Alcohol Medicine Details
      | &ALCOHOL_MY_ENTRIES_DATA& |
    When I click on the menu in the Alcohol card & set a reminder
      | &ALCOHOL_CARD_DATA&     |
      | &ALCOHOL_REMINDER_DATA& |
    And I change the status to Active and Inactive from the My entries Alcohol Details
      | &ALCOHOL_CARD_DATA& |
    And I click on menu in Alcohol card & change privacy settings
      | &ALCOHOL_PRIVACY_SETTINGS_DATA& |
    Then I should see all the Alcohol My Entries Medicine details in the grid view
      | &ALCOHOL_MY_ENTRIES_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit Alcohol of My Entries records "<Records>"
    And I click on Delete Icon "<Edit Icon>"& I verify the Alcohol My Entries Record is deleted
    Examples:
      | Edit Icon                      | Records                |
      | &EDIT_ALCOHOL_MY_ENTRIES_DATA& | &EDIT_ALCOHOL_DETAILS& |

#  @WEB @MY_HEALTH_INDICATORS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |

      #Note:{ #151:Navigate to Anxiety Severity indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           # 176:Click on menu in Anxiety Severity card & add new value & added value must be displayed in My entries
           #177:Click on menu in Anxiety Severity card & set reminder
           #178: Click on menu in Anxiety Severity card & change privacy settings - Keep this private(No data shared)/show this entry to my provider(shared to provider)
           #179:Click on menu in Anxiety Severity card & change status - Active/Inactive
           #181:Click on All tab to view both values added by patient & provider in grid
           #182:Click on My entries to view entries added by patient in grid
           #183:Click Edit/Delete in All/My Entries Records
           # These tests Case Covered The Scenario NO: S3
      #}

  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template: S3-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder,privacy settings in My entries Anxiety Severity Details

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    And I click the view summary button & Navigate to My Health indicators from the Anxiety Severity
    And I click on add new Button & Enter the Anxiety Severity Medicine Details
      | &ANXIETY_MY_ENTRIES_DATA& |
    When I click on the menu in the Anxiety Severity card & set a reminder
      | &ANXIETY_CARD_DATA&     |
      | &ANXIETY_REMINDER_DATA& |
    And I change the status to Active and Inactive from the My entries Anxiety Severity Details
      | &ANXIETY_CARD_DATA& |
    And I click on menu in Anxiety Severity card & change privacy settings
      | &ANXIETY_PRIVACY_SETTINGS_DATA& |
    Then I should see all the Anxiety Severity My Entries Medicine details in the grid view
      | &ANXIETY_MY_ENTRIES_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit Anxiety Severity of My Entries records "<Records>"
    And I click on Delete Icon "<Records>"& I verify the Anxiety Severity My Entries Record is deleted
    Examples:
      | Edit Icon                      | Records                |
      | &EDIT_ANXIETY_MY_ENTRIES_DATA& | &EDIT_ANXIETY_DETAILS& |

    #Note:{#149:Navigate to all indicators from the summary tab to view individual indicator details
           #150:Navigate to Blood Pressure indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           #193:Click on Health Centre to view entries added by provider in grid
           # These tests Case Covered The Scenario NO: S4
        #}
  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario: S4-Verify the Blood Pressure Health Centre Medicine Details in Existing Patient

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    When I Navigate to all My Health indicators from the summary tab
    And I Navigate to My Health indicators from the Blood Pressure
    Then I should see all the Blood Pressure Entries From Health center Medicine Details in a grid view
      | &BLOOD_PRESSURE_TABLE_DATA& |

#  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
#  Scenario Template:Pref- User Successfully logs in to the beta v2 Portal.
#    Given As a user I am on beta MMH login Page
#    And I enter "<Email Address>" and "<Password>" For Beta
#    When I click SignIn button
#    Then I should see user successfully logs in to the MMH portal
#    Examples:
#      | Email Address   | Password           |
#      | &EMAIL FOR RRP& | &PASSWORD FOR RRP& |
#
#  @WEB @MY_HEALTH_INDICATORS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |
   #Note:{ #150:Navigate to Blood Pressure indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           # 185:Click on menu in Blood Pressure card & add new value & added value must be displayed in My entries
           #186:Click on menu in Blood Pressure card & set reminder
           #187: Click on menu in Blood Pressure card & change privacy settings - Keep this private(No data shared)/show this entry to my provider(shared to provider)
           #188:Click on menu in Blood Pressure card & change status - Active/Inactive
           #190:Click on All tab to view both values added by patient & provider in grid
           # 191:Click on My entries to view entries added by patient in grid
           #192:Click Edit/Delete in All/My Entries Records
           # These tests Case Covered The Scenario NO: S5
      #}
  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template: S5-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder,privacy settings in My entries Blood Pressure Details

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    And I click the view summary button & Navigate to My Health indicators from the Blood Pressure
    And I click on add new Button & Enter the Blood Pressure Medicine Details
      | &BLOOD_PRESSURE_MY_ENTRIES_DATA& |
    When I click on the menu in the Blood Pressure card & set a reminder
      | &BLOOD_PRESSURE_CARD_DATA&     |
      | &BLOOD_PRESSURE_REMINDER_DATA& |
    And I change the status to Active and Inactive from the My entries Blood Pressure Details
      | &BLOOD_PRESSURE_CARD_DATA& |
    And I click on menu in  Blood Pressure card & change privacy settings
      | &BLOOD_PRESSURE_PRIVACY_SETTINGS_DATA& |
    Then I should see all the Blood Pressure My Entries Medicine details in the grid view
      | &BLOOD_PRESSURE_MY_ENTRIES_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit Blood Pressure of My Entries records "<Records>"
    And I click on Delete Icon "<Edit Icon>"& I verify the Blood Pressure My Entries Record is deleted
    Examples:
      | Edit Icon                             | Records                 |
      | &EDIT_BLOOD_PRESSURE_MY_ENTRIES_DATA& | &EDIT_SYSTOLIC_DETAILS& |

#  @WEB @MY_HEALTH_INDICATORS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |

      #Note:{ #153:Navigate to Blood Sugar indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           # 194:Click on menu in Blood Sugar card & add new value & added value must be displayed in My entries
           #195:Click on menu in Blood Sugar card & set reminder
           #196:Click on menu in Blood Sugar card & change privacy settings - Keep this private(No data shared)/show this entry to my provider(shared to provider)
           #197:Click on menu in Blood Sugar card & change status - Active/Inactive
           #199:Click on All tab to view both values added by patient & provider in grid
           # 200:Click on My entries to view entries added by patient in grid
           #201:Click Edit/Delete in All/My Entries Records
           # These tests Case Covered The Scenario NO: S6
      #}


  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template: S6-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder,privacy settings in My entries Blood Sugar Details

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    And I click the view summary button & Navigate to My Health indicators from the Blood Sugar
    And I click on add new Button & Enter the Blood Sugar Medicine Details
      | &BLOOD_SUGAR_MY_ENTRIES_DATA& |
    When I click on the menu in the Blood Sugar card & set a reminder
      | &BLOOD_SUGAR_CARD_DATA&     |
      | &BLOOD_SUGAR_REMINDER_DATA& |
    And I change the status to Active and Inactive from the My entries Blood Sugar Details
      | &BLOOD_SUGAR_CARD_DATA& |
    And I click on menu in Blood Sugar card & change privacy settings
      | &BLOOD_SUGAR_PRIVACY_SETTINGS_DATA& |
    Then I should see all the Blood Sugar My Entries Medicine details in the grid view
      | &BLOOD_SUGAR_MY_ENTRIES_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit Blood Sugar of My Entries records "<Records>"
    And I click on Delete Icon "<Edit Icon>"& I verify the Blood Sugar My Entries Record is deleted
    Examples:
      | Edit Icon                          | Records                    |
      | &EDIT_BLOOD_SUGAR_MY_ENTRIES_DATA& | &EDIT_BLOOD_SUGAR_DETAILS& |
#
#  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
#  Scenario Template:Pref- User Successfully logs in to the beta v2 Portal.
#    Given As a user I am on beta MMH login Page
#    And I enter "<Email Address>" and "<Password>" For Beta
#    When I click SignIn button
#    Then I should see user successfully logs in to the MMH portal
#    Examples:
#      | Email Address   | Password           |
#      | &EMAIL FOR RRP& | &PASSWORD FOR RRP& |
#
#  @WEB @MY_HEALTH_INDICATORS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |
#Note:{#154:Navigate to BMI indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           #211:Click on Health Centre to view entries added by provider in grid
           # These tests Case Covered The Scenario NO: S7
        #}
  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario: S7-Verify the BMI Health Centre Medicine Details in Existing Patient

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    When I Navigate to all My Health indicators from the summary tab
    And I Navigate to My Health indicators from the BMI
    Then I should see all the BMI Entries From Health center Medicine Details in a grid view
      | &BMI_TABLE_DATA& |


      #Note:{ #155:Navigate to  Depression indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           # 212:Click on menu in  Depression card & add new value & added value must be displayed in My entries
           #213:Click on menu in Depression card & set reminder
           #214:Click on menu in Depression Severity card & change privacy settings - Keep this private(No data shared)/show this entry to my provider(shared to provider)
           #215:Click on menu in  Depression card & change status - Active/Inactive
           #217:Click on All tab to view both values added by patient & provider in grid
           # 218:Click on My entries to view entries added by patient in grid
           #219:Click Edit/Delete in All/My Entries Records
           # These tests Case Covered The Scenario NO: S8
      #}


  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template: S8-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder,privacy settings in My entries Depression Details

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    And I click the view summary button & Navigate to My Health indicators from the Depression
    And I click on add new Button & Enter the Depression Medicine Details
      | &DEPRESSION_MY_ENTRIES_DATA& |
    When I click on the menu in the Depression card & set a reminder
      | &DEPRESSION_CARD_DATA&     |
      | &DEPRESSION_REMINDER_DATA& |
    And I change the status to Active and Inactive from the My entries Depression Details
      | &DEPRESSION_CARD_DATA& |
    And I click on menu in Depression card & change privacy settings
      | &DEPRESSION_PRIVACY_SETTINGS_DATA& |
    Then I should see all the Depression My Entries Medicine details in the grid view
      | &DEPRESSION_MY_ENTRIES_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit Depression of My Entries records "<Records>"
    And I click on Delete Icon "<Records>"& I verify the Depression My Entries Record is deleted
    Examples:
      | Edit Icon                         | Records                   |
      | &EDIT_DEPRESSION_MY_ENTRIES_DATA& | &EDIT_DEPRESSION_DETAILS& |

#  @WEB  @MY_HEALTH_INDICATORS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |

 #Note:{ #156:Navigate to Drinking Survey & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           # 221:Click on menu in  Drinking Survey & add new value & added value must be displayed in My entries
           #222:Click on menu in Drinking Survey & set reminder
           #223:Click on menu in Drinking Survey card & change privacy settings - Keep this private(No data shared)/show this entry to my provider(shared to provider)
           #224:Click on menu in  Drinking Survey & change status - Active/Inactive
           #226:Click on All tab to view both values added by patient & provider in grid
           # 227:Click on My entries to view entries added by patient in grid
           #228:Click Edit/Delete in All/My Entries Records
           # These tests Case Covered The Scenario NO: S9
      #}

  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template: S9-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder,privacy settings in My entries Drinking Survey Details

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    And I click the view summary button & Navigate to My Health indicators from the Drinking Survey
    And I click on add new Button & Enter the Drinking Survey Medicine Details
      | &DRINKING_SURVEY_MY_ENTRIES_DATA& |
    When I click on the menu in the Drinking Survey card & set a reminder
      | &DRINKING_SURVEY_CARD_DATA&     |
      | &DRINKING_SURVEY_REMINDER_DATA& |
    And I change the status to Active and Inactive from the My entries Drinking Survey Details
      | &DRINKING_SURVEY_CARD_DATA& |
    And I click on menu in Drinking Survey card & change privacy settings
      | &DRINKING_SURVEY_PRIVACY_SETTINGS_DATA& |
    Then I should see all the Drinking Survey My Entries Medicine details in the grid view
      | &DRINKING_SURVEY_MY_ENTRIES_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit Drinking Survey of My Entries records "<Records>"
    And I click on Delete Icon "<Records>"& I verify the Drinking Survey My Entries Record is deleted
    Examples:
      | Edit Icon                              | Records                        |
      | &EDIT_DRINKING_SURVEY_MY_ENTRIES_DATA& | &EDIT_DRINKING_SURVEY_DETAILS& |

    #Note:{#157:Navigate to HBA1C indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           #238:Click on Health Centre to view entries added by provider in grid
           # These tests Case Covered The Scenario NO: S10
        #}
  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario: S10-Verify the HBA1C Health Centre Medicine Details in Existing Patient

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    When I Navigate to all My Health indicators from the summary tab
    And I Navigate to My Health indicators from the HBAC
    Then I should see all the HBAC Entries From Health center Medicine Details in a grid view
      | &HBA1C_TABLE_DATA& |

#  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
#  Scenario Template:Pref- User Successfully logs in to the beta v2 Portal.
#    Given As a user I am on beta MMH login Page
#    And I enter "<Email Address>" and "<Password>" For Beta
#    When I click SignIn button
#    Then I should see user successfully logs in to the MMH portal
#    Examples:
#      | Email Address   | Password           |
#      | &EMAIL FOR RRP& | &PASSWORD FOR RRP& |
#
#  @WEB  @MY_HEALTH_INDICATORS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |
      #Note:{ #157:Navigate to HBA1C indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           # 230:Click on menu in HBA1C card & add new value & added value must be displayed in My entries
           #231:Click on menu in HBA1C card & set reminder
           #232:Click on menu in HBA1C card & change privacy settings - Keep this private(No data shared)/show this entry to my provider(shared to provider)
           #233:Click on menu in HBA1C card & change status - Active/Inactive
           #235:Click on All tab to view both values added by patient & provider in grid
           # 236:Click on My entries to view entries added by patient in grid
           #237:Click Edit/Delete in All/My Entries Records
           # These tests Case Covered The Scenario NO: S11
      #}
  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template: S11-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder,privacy settings in My entries HBA1C Details

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    And I click the view summary button & Navigate to My Health indicators from the HBAC
    And I click on add new Button & Enter the HBAC Medicine Details
      | &HBA1C_MY_ENTRIES_DATA& |
    When I click on the menu in the HBAC card & set a reminder
      | &HBA1C_CARD_DATA&     |
      | &HBA1C_REMINDER_DATA& |
    And I change the status to Active and Inactive from the My entries HBAC Details
      | &HBA1C_CARD_DATA& |
    And I click on menu in HBAC card & change privacy settings
      | &HBA1C_PRIVACY_SETTINGS_DATA& |
    Then I should see all the HBAC My Entries Medicine details in the grid view
      | &HBA1C_MY_ENTRIES_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit HBAC of My Entries records "<Records>"
    And I click on Delete Icon "<Edit Icon>"& I verify the HBAC My Entries Record is deleted
    Examples:
      | Edit Icon                    | Records              |
      | &EDIT_HBA1C_MY_ENTRIES_DATA& | &EDIT_HBA1C_DETAILS& |
 #Note:{ #158:Navigate to HDL indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           # 239:Click on menu in HDL card & add new value & added value must be displayed in My entries
           #240:Click on menu in HDL card & set reminder
           #241:Click on menu in HDL card & change privacy settings - Keep this private(No data shared)/show this entry to my provider(shared to provider)
           #242:Click on menu in HDL card & change status - Active/Inactive
           #243:Click on All tab to view both values added by patient & provider in grid
           # 244:Click on My entries to view entries added by patient in grid
           #245:Click Edit/Delete in All/My Entries Records
           # These tests Case Covered The Scenario NO: S12
      #}

  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template: S12-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder,privacy settings in My entries HDL Details

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    And I click the view summary button & Navigate to My Health indicators from the HDL
    And I click on add new Button & Enter the HDL Medicine Details
      | &HDL_MY_ENTRIES_DATA& |
    When I click on the menu in the HDL card & set a reminder
      | &HDL_CARD_DATA&     |
      | &HDL_REMINDER_DATA& |
    And I change the status to Active and Inactive from the My entries HDL Details
      | &HDL_CARD_DATA& |
    And I click on menu in HDL card & change privacy settings
      | &HDL_PRIVACY_SETTINGS_DATA& |
    Then I should see all the HDL My Entries Medicine details in the grid view
      | &HDL_MY_ENTRIES_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit HDL of My Entries records "<Records>"
    And I click on Delete Icon "<Edit Icon>"& I verify the HDL My Entries Record is deleted
    Examples:
      | Edit Icon                  | Records            |
      | &EDIT_HDL_MY_ENTRIES_DATA& | &EDIT_HDL_DETAILS& |

#  @WEB  @MY_HEALTH_INDICATORS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |
    #Note:{#160:Navigate to LDL indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           #265:Click on Health Centre to view entries added by provider in grid
           # These tests Case Covered The Scenario NO: S13
        #}
  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario: S13-Verify the LDL Health Centre Medicine Details in Existing Patient

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    When I Navigate to all My Health indicators from the summary tab
    And I Navigate to My Health indicators from the LDL
    Then I should see all the LDL Entries From Health center Medicine Details in a grid view
      | &LDL_TABLE_DATA& |

         #Note:{ #160:Navigate to LDL indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           # 257:Click on menu in LDL card & add new value & added value must be displayed in My entries
           #258:Click on menu in LDL card & set reminder
           #259:Click on menu in LDL card & change privacy settings - Keep this private(No data shared)/show this entry to my provider(shared to provider)
           #260:Click on menu in LDL card & change status - Active/Inactive
           #262:Click on All tab to view both values added by patient & provider in grid
           #263:Click on My entries to view entries added by patient in grid
           #264:Click Edit/Delete in All/My Entries Records
           # These tests Case Covered The Scenario NO: S14
      #}
  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template: S14-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder,privacy settings in My entries LDL Details

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    And I click the view summary button & Navigate to My Health indicators from the LDL
    And I click on add new Button & Enter the LDL Medicine Details
      | &LDL_MY_ENTRIES_DATA& |
    When I click on the menu in the LDL card & set a reminder
      | &LDL_CARD_DATA&     |
      | &LDL_REMINDER_DATA& |
    And I change the status to Active and Inactive from the My entries LDL Details
      | &LDL_CARD_DATA& |
    And I click on menu in LDL card & change privacy settings
      | &LDL_PRIVACY_SETTINGS_DATA& |
    Then I should see all the LDL My Entries Medicine details in the grid view
      | &LDL_MY_ENTRIES_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit LDL of My Entries records "<Records>"
    And I click on Delete Icon "<Edit Icon>"& I verify the LDL My Entries Record is deleted
    Examples:
      | Edit Icon                  | Records            |
      | &EDIT_LDL_MY_ENTRIES_DATA& | &EDIT_LDL_DETAILS& |

#  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
#  Scenario Template:Pref- User Successfully logs in to the beta v2 Portal.
#    Given As a user I am on beta MMH login Page
#    And I enter "<Email Address>" and "<Password>" For Beta
#    When I click SignIn button
#    Then I should see user successfully logs in to the MMH portal
#    Examples:
#      | Email Address   | Password           |
#      | &EMAIL FOR RRP& | &PASSWORD FOR RRP& |
#
#  @WEB  @MY_HEALTH_INDICATORS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |
       #Note:{ #161:Navigate to Peak Flow indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           # 266:Click on menu in Peak Flow card & add new value & added value must be displayed in My entries
           #267:Click on menu in Peak Flow card & set reminder
           #268:Click on menu in Peak Flow card & change privacy settings - Keep this private(No data shared)/show this entry to my provider(shared to provider)
           #269:Click on menu in Peak Flow card & change status - Active/Inactive
           #271:Click on All tab to view both values added by patient & provider in grid
           #272:Click on My entries to view entries added by patient in grid
           #273:Click Edit/Delete in All/My Entries Records
           # These tests Case Covered The Scenario NO: S15
      #}

  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template: S15-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder,privacy settings in My entries Peak Flow Details

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    And I click the view summary button & Navigate to My Health indicators from the Peak Flow
    And I click on add new Button & Enter the Peak Flow Medicine Details
      | &PEAK_FLOW_MY_ENTRIES_DATA& |
    When I click on the menu in the Peak Flow card & set a reminder
      | &PEAK_FLOW_CARD_DATA&     |
      | &PEAK_FLOW_REMINDER_DATA& |
    And I change the status to Active and Inactive from the My entries Peak Flow Details
      | &PEAK_FLOW_CARD_DATA& |
    And I click on menu in Peak Flow card & change privacy settings
      | &PEAK_FLOW_PRIVACY_SETTINGS_DATA& |
    Then I should see all the Peak Flow My Entries Medicine details in the grid view
      | &PEAK_FLOW_MY_ENTRIES_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit Peak Flow of My Entries records "<Records>"
    And I click on Delete Icon "<Edit Icon>"& I verify the Peak Flow My Entries Record is deleted
    Examples:
      | Edit Icon                        | Records                  |
      | &EDIT_PEAK_FLOW_MY_ENTRIES_DATA& | &EDIT_PEAK_FLOW_DETAILS& |

#  @WEB  @MY_HEALTH_INDICATORS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |

      #Note:{ #162:Navigate to Smoking  indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           # 275:Click on menu in Smoking  card & add new value & added value must be displayed in My entries
           #276:Click on menu in Smoking  card & set reminder
           #277:Click on menu in Smoking card & change privacy settings - Keep this private(No data shared)/show this entry to my provider(shared to provider)
           #278:Click on menu in Smoking  card & change status - Active/Inactive
           #280:Click on All tab to view both values added by patient & provider in grid
           #281:Click on My entries to view entries added by patient in grid
           #282:Click Edit/Delete in All/My Entries Records
           # These tests Case Covered The Scenario NO: S16
      #}

  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template: S16-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder,privacy settings in My entries Smoking Details

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    And I click the view summary button & Navigate to My Health indicators from the Smoking
    And I click on add new Button & Enter the Smoking Medicine Details
      | &SMOKING_MY_ENTRIES_DATA& |
    When I click on the menu in the Smoking card & set a reminder
      | &SMOKING_CARD_DATA&     |
      | &SMOKING_REMINDER_DATA& |
    And I change the status to Active and Inactive from the My entries Smoking Details
      | &SMOKING_CARD_DATA& |
    And I click on menu in Smoking card & change privacy settings
      | &SMOKING_PRIVACY_SETTINGS_DATA& |
    Then I should see all the Smoking My Entries Medicine details in the grid view
      | &SMOKING_MY_ENTRIES_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit Smoking of My Entries records "<Records>"
    And I click on Delete Icon "<Edit Icon>"& I verify the Smoking My Entries Record is deleted
    Examples:
      | Edit Icon                      | Records                |
      | &EDIT_SMOKING_MY_ENTRIES_DATA& | &EDIT_SMOKING_DETAILS& |
#  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
#  Scenario Template:Pref- User Successfully logs in to the beta v2 Portal.
#    Given As a user I am on beta MMH login Page
#    And I enter "<Email Address>" and "<Password>" For Beta
#    When I click SignIn button
#    Then I should see user successfully logs in to the MMH portal
#    Examples:
#      | Email Address   | Password           |
#      | &EMAIL FOR RRP& | &PASSWORD FOR RRP& |
#  @WEB  @MY_HEALTH_INDICATORS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |

        #Note:{ #163:Navigate to Total Cholesterol  indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           # 284:Click on menu in Total Cholesterol  card & add new value & added value must be displayed in My entries
           #285:Click on menu in Total Cholesterol  card & set reminder
           #286:Click on menu in Total Cholesterol card & change privacy settings - Keep this private(No data shared)/show this entry to my provider(shared to provider)
           #287:Click on menu in Total Cholesterol  card & change status - Active/Inactive
           #289:Click on All tab to view both values added by patient & provider in grid
           #290:Click on My entries to view entries added by patient in grid
           #291:Click Edit/Delete in All/My Entries Records
           # These tests Case Covered The Scenario NO: S17
      #}


  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template: S17-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder,privacy settings in My entries Total Cholesterol Details

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    And I click the view summary button & Navigate to My Health indicators from the Total Cholesterol
    And I click on add new Button & Enter the Total Cholesterol Medicine Details
      | &TOTAL_CHOLESTEROL_MY_ENTRIES_DATA& |
    When I click on the menu in the Total Cholesterol card & set a reminder
      | &TOTAL_CHOLESTEROL_CARD_DATA&     |
      | &TOTAL_CHOLESTEROL_REMINDER_DATA& |
    And I change the status to Active and Inactive from the My entries Total Cholesterol Details
      | &TOTAL_CHOLESTEROL_CARD_DATA& |
    And I click on menu in Total Cholesterol card & change privacy settings
      | &TOTAL_CHOLESTEROL_PRIVACY_SETTINGS_DATA& |
    Then I should see all the Total Cholesterol My Entries Medicine details in the grid view
      | &TOTAL_CHOLESTEROL_MY_ENTRIES_DATA& |
    And I click on "<Edit Icon>" edit icon & I EditTotal Cholesterol of My Entries records "<Records>"
    And I click on Delete Icon "<Edit Icon>"& I verify the Total Cholesterol My Entries Record is deleted
    Examples:
      | Edit Icon                                | Records                          |
      | &EDIT_TOTAL_CHOLESTEROL_MY_ENTRIES_DATA& | &EDIT_TOTAL_CHOLESTEROL_DETAILS& |

      #Note:{ #164:Navigate to Triglycerides   indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           # 293:Click on menu in Triglycerides   card & add new value & added value must be displayed in My entries
           #294:Click on menu in Triglycerides  card & set reminder
           #295:Click on menu in Triglycerides card & change privacy settings - Keep this private(No data shared)/show this entry to my provider(shared to provider)
           #296:Click on menu in Triglycerides   card & change status - Active/Inactive
           #298:Click on All tab to view both values added by patient & provider in grid
           #299:Click on My entries to view entries added by patient in grid
           #300:Click Edit/Delete in All/My Entries Records
           # These tests Case Covered The Scenario NO: S18
      #}


  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template: S18-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder,privacy settings in My entries Triglycerides Details

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    And I click the view summary button & Navigate to My Health indicators from the Triglycerides
    And I click on add new Button & Enter the Triglycerides Medicine Details
      | &TRIGLYCERIDES_MY_ENTRIES_DATA& |
    When I click on the menu in the Triglycerides card & set a reminder
      | &TRIGLYCERIDES_CARD_DATA&     |
      | &TRIGLYCERIDES_REMINDER_DATA& |
    And I change the status to Active and Inactive from the My entries Triglycerides Details
      | &TRIGLYCERIDES_CARD_DATA& |
    And I click on menu in Triglycerides card & change privacy settings
      | &TRIGLYCERIDES_PRIVACY_SETTINGS_DATA& |
    Then I should see all the Triglycerides My Entries Medicine details in the grid view
      | &TRIGLYCERIDES_MY_ENTRIES_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit Triglycerides of My Entries records "<Records>"
    And I click on Delete Icon "<Edit Icon>"& I verify the Triglycerides My Entries Record is deleted
    Examples:
      | Edit Icon                            | Records                      |
      | &EDIT_TRIGLYCERIDES_MY_ENTRIES_DATA& | &EDIT_TRIGLYCERIDES_DETAILS& |
#  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
#  Scenario Template:Pref- User Successfully logs in to the beta v2 Portal.
#    Given As a user I am on beta MMH login Page
#    And I enter "<Email Address>" and "<Password>" For Beta
#    When I click SignIn button
#    Then I should see user successfully logs in to the MMH portal
#    Examples:
#      | Email Address   | Password           |
#      | &EMAIL FOR RRP& | &PASSWORD FOR RRP& |
#
#  @WEB  @MY_HEALTH_INDICATORS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |

         #Note:{ #165:Navigate to Waist Size indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           # 302:Click on menu inWaist Size card & add new value & added value must be displayed in My entries
           #303:Click on menu in Waist Size card & set reminder
           #304:Click on menu in Waist Size card & change privacy settings - Keep this private(No data shared)/show this entry to my provider(shared to provider)
           #305:Click on menu in Waist Size card & change status - Active/Inactive
           #307:Click on All tab to view both values added by patient & provider in grid
           #308:Click on My entries to view entries added by patient in grid
           #309:Click Edit/Delete in All/My Entries Records
           # These tests Case Covered The Scenario NO: S19
      #}

  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template: S19-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder,privacy settings in My entries Waist Size Details

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    And I click the view summary button & Navigate to My Health indicators from the Waist Size
    And I click on add new Button & Enter the Waist Size Medicine Details
      | &WAIST_SIZE_MY_ENTRIES_DATA& |
    When I click on the menu in the Waist Size card & set a reminder
      | &WAIST_SIZE_CARD_DATA&     |
      | &WAIST_SIZE_REMINDER_DATA& |
    And I change the status to Active and Inactive from the My entries Waist Size Details
      | &WAIST_SIZE_CARD_DATA& |
    And I click on menu in Waist Size & change privacy settings
      | &WAIST_SIZE_PRIVACY_SETTINGS_DATA& |
    Then I should see all the Waist Size My Entries Medicine details in the grid view
      | &WAIST_SIZE_MY_ENTRIES_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit Waist Size of My Entries records "<Records>"
    And I click on Delete Icon "<Edit Icon>"& I verify the Waist Size My Entries Record is deleted
    Examples:
      | Edit Icon                         | Records                   |
      | &EDIT_WAIST_SIZE_MY_ENTRIES_DATA& | &EDIT_WAIST_SIZE_DETAILS& |

      #Note:{ #154:Navigate to  BMI indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           # 203:Click on menu in  BMI card & add new value & added value must be displayed in My entries
           #204:Click on menu in  BMI card & set reminder
           #205:Click on menu in BMI card & change privacy settings - Keep this private(No data shared)/show this entry to my provider(shared to provider)
           #206:Click on menu in BMI card & change status - Active/Inactive
           #208:Click on All tab to view both values added by patient & provider in grid
           # 209:Click on My entries to view entries added by patient in grid
           #210:Click Edit/Delete in All/My Entries Records
           # These tests Case Covered The Scenario NO: S20
      #}

  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template: S20-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder,privacy settings in My entries BMI Details

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    And I click the view summary button & Navigate to My Health indicators from the BMI
    And I click on add new Button & Enter the BMI Medicine Details
      | &BMI_MY_ENTRIES_DATA& |
    When I click on the menu in the BMI card & set a reminder
      | &BMI_CARD_DATA&     |
      | &BMI_REMINDER_DATA& |
    And I change the status to Active and Inactive from the My entries BMI Details
      | &BMI_CARD_DATA& |
    And I click on menu in BMI & change privacy settings
      | &BMI_PRIVACY_SETTINGS_DATA& |
    Then I should see all the BMI My Entries Medicine details in the grid view
      | &BMI_MY_ENTRIES_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit BMI of My Entries records "<Records>"
    And I click on Delete Icon "<Edit Icon>"& I verify the BMI My Entries Record is deleted
    Examples:
      | Edit Icon                  | Records                   |
      | &EDIT_BMI_MY_ENTRIES_DATA& | &EDIT_BMI_HEIGHT_DETAILS& |
#  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
#  Scenario Template:Pref- User Successfully logs in to the beta v2 Portal.
#    Given As a user I am on beta MMH login Page
#    And I enter "<Email Address>" and "<Password>" For Beta
#    When I click SignIn button
#    Then I should see user successfully logs in to the MMH portal
#    Examples:
#      | Email Address   | Password           |
#      | &EMAIL FOR RRP& | &PASSWORD FOR RRP& |
#
#  @WEB @MY_HEALTH_INDICATORS @SANITY_PATH
#  Scenario Template: Changing machines timezone
#
#    Given I change Windows "<TimeZone>"
#
#    Examples:
#      | TimeZone                  |
#      | New Zealand Standard Time |

      #Note:{ #159:Navigate to Height indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           # 248:Click on menu in Height card & add new value & added value must be displayed in My entries
           #249:Click on menu in Height card & set reminder
           # 250:Click on menu in Height card & change privacy settings - Keep this private(No data shared)/show this entry to my provider(shared to provider)
           #351:Click on menu in Height card & change status - Active/Inactive
           #353:Click on All tab to view both values added by patient & provider in grid
           #354:Click on My entries to view entries added by patient in grid
           #355:Click Edit/Delete in All/My Entries Records
           # These tests Case Covered The Scenario NO: S21
      #}

  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template: S21-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder,privacy settings in My entries Height card Details

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    And I click the view summary button & Navigate to My Health indicators from the Height card
    When I click on the menu in the Height card card & set a reminder
      | &HEIGHT_CARD_SURVEY_CARD_DATA&     |
      | &HEIGHT_CARD_SURVEY_REMINDER_DATA& |
    And I change the status to Active and Inactive from the My entries Height card Details
      | &HEIGHT_CARD_SURVEY_CARD_DATA& |
    And I click on menu in Height & change privacy settings
      | &HEIGHT_PRIVACY_SETTINGS_DATA& |
    Then I should see all the Height card My Entries Medicine details in the grid view
      | &HEIGHT_CARD_SURVEY_MY_ENTRIES_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit Height card of My Entries records "<Records>"
    And I click on Delete Icon "<Edit Icon>"& I verify the Height card My Entries Record is deleted
    Examples:
      | Edit Icon                          | Records                    |
      | &EDIT_HEIGHT_CARD_MY_ENTRIES_DATA& | &EDIT_HEIGHT_CARD_DETAILS& |

      #Note:{ #166:Navigate to Height indicator & view graph based on time period & All/My entries/Health Centre values in grid & click on Add value
           #311:Click on menu in Height card & add new value & added value must be displayed in My entries
           #312:Click on menu in Height card & set reminder
           #313:Click on menu in Weight card & change privacy settings - Keep this private(No data shared)/show this entry to my provider(shared to provider)
           #314:Click on menu in Height card & change status - Active/Inactive
           #316:Click on All tab to view both values added by patient & provider in grid
           #317:Click on My entries to view entries added by patient in grid
           #318:Click Edit/Delete in All/My Entries Records
           # These tests Case Covered The Scenario NO: S22
      #}

  @WEB  @SANITY_PATH  @MY_HEALTH_INDICATORS
  Scenario Template: S22-Existing Patient Verify Medicine details and validate Add, edit, delete, change status, set reminder,privacy settings in My entries Weight card Details

    Given As a Existing user I am on HomePage and I click the My Health Indicators
    And I click the view summary button & Navigate to My Health indicators from the Weight card
    When I click on the menu in the Weight card card & set a reminder
      | &WEIGHT_CARD_DATA&          |
      | &WEIGHT_CARD_REMINDER_DATA& |
    And I change the status to Active and Inactive from the My entries Weight card Details
      | &WEIGHT_CARD_DATA& |
    And I click on menu in Weight & change privacy settings
      | &WEIGHT_PRIVACY_SETTINGS_DATA& |
    Then I should see all the Weight card My Entries Medicine details in the grid view
      | &WEIGHT_CARD_SURVEY_MY_ENTRIES_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit Weight card of My Entries records "<Records>"
    And I click on Delete Icon "<Records>"& I verify the Weight card My Entries Record is deleted
    Examples:
      | Edit Icon                          | Records                    |
      | &EDIT_WEIGHT_CARD_MY_ENTRIES_DATA& | &EDIT_WEIGHT_CARD_DETAILS& |







