Feature: Create New OKR functionality
This feature verify to creat a new OKR

Background:
Given User is at OKR login page
When User Enter "himanshu.kumar@infoprolearning.com" in Email field
And User Enter "abcd@1234" in Password field
And user click on Sign In Button
Then login should be sucessful
 
Scenario Outline: Check creating New OKR with Single key functionality
Given User is at OKR Home page
When User click on New OKR tab
Then User should be at create new okr page
And User clicks on Create New Objective
And User enter "<Objective>" in Objective field
And User enter "<ObjectiveShortDeec>" in type of short description for objective field
And User select "<ObjectiveType>" in type of objective field
And user select "<AlignManager>" in align manager field
And user add "<key>" in key field
And Click on Save button
Then User should be navigated to home page and "<Objective>" should have been created

Examples:
| Objective | ObjectiveShortDeec | ObjectiveType | AlignManager | key |
| Automation Framework Implementation | Testing | Aspirational OKR | Himanshu Kumar | POC Complete |


Scenario Outline: Check creating New OKR with Multiple key functionality
Given User is at OKR Home page
When User click on New OKR tab
Then User should be at create new okr page
And User clicks on Create New Objective
And User enter "<Objective>" in Objective field
And User enter "<ObjectiveShortDeec>" in type of short description for objective field
And User select "<ObjectiveType>" in type of objective field
And user select "<AlignManager>" in align manager field
And user add following in key field
|keys|
|Testing1|
|Testing2|
|Testing3|
And Click on Save button
Then User should be navigated to home page and "<Objective>" with multiple keys should have been created
Examples:
| Objective | ObjectiveShortDeec | ObjectiveType | AlignManager |
| Automation Framework Implementation | Testing | Aspirational OKR | Himanshu Kumar |


Scenario Outline: Check creating New OKR with Multiple Objective functionality
Given User is at OKR Home page
When User click on New OKR tab
Then User should be at create new okr page
And User clicks on Create New Objective
And User enter "<Objective>" in Objective field
And User enter "<ObjectiveShortDeec>" in type of short description for objective field
And User select "<ObjectiveType>" in type of objective field
And user select "<AlignManager>" in align manager field
And user add "<key>" in key field
And Click on Save And Add New button
And User should be able to add another Objective
Then User should be navigated to home page and objective should have been created
Examples:
| Objective | ObjectiveShortDeec | ObjectiveType | AlignManager | key |
| Automation Framework Implementation | Testing | Aspirational OKR | Himanshu Kumar | POC Complete |


Scenario Outline: Check deleting OKR functionaliuty
Given User is at OKR Home page
When user click on "<Objective>" edit button
Then User should be able to navigate to edit OKR page
And user delete objective
Then "<Objective>" should not be visible at home page
Examples:
| Objective |
| Personal Growth |


 @Regression
Scenario Outline: Check functionality of viewing and commenting team member's OKRs
Given User is at OKR Home page
When User click on Team Managment tab
And User search for Other Employee "<EmployeeName>"
And User click on view icon and go ahead
Then User should be able to view  "<EmployeeName>" Objectives
And User click on Comment button on "<Objective>"
Then User should be able to comment on key result

Examples:
| EmployeeName | Objective |
|Anurag | TEST kr |


