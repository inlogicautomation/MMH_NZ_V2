Feature: View_Journal
  @WEB  @SANITY_PATH  @VIEW_JOURNAL
  Scenario Template:Pref- User Successfully logs in to the beta v2 Portal.
    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address   | Password           |
      | &EMAIL FOR RRP& | &PASSWORD FOR RRP& |

#Note:{333:Click on view Journal - Add Journal enter subject, category, notes, start date, end date, schedule even, privacy settings & click save
    #334:Added journal must be displayed in the grid
    #335:Journal kept private is not shared with provider
  #338:Add to calendar will add the event to patient calendar
  #339:Click on more info icon in view journal grid for specific journal will display details
  #400:Click on edit icon in view journal grid for specific journal will be able to edit & update the that specific journal
  #401:Click on delete icon in view journal grid for specific journal will delete the journal from grid
   #These test Case Covered The Scenario NO: S1
      #}

  @WEB @SANITY_PATH  @VIEW_JOURNAL
  Scenario Template:S1-Existing Patient VerifyJournal Details and validate enter subject, category, notes, start date, end date, schedule even, privacy settings,not shared with the provider in view Journal Details

    Given As a Existing user I am on HomePage and I click the Health Tools
    When I click on view Journal & Add Journal Details kept private are not shared with the provider
      | &VIEW_JOURNAL_ENTRIES_DATA& |
    And I should see all the Added journal Details must be displayed in the grid view
      | &VIEW_JOURNAL_TABLE_DATA& |
    Then I should see all the Added journal Details in more info
      | &VIEW_JOURNAL_TABLE_DATA& | &VIEW_JOURNAL_ICON_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit view Journal records "<Records>"
    And I click on Delete Icon "<Records>"& I verify the view Journal Record is deleted
    Examples:
      | Edit Icon                           | Records                     |
      | &EDIT_VIEW_JOURNAL_MY_ENTRIES_DATA& | &EDIT_VIEW_JOURNAL_DETAILS& |

    #Note:{333:Click on view Journal - Add Journal enter subject, category, notes, start date, end date, schedule even, privacy settings & click save
    #334:Added journal must be displayed in the grid
   #336:Journal shared with provider is displayed to provider
  #338:Add to calendar will add the event to patient calendar
  #339:Click on more info icon in view journal grid for specific journal will display details
  #400:Click on edit icon in view journal grid for specific journal will be able to edit & update the that specific journal
  #401:Click on delete icon in view journal grid for specific journal will delete the journal from grid
   #These test Case Covered The Scenario NO: S2
      #}

  @WEB  @SANITY_PATH  @VIEW_JOURNAL
  Scenario Outline:S2-Existing Patient VerifyJournal Details and validate enter subject, category, notes, start date, end date, schedule even, privacy settings,shared with the provider in view Journal Details

    Given As a Existing user I am on HomePage and I click the Health Tools
    When I click on view Journal & Add Journal Details shared with provider
      | &VIEW_JOURNAL_ENTRIES_DATA& |
    And I should see all the Added journal Details must be displayed in the grid view
      | &JOURNAL_TABLE_DATA& |
    Then I should see all the Added journal Details in more info
      | &JOURNAL_TABLE_DATA& | &VIEW_JOURNAL_ICON_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit view Journal records "<Records>"
    And I click on Delete Icon "<Records>"& I verify the view Journal Record is deleted
    Examples:
      | Edit Icon                           | Records                     |
      | &EDIT_VIEW_JOURNAL_MY_ENTRIES_DATA& | &EDIT_VIEW_JOURNAL_DETAILS& |