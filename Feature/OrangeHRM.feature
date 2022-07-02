Feature: Login Orange HRM
  Scenario: logo present in Orange HRM

    Given I launch chrome browser
    When I open Orange hrm home page
    Then I check logo presence
    Then I close the browser