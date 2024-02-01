Feature: Verification of currency on different get method

  Scenario Outline: Verify currency
    When User sends a Get request to list end point with currency as a "<currency>"
    Then I verify the Currency as a "<currency>"
    Examples:
      |  currency |
      | GBP      |
      | EUR      |
      | SEK      |