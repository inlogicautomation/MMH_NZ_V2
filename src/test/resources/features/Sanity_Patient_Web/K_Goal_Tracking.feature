Feature: Goal_Tracking

  @WEB  @SANITY_PATH @GOAL_TRACKING
  Scenario Template: Changing machines timezone

    Given I change Windows "<TimeZone>"

    Examples:
      | TimeZone                  |
      | New Zealand Standard Time |

  @WEB  @GOAL_TRACKING @SANITY_PATH
  Scenario Template:Pref- User Successfully logs in to the beta v2 Portal.
    Given As a user I am on beta MMH login Page
    And I enter "<Email Address>" and "<Password>" For Beta
    When I click SignIn button
    Then I should see user successfully logs in to the MMH portal
    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |

    #Note:{342:Login as Existing patient & view/click on Health Tools
    #343:Click on Goal Tracking - Add New Goal enter goal name, type, description, start date, end date, unit of measurement, initial value, final value, privacy settings & click save
    #345:Added goal must be displayed in goal tracking grid
    #346:Click on filter by current goals will display goals that are currently active in grid
    #348:Click on filter by Show All goal will display goals that are in current & previous in grid
    #349:Goal kept private is not shared with provider
    #358:Click on edit icon in goal tracking grid for specific goal will be able to edit & update the that specific goal
    #359:Click on delete icon in goal tracking grid for specific goal will delete the goal from grid
   # These tests Case Covered The Scenario NO: S1
  #}
      #}


  @WEB @GOAL_TRACKING @SANITY_PATH
  Scenario Template:S1-Existing Patient Verify Goal Tracking Details and validate enter subject, category, notes, start date, end date, schedule even, privacy settings, Not shared with the provider in Goal Tracking Details

    Given As a Existing user I am on HomePage and I click the Health Tools
    And I click on Goal Tracking & Add Goal Tracking Details kept private are not shared with the provider
      | &GOAL_TRACKING_ENTRIES_DATA& |
    When I should see all the Goal Tracking Details must be displayed in the grid view
      | &GOAL_TRACKING_ENTRIES_DATA& | &GOAL_TRACKING_ICON_DATA& |
    And click on the filter by current goals will display goals that are currently active in the grid view
      | &CURRENT_GOAL_TABLE_DATA& |
    Then click on the filter by Show All goal will display goals that are current & previous in the grid view
      | &SHOW_ALL_GOAL_TABLE_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit goal tracking records "<Records>"
    And I click on Delete Icon "<Edit Icon>" in the goal tracking grid for a specific goal will delete the goal from the grid
    Examples:
      | Edit Icon                            | Records                      |
      | &EDIT_GOAL_TRACKING_MY_ENTRIES_DATA& | &EDIT_GOAL_TRACKING_DETAILS& |


  #Note:{342:Login as Existing patient & view/click on Health Tools
    #343:Click on Goal Tracking - Add New Goal enter goal name, type, description, start date, end date, unit of measurement, initial value, final value, privacy settings & click save
    #345:Added goal must be displayed in goal tracking grid
    #346:Click on filter by current goals will display goals that are currently active in grid
    #348:Click on filter by Show All goal will display goals that are in current & previous in grid
    #350:Goal shared with provider is displayed to provider
    #358:Click on edit icon in goal tracking grid for specific goal will be able to edit & update the that specific goal
    #359:Click on delete icon in goal tracking grid for specific goal will delete the goal from grid
   # These tests Case Covered The Scenario NO: S2
  #}
      #}



  @WEB @GOAL_TRACKING @SANITY_PATH
  Scenario Template:S2-Existing Patient Verify Goal Tracking Details and validate enter subject, category, notes, start date, end date, schedule even, shared with the provider in Goal Tracking Details

    Given As a Existing user I am on HomePage and I click the Health Tools
    And I click on Goal Tracking & Add Goal Tracking Details kept private are shared with the provider
      | &SHARED_GOAL_TRACKING_ENTRIES_DATA& |
    When I should see all the Goal Tracking Details must be displayed in the grid view
      | &SHARED_GOAL_TRACKING_ENTRIES_DATA& | &SHARED_GOAL_TRACKING_ICON_DATA& |
    And click on the filter by current goals will display goals that are currently active in the grid view
      | &SHARED_CURRENT_GOAL_TABLE_DATA& |
    Then click on the filter by Show All goal will display goals that are current & previous in the grid view
      | &SHARED_SHOW_ALL_GOAL_TABLE_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit goal tracking records "<Records>"
    And I click on Delete Icon "<Edit Icon>" in the goal tracking grid for a specific goal will delete the goal from the grid
    Examples:
      | Edit Icon                                   | Records                      |
      | &SHARED_EDIT_GOAL_TRACKING_MY_ENTRIES_DATA& | &EDIT_GOAL_TRACKING_DETAILS& |



      #Note:{342:Login as Existing patient & view/click on Health Tools
    #343:Click on Goal Tracking - Add New Goal enter goal name, type, description, start date, end date, unit of measurement, initial value, final value, privacy settings & click save
    #345:Added goal must be displayed in goal tracking grid
    # 347:Click on filter by previous goal will display goals that have crossed end date in grid
    #349:Goal kept private is not shared with provider
    #358:Click on edit icon in goal tracking grid for specific goal will be able to edit & update the that specific goal
    #359:Click on delete icon in goal tracking grid for specific goal will delete the goal from grid
   # These tests Case Covered The Scenario NO: S3
  #}
      #}

  @WEB  @GOAL_TRACKING @SANITY_PATH
  Scenario Template:S3-Existing Patient Verify Previous goal Details Not shared with the provider

    Given As a Existing user I am on HomePage and I click the Health Tools
    When I click on Goal Tracking & Add Previous Goal Details kept private are not shared with the provider
      | &PREVIOUS_GOAL_TRACKING_ENTRIES_DATA& |
    Then click on the filter by the previous goal will display goals that have crossed the end date in the grid view
      | &PREVIOUS_GOAL_TABLE_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit goal tracking records "<Records>"
    And I click on Delete Icon "<Edit Icon>" in the goal tracking grid for a specific goal will delete the goal from the grid
    Examples:
      | Edit Icon                                     | Records                      |
      | &EDIT_PREVIOUS_GOAL_TRACKING_MY_ENTRIES_DATA& | &EDIT_GOAL_TRACKING_DETAILS& |

        #Note:{342:Login as Existing patient & view/click on Health Tools
    #343:Click on Goal Tracking - Add New Goal enter goal name, type, description, start date, end date, unit of measurement, initial value, final value, privacy settings & click save
    #345:Added goal must be displayed in goal tracking grid
    # 347:Click on filter by previous goal will display goals that have crossed end date in grid
    #350:Goal shared with provider is displayed to provider
    #358:Click on edit icon in goal tracking grid for specific goal will be able to edit & update the that specific goal
    #359:Click on delete icon in goal tracking grid for specific goal will delete the goal from grid
   # These tests Case Covered The Scenario NO: S4
  #}
      #}

  @WEB  @GOAL_TRACKING @SANITY_PATH
  Scenario Template:S4-Existing Patient Verify Previous goal Details shared with the provider

    Given As a Existing user I am on HomePage and I click the Health Tools
    When I click on Goal Tracking & Add Previous Goal Details kept private are shared with the provider
      | &SHARED_PREVIOUS_GOAL_TRACKING_ENTRIES_DATA& |
    Then click on the filter by the previous goal will display goals that have crossed the end date in the grid view
      | &SHARED_PREVIOUS_GOAL_TABLE_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit goal tracking records "<Records>"
    And I click on Delete Icon "<Edit Icon>" in the goal tracking grid for a specific goal will delete the goal from the grid
    Examples:
      | Edit Icon                                            | Records                      |
      | &SHARED_EDIT_PREVIOUS_GOAL_TRACKING_MY_ENTRIES_DATA& | &EDIT_GOAL_TRACKING_DETAILS& |



        #Note:{342:Login as Existing patient & view/click on Health Tools
    #344:Click on Goal Tracking - Add New Goal enter goal name, type, description, start date, end date, unit of measurement, initial value, final value, privacy settings & click save & set reminder
    #345:Added goal must be displayed in goal tracking grid
    # 351:Add goal - save & set reminder select reminder type, frequency, time, message - click on save
    #359:Click on delete icon in goal tracking grid for specific goal will delete the goal from grid
   # These tests Case Covered The Scenario NO: S5
  #}
      #}


  @WEB @GOAL_TRACKING @SANITY_PATH
  Scenario Template:S5-Existing Patient Verify Set Remainder Details and validate Set Reminder Save Button in Goal Tracking Details

    Given As a Existing user I am on HomePage and I click the Health Tools
    And I click on Goal Tracking & Add Goal Tracking Details kept private are not shared with the provider click save the set reminder
      | &GOAL_TRACKING_SET_REMINDER_ENTRIES_DATA& |
    When I click on set reminder & Add the set reminder details click the save button
      | &GOAL_TRACKING_SET_REMINDER_DATA& |
    Then I should see all the Added set reminder Details must be displayed in the grid view
      | &SET_REMINDER_TABLE_DATA& |
    And I click on Delete Icon "<Edit Icon>" in the goal tracking grid for a specific goal will delete the goal from the grid
    Examples:
      | Edit Icon           |
      | &SET_REMINDER_DATA& |

        #Note:{342:Login as Existing patient & view/click on Health Tools
    #344:Click on Goal Tracking - Add New Goal enter goal name, type, description, start date, end date, unit of measurement, initial value, final value, privacy settings & click save & set reminder
    #345:Added goal must be displayed in goal tracking grid
    # 352:Add goal - save & set reminder select reminder type, frequency, time, message - click on reminder preview
    #359:Click on delete icon in goal tracking grid for specific goal will delete the goal from grid
   # These tests Case Covered The Scenario NO: S6
  #}
      #}


  @WEB @GOAL_TRACKING @SANITY_PATH
  Scenario Template:S6-Existing Patient Verify Set Remainder Details and validate Set Reminder Preview Buttonin Goal Tracking Details

    Given As a Existing user I am on HomePage and I click the Health Tools
    And I click on Goal Tracking & Add Goal Tracking Details kept private are not shared with the provider click save the set reminder
      | &GOAL_TRACKING_PREVIEW_SET_REMINDER_ENTRIES_DATA& |
    When I click on set reminder & Add the set reminder details click on reminder preview
      | &GOAL_TRACKING_SET_REMINDER_DATA& |
    Then I should see all the Added set reminder Details must be displayed in the grid view
      | &SET_REMINDER_PREVIEW_TABLE_DATA& |
    And I click on Delete Icon "<Edit Icon>" in the goal tracking grid for a specific goal will delete the goal from the grid
    Examples:
      | Edit Icon                   |
      | &SET_REMINDER_PREVIEW_DATA& |


        #Note:{342:Login as Existing patient & view/click on Health Tools
    #344:Click on Goal Tracking - Add New Goal enter goal name, type, description, start date, end date, unit of measurement, initial value, final value, privacy settings & click save & set reminder
    #345:Added goal must be displayed in goal tracking grid
    # 353:Click on Add Value icon for specific goal in grid to add measured value, date, comments & click on save
    #355:Click on export to Excel under data tab to download the excel file
    #357:Click on more info icon in goal tracking grid for specific goal will display details
    #359:Click on delete icon in goal tracking grid for specific goal will delete the goal from grid
   # These tests Case Covered The Scenario NO: S7
  #}
      #}

  @WEB @GOAL_TRACKING @SANITY_PATH
  Scenario Template:S7-Existing Patient Verify Goal Tracking Details and validate Add Value Icon,Graph Icon,Export To download the excel file in Goal Tracking Details

    Given As a Existing user I am on HomePage and I click the Health Tools
    And I click on Goal Tracking & Add Goal Tracking Details kept private are not shared with the provider
      | &GOAL_TRACKING_GRAPH_ENTRIES_DATA& |
    When click on Add Value icon & Add measured value, date, comments & click on save
      | &GOAL_TRACKING_ADD_VALUE_DATA& |
    And click on Graph Icon & Click on export to Excel under data tab to download the excel file
      | &GOAL_TRACKING_ADD_VALUE_DATA& |
    Then I click on the edit icon & I Edit goal Analysis records and Delete the Goal Analysis Records
      | &GOAL_ANALYSIS_TABLE_DATA& |
    And I click on Delete Icon "<Edit Icon>" in the goal tracking grid for a specific goal will delete the goal from the grid
    Examples:
      | Edit Icon                                  |
      | &EDIT_GRAPH_GOAL_TRACKING_MY_ENTRIES_DATA& |

       #Note:{342:Login as Existing patient & view/click on Health Tools
    #344:Click on Goal Tracking - Add New Goal enter goal name, type, description, start date, end date, unit of measurement, initial value, final value, privacy settings & click save & set reminder
    #345:Added goal must be displayed in goal tracking grid
    # 353:Click on Add Value icon for specific goal in grid to add measured value, date, comments & click on save
    #361:Click on Add task - enter task name, description, due ate, reminder type, reminder frequency, time, message, add to calendar, status & click on save
    #367:Click on more info icon in future task / previous task grid for specific task will display details
   #368:Click on edit icon in view future task / previous task grid for specific task will be able to edit & update the that specific task
   #369:Click on delete icon in view future task / previous task grid for specific task will delete the task from grid
   # These tests Case Covered The Scenario NO: S8
  #}
      #}



  @WEB @GOAL_TRACKING @SANITY_PATH
  Scenario Template:S8-Existing Patient Verify Goal Tracking Details and validate Add New Task,Future Task Details in Goal Tracking Details

    Given As a Existing user I am on HomePage and I click the Health Tools
    And I click on Goal Tracking & Add Goal Tracking Details kept private are not shared with the provider
      | &GOAL_TRACKING_FUTURE_TASK_ENTRIES_DATA& |
    And click on Add Value icon & Add measured value, date, comments & click on save
      | &GOAL_TRACKING_FUTURE_TASK_ADD_VALUE_DATA& |
    When click on Add task icon & Add enter new task details and click on save
      | &ADD_FUTURE_TASK_ENTRIES_DATA& |
    And click on Reminder setting icon & Add enter new task details and click on save
      | &ADD_FUTURE_TASK_REMINDER_SETTING_DATA& |
    Then I should see all the Added future task grid Details must be displayed in more info
      | &ADD_FUTURE_TASK_REMINDER_SETTING_DATA& | &ADD_FUTURE_TASK_INFO_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit future task records "<Records>"
    And I click on "<Delete Icon>" Add Task delete icon
    And I click on Delete Icon "<GoalTrackingDeleteIcon>" in the goal tracking grid for a specific goal will delete the goal from the grid

    Examples:
      | Edit Icon                               | Records                    | Delete Icon                  | GoalTrackingDeleteIcon                     |
      | &ADD_FUTURE_TASK_REMINDER_SETTING_DATA& | &EDIT_FUTURE_TASK_DETAILS& | &DELETE_FUTURE_TASK_DETAILS& | &GOAL_TRACKING_FUTURE_TASK_ADD_VALUE_DATA& |



       #Note:{342:Login as Existing patient & view/click on Health Tools
    #344:Click on Goal Tracking - Add New Goal enter goal name, type, description, start date, end date, unit of measurement, initial value, final value, privacy settings & click save & set reminder
    #345:Added goal must be displayed in goal tracking grid
    # 353:Click on Add Value icon for specific goal in grid to add measured value, date, comments & click on save
    #364:Added task must be displayed under previous tasks tab grid if the due dates are crossed
    #361:Click on Add task - enter task name, description, due ate, reminder type, reminder frequency, time, message, add to calendar, status & click on save
    #367:Click on more info icon in future task / previous task grid for specific task will display details
   #368:Click on edit icon in view future task / previous task grid for specific task will be able to edit & update the that specific task
   #369:Click on delete icon in view future task / previous task grid for specific task will delete the task from grid
   # These tests Case Covered The Scenario NO: S9
  #}
      #}

  @WEB @GOAL_TRACKING @SANITY_PATH
  Scenario Template:S9-Existing Patient Verify Goal Tracking Details and validate Add New Task ,Previous Task Details in Goal Tracking Details

    Given As a Existing user I am on HomePage and I click the Health Tools
    And I click on Goal Tracking & Add Goal Tracking Details kept private are not shared with the provider
      | &GOAL_TRACKING_PREVIOUS_TASK_ENTRIES_DATA& |
    And click on Add Value icon & Add measured value, date, comments & click on save
      | &GOAL_TRACKING_PREVIOUS_TASK_ADD_VALUE_DATA& |
    When click on Add task icon & Add enter Previous task details and click on save
      | &ADD_PREVIOUS_TASK_ENTRIES_DATA& |
    And click on Reminder setting icon & Add enter Previous task details and click on save
      | &ADD_PREVIOUS_TASK_REMINDER_SETTING_DATA& |
    Then I should see all the Added Previous task grid Details must be displayed in more info
      | &ADD_PREVIOUS_TASK_REMINDER_SETTING_DATA& | &ADD_FUTURE_TASK_INFO_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit Previous task records "<Records>"
    And I click on "<Delete Icon>" Add Task delete icon
    And  I click on Delete Icon "<GoalTrackingDeleteIcon>" in the Previous Task goal tracking grid for a specific goal will delete the goal from the grid

    Examples:
      | Edit Icon                                 | Records                    | Delete Icon                    | GoalTrackingDeleteIcon                       |
      | &ADD_PREVIOUS_TASK_REMINDER_SETTING_DATA& | &EDIT_FUTURE_TASK_DETAILS& | &DELETE_PREVIOUS_TASK_DETAILS& | &GOAL_TRACKING_PREVIOUS_TASK_ADD_VALUE_DATA& |


       #Note:{342:Login as Existing patient & view/click on Health Tools
    #344:Click on Goal Tracking - Add New Goal enter goal name, type, description, start date, end date, unit of measurement, initial value, final value, privacy settings & click save & set reminder
    #345:Added goal must be displayed in goal tracking grid
    # 353:Click on Add Value icon for specific goal in grid to add measured value, date, comments & click on save
    #362:Click on Add task - enter task name, description, due ate, reminder type, reminder frequency, time, message, add to calendar, status & click on save & add another task
    #361:Click on Add task - enter task name, description, due ate, reminder type, reminder frequency, time, message, add to calendar, status & click on save
    #367:Click on more info icon in future task / previous task grid for specific task will display details
   #368:Click on edit icon in view future task / previous task grid for specific task will be able to edit & update the that specific task
   #369:Click on delete icon in view future task / previous task grid for specific task will delete the task from grid
   # These tests Case Covered The Scenario NO: S10
  #}
      #}


  @WEB @GOAL_TRACKING @SANITY_PATH
  Scenario Template:S10-Existing Patient Verify Goal Tracking Details and validate Add New Task ,Add Another Task in Goal Tracking Details

    Given As a Existing user I am on HomePage and I click the Health Tools
    And I click on Goal Tracking & Add Goal Tracking Details kept private are not shared with the provider
      | &GOAL_TRACKING_FUTURE_ENTRIES_DATA& |
    And click on Add Value icon & Add measured value, date, comments & click on save
      | &GOAL_TRACKING_FUTURE_ADD_VALUE_DATA& |
    When click on Add task icon & Add enter Previous task details and click on Add another task
      | &ADD_FUTURE_ENTRIES_DATA& |
    And click on Reminder setting icon & Add enter Previous task details and click on save
      | &ADD_FUTURE_REMINDER_SETTING_DATA& |
    Then I should see all the Added Previous task grid Details must be displayed in more info
      | &ADD_FUTURE_REMINDER_SETTING_DATA& | &ADD_FUTURE_TASK_INFO_DATA& |
    And I click on "<Edit Icon>" edit icon & I Edit Previous task records "<Records>"
    And I click on "<Delete Icon>" Add Task delete icon
    And I click on Delete Icon "<GoalTrackingDeleteIcon>" in the Previous Task goal tracking grid for a specific goal will delete the goal from the grid

    Examples:
      | Edit Icon                          | Records                    | Delete Icon             | GoalTrackingDeleteIcon                |
      | &ADD_FUTURE_REMINDER_SETTING_DATA& | &EDIT_FUTURE_TASK_DETAILS& | &DELETE_FUTURE_DETAILS& | &GOAL_TRACKING_FUTURE_ADD_VALUE_DATA& |