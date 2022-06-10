Feature: MMH Demo

  @WEB @Mobile
  Scenario Template: S1- User Successfully logs in to the MMH v2 Portal.

    Given As a user I am on MMH login Page
    And I enter "<Email Address>" and "<Password>"
    When I click login button
    Then I should see user successfully logs in to the MMH portal

    Examples:
      | Email Address | Password   |
      | &EMAIL&       | &PASSWORD& |

  @WEB @Mobile
  Scenario: S2- Verify Patient can view all the future date booked appointments in future appointment page.

    Given As a user I am on HomePage
    When I navigate to the Future Appointments page
    Then I should see all the future date booked appointments in future appointment page
    And I switch to card view to see future appointments in card view
    And I switch to grid view to see future appointments in grid view



