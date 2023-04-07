@tag
Feature: login

	@tag1
	Scenario: Login with valid credentials
		Given open the browser and enter the valid URL
		When user enters valid username
		And user enters the valid Password
		When user click on login button
		Then user should in homepage of the application