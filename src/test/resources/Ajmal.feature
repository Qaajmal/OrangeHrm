@smoketest  @batch24 @regressionTest
Feature: User able to login to Orange HRM site
Scenario: User successfully Login to Orange HRM
Given user to Orange HRM home page
When user type the Username
And user also type Password
Then user click on Login button
And user verify welcome screen 

# Senario For Faild Test 
#Scenario: User unsuccessfully verify welcome 
#Given user to Orange HRM home page
#When user type the Username
#And user also type Password
#And user verify welcome screen 
#Then user click on Login button