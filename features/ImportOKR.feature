Feature: Import New OKR functionality
This feature verify to import an existing OKR

Background:
Given User is at OKR login page
When User Enter "himanshu.kumar@infoprolearning.com" in Email field
And User Enter "abcd@1234" in Password field
And user click on Sign In Button
Then login should be sucessful
 
 @Regression
Scenario Outline: Check creating New OKR with Single key functionality
Given User is at OKR Home page
When User click on New OKR tab
And User clicks on Import Previous Objective
And User should have last quarter "<Objective>"
And User pick "<Objective>" from last quarter
And User click on add button
Then user should be at create OKR page with previous imported "<Objective>" deatils 
And Click on Save button
Then User should be navigated to home page and "<Objective>" should have been created

Examples:
| Objective |
| Personal Growth |
