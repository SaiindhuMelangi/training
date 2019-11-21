Feature: search functionality
Scenario: proceed to pay without adding to cart
Given login page will open
When user enters lalitha as username and password123 as password and click on login 
And searches the product
And proceed to pay without adding to cart
Then error message is displayed