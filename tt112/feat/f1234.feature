
  Feature: registration functinality
  Scenario: User does successful registration
    Given the signup page is opened
    When user enters saiindhu as username
    And user enters indhu as firstname
     And user enters inuuu as lastname
    And user enters passwordinuu as password
   And user enters passwordinuu as confirm password
   And user selects Female as Gender
    And user enters saiindhu.melan@gmail.com as Email
     And user enters "9876543212" as mobile number
    And user enters "09/06/1998" as DOB
    And  user enters down street bangalore as Address
     And user selects What is your favour color? as Security Question
      And user enters white as Answer
      And user clicks on Register button
    Then user will   Finds a testmeapp admin page