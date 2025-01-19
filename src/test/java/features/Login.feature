Feature: Login feature in leaftaps application


@login @Positive @Regression
Scenario: Login scenario with valid credientials

Given Setup the Environment
And Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When click on the login button
Then Verify the login is success


@negative @login
Scenario: Login scenario with invalid credientials

Given Setup the Environment
And Enter the username as 'demo'
And Enter the password as 'crmsfa123'
When click on the login button
Then Verify the login is success
