Feature: workday login screen validations


  Background: 
    Given I launch the application
@tag1
  Scenario: 
    When i enter valid username "username"
    And i enter valid password "password"
    And i click on sign in button
    Then i should see the alert error message "Unrecognized username or password."

  Scenario: 
    When i enter valid username "username"
    And i enter valid password ""
    And i click on sign in button
    Then i should see inline error message for password "Please type password."

  Scenario: 
    When i enter valid username ""
    And i enter valid password "password"
    And i click on sign in button
    Then i should see inline error message for username "Please type username or email."

  Scenario: 
    When i enter valid username ""
    And i enter valid password ""
    And i click on sign in button
    Then i should see inline error message for username "Please type username or email."
    Then i should see inline error message for password "Please type password."
    Scenario:
    When i enter valid username
       And i enter valid password 
    
