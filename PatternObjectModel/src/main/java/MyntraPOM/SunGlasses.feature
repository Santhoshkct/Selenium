Feature: TC001_Order A SunGlass

Scenario Outline: Order a Green Color Sunglass and Get all Brand Names
Given Enter the search String <Items> in search option
When Click the Myntra Search Button
And Get the List of Unique Brand Name
And Get the Count of sunglasses with unisex and 40% OFF
And Select Green Catogory
And Select the Second Resultant sunglass
And Store the Product Name 
And Click on Add to Bags Button
And Click on Go to Bags Button
When Verify Product name with Stored Name
Then Print Product Name
And Print Product Price

Examples:
|Items|
|SunGlasses|
|HandBags|
|Coolers|