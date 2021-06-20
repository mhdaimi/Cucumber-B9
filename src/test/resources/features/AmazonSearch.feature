Feature: Amazon Search

@data-driven
Scenario Outline: Search Product on Amazon
Given User is at amazon home page
When User enters product "<product>"
And User click search button
Then Verify product with page title "<title>"

Examples: 

|	product					|	title	|
| mobiles					| Amazon.in : mobiles |
| laptop					| Amazon.in : laptop |
| washing machine	| Amazon.in : washing machine |
| books						| Amazon.in : books |