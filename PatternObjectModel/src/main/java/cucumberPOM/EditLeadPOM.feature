Feature: Edit an Existing Lead's Company Name 

Scenario Outline: Update the Company Name value of existing lead
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
|Hexa-3|Hexaware-C|