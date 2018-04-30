Feature: Leads Tab Functionalities

Scenario Outline: Delete Lead Test Case
Given Enter the username as DemoSalesManager
And Enter the Password as crmsfa
When Click on Login Button
And Click on crmsfa
And Click on Leads link
And Click Find Leads Link
And Click on Email field Link
And Enter the Email Address as <eMail>
And Click on Find Leads Button
And Get the First Resultant Lead ID as <LeadID>
And Click on the first Resultant Lead
And Click on Delete Button
And Click on Find Leads Button
And Click Find Leads Link
And Enter the Lead ID as <LeadID>
When Click on Find Leads Button
Then Get the ErrorInformation and Print it
Examples:
|eMail|
|hello@world.com|
