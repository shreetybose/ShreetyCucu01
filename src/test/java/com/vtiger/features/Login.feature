Feature: Valid all functionality on login page

#Background: User should be on login page


@Sanity,@Regression
Scenario: Valid Login
Given User should be on login page
When User enters valid user id and password
Then User should be login successfully
And Logout link should be visible 
And close application

@Regression
Scenario Outline: InValid Login
Given User should be on login page
When User enters invalid "<userid>" and "<pwd>"
Then User should be on login page with error msg.
And message should be "<Message>"
And close application
Examples: 
|userid|pwd   |Message |
|admin1 |admin1 |You must specify a valid username and password.|
|admin2 |admin2 |You must specify a valid username and password.|
|admin3 |admin3 |You must specify a valid username and password.|

@Sanity
Scenario: Verify tittle
Given User should be on login page
Then tittle should be matched
And close application

@Smoke
Scenario: Verify logo
Given User should be on login page
Then logo should be displayed
And close application

@Sanity
Scenario: Valid Login with fixed data
Given User should be on login page
When User enters valid "<Userid>" and "<Pwd>"
|Userid|Pwd   |
|admin |admin |
Then User should be login successfully
And Logout link should be visible 
And close application


