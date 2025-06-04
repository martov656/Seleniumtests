Feature: Sample Gherkin Scenarios

  Scenario: Demo cucumber test
    Given The user is on the main page of the system
      And Opened login dialog
    When the correct login is entered
      And the corect password is entered
      And user clicks login button
    Then user should be logged in
      And user should see profile information

  Scenario: logging into Coders Lab educational portal
    Given an open browser blank browser page
    When  an url gets entered with value https://coderslab.cz/cz/
    Then the educational IT portal opens
      And close browser

  Scenario: running the first Java prework presentation for the automation tester course
    Given an open browser with automation course https://lms.coderslab.cz/course/ONL_TEA_E_521
    When the chapter 00 Prework gets selected
      And show chapters button is pressed
    Then the prework sections should open
      And close browser

