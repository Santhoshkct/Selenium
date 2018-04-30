Feature: Create a New Lead with all Mandatory fields

Scenario Outline: Create a New Lead
Given Login Successful 
And Enter the username as DemoSalesManager
And Enter the Password as crmsfa
When Click on Login Button
And Click on crmsfa
And Click on Leads link
And Click on Create Lead link
And Enter Company name as <CompanyName>
And Enter First Name as <FirstName>
And Enter Last Name as <LastName>
And Enter PhoneNumber as <PhoneNumber>
And Enter Email as <Email>
When click on create Lead Button
Then New Lead is created
Examples:
|CompanyName|FirstName|LastName|PhoneNumber|Email|
|Hexa-1|UserA|LastB|8903423595|santhosh@gmail.com|
|Hexa-2|UserB|LastB|3423434243|hello@world.com|
|Hexa-3|UserC|LastC|3453434243|hello@world.com|