Feature: login process
Scenario Outline: login with multiple data
Given login page is opened
When user enters correct "<username>" and "<password>"
Then the home page is opened
Examples:
 |username                | password     |
 |lalitha                 | password123  |
 |admin                   | password456  |