Feature: CreateLead feature in leaftaps application

Background: 
#Given Setup the Environment

@Positive @Regression @CreatrLead
Scenario: CreateLead scenario with valid credientials


Given Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When click on the login button
Then Verify the login is success
When Click on the crmsfa link
And click leads tab
And click create lead link
Given enter the company name as 'TestLeaf'
And enter the first name as 'Jayaprakash'
And enter the last name as 'Devaraj'
And enter the phone number as '99'
When click submit button
Then verify the lead ID 


@MultiCreateLead
Scenario Outline: CreateLead scenario with valid credientials

Given Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When click on the login button
Then Verify the login is success
When Click on the crmsfa link
And click leads tab
And click create lead link
Given enter the company name as <cname>
And enter the first name as <fname>
And enter the last name as <lname>
And enter the phone number as <phno>
When click submit button
Then verify the lead ID 

Examples: 
|fname|lname|cname|phno|
|'Ram'|'kumar'|'TCS'|'91'|
|'Rahul'|'kannan'|'CTS'|'92'|
|'Selva'|'Raj'|'EY'|'93'|