Feature: Import New OKR functionality
This feature verify to import an existing OKR

Background:
Given User is at OKR login page
When User Enter "deepanjali.chaudhary@infoprolearning.com" in Email field
And User Enter "abcd@1234" in Password field
And user click on Sign In Button
Then login should be sucessful
 
 
Scenario Outline: Check creating New OKR with imported from previous OKRs
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




Scenario Outline: Check creating New OKR with importing from Team Manager's OKR
Given User is at OKR Home page
When User click on New OKR tab
And User clicks on Import Team Objective
And User pick objective "<Objective>"  and key "<KeyImported>" from his team manager objective
And User click on add button
Then user enter "<New Key>" results for the objective
And Click on Save button
Then User should be navigated to home page and "<KeyImported>" should have been created

Examples:
| Objective | KeyImported | New Key |
|Testing my first Objective as Manager | Testing my first Key Result 1 as Manager | Added First Objective |


 
Scenario Outline: Check creating New OKR with importing from Other's OKR
Given User is at OKR Home page
When User click on New OKR tab
And User clicks on Import Team Objective
And User pick "<Objective>" and key "<KeyImported>" from "<EmployeeName>" objective
And User click on add button
Then user enter "<New Key>" results for the objective
And Click on Save button
Then User should be navigated to home page and "<KeyImported>" should have been created

Examples:
| EmployeeName | Objective | KeyImported | New Key |
|Anurag | Train Design Team | Provide 2 Trainings on UX in the month of April. | Added First Objective |




