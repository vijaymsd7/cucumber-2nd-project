Feature: To register the airline singup page 

Scenario Outline: To validate the user date

Given To user should be in Air line page
When the user shuld click the singup button
And  The user has to fill "<firstname>" and "<lastname>" 
Then the user to enter the "<email>" and "<password>"
And    The user has to fillclick login button
And The user read note for password creation

Examples:
|username|    |password|
| vijay  |    | a    |

#Examples:
#|email|    |password|
#| dvkme75@gmail.com |    |    |
#
#
