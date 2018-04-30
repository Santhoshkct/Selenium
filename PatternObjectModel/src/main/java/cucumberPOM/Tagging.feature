Feature: Leads Tab Functions
@Smoke @Regression
Scenario Outline: Create a New Lead
Given Enter the username as DemoSalesManager
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

Examples:
|CompanyName|FirstName|LastName|PhoneNumber|Email|
|Hexa-6|UserC|LastC|3453434243|hello@world.com|

@Sanity
Scenario Outline: Edit Lead Scenario
Given Enter the username as DemoSalesManager
And Enter the Password as crmsfa
When Click on Login Button
And Click on crmsfa
And Click on Leads link
And Click Find Leads Link
And Enter the company Name as <oldName>
And Click Find Leads Button
And Click on the first Resultant Lead
And Verify the company name with <oldName>
And Click on Edit Button
And Clear Company Name field
And Enter the new Company name as <newName>
And Click Update Button
Examples:
|oldName|newName|
|Hexa-1|Hexaware-A|
|Hexa-2|Hexaware-B|

@Regression
Scenario Outline: Merge two Leads
Given Enter the username as DemoSalesManager
And Enter the Password as crmsfa
When Click on Login Button
And Click on crmsfa
And Click on Leads link
And Click on Merge Leads link
And Click From Lead Search Button
And Enter the LeadID as <firstLeadID>
And Click on Find Leads Button
And Click First Resultant Lead result
And Click TO Lead Search Button
And Enter the LeadID as <secondLeadID>
And Click on Find Leads Button
And Click First Resultant Lead result
And Click Merge Button
And Click Find Leads Link
And Enter the Lead ID as <firstLeadID>
When Click Find Leads Button
Then Verify Error Information
Examples:
|firstLeadID|secondLeadID|
|10417|10418|
