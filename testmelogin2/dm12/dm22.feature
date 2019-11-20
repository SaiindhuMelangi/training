Feature: login Features

 Scenario Outline: user enters username and password
    Given login page is opened
    When user click on login
    And user enters "<username>" and "<password>"
    Then user will be able to open testme homepage
    
    Examples:
    |username  |password     |
    |lalitha   |password123  |
    |Admin     |password456  |
