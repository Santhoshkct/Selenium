Feature: Login for Leaftaps

Scenario Outline: Login for Leaftaps
Given Open Chrome Browser
And Load url
And Set timeout 
And Maximize the window
And Enter the username as <uNAME>
And Enter the Password as <pwd>
When Click on Login Button
Then Login Successful
Examples:
|uName|pwd|
|DemoSalesManager|crmsfa|


