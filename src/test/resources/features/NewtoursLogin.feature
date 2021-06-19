Feature: Test for login functionality

@valid
Scenario: Login with valid details
Given User is at login page
When User enters valid username
And User enters valid password
And User click submit button
Then Login should be successful 

@invalid
Scenario: Login with invalid details
Given User is at login page
When User enters valid username
And User enters invalid password
And User click submit button
Then Login should not be successful


@data_from_step @invalid
Scenario: Login with invalid username
Given User is at login page
When User enters invalid username "superman"
And User enters valid password "batman"
And User click submit button
Then Login should not be successful


@data_from_step @invalid
Scenario: Login with username and password
Given User is at login page
When User enters "batman" and "12345678"
And User click submit button
Then Login should not be successful with title "Welcome: Mercury Tours"


@data-driven
Scenario Outline: Data driven test for login
Given User is at login page
When User enters username "<username>"
And User enters password "<password>"
And User click submit button
Then Verify login with page title "<title>"

Examples: 

|	username	|	password	|	title	|
| batman		| batman		| Login: Mercury Tours |
| batman		| superman	| Welcome: Mercury Tours |
| superman	| batman		| Welcome: Mercury Tours |







