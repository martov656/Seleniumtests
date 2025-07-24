Feature: IMDb celebrity search with multiple names

  @multiple
  Scenario: User searches for multiple celebrities on IMDb
    Given the user opens the IMDb homepage
    When the user searches for the following celebrities:
      | name               |
      | Sandra Bullock     |
      | Scarlett Johansson |
      | Tom Cruise         |
      | Brad Pitt          |
    Then the browser is closed

  @scarlett
  Scenario: User searches for Scarlett Johansson
    Given the user opens the IMDb homepage
    When the user enters "Scarlett Johansson" into the search field and presses Enter
    Then the user should see a link to "Scarlett Johansson"
    And the page should contain "Scarlett Johansson"
    And the browser is closed
