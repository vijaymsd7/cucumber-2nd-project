Feature: To validate the login functionality of face book application
Background:
Given To user should be in facebook loginpage



Scenario Outline: To validate the login functionality of with invalid crendtials

When The user has to fill "<username>" and "<password>" 
And    The user has to fillclick login button
Then the user should navigate to the invalid sumbit page

Examples:
|username| |password|
| vijay       | |  8887777 |
