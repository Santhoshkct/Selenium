Feature: Edit an Existing Lead's Company Name 

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
|10373|10375|