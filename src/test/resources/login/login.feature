@login
Feature: Login Functionality
@login
  Scenario Outline: Successful login into hospice application
    Given gmail app login page is open
    When I enter "<UserName>" and "<password>"
    And click on login button
    Then installation page is opened
    Then dashboard text is displayed
    And click on logout button
  Examples: 
       | UserName | password  |
       | xyz   | 1234|
@login
       
  Scenario Outline: Unsuccessful login into gmail application
  	Given gmail app login page is open
  	When I enter "<UserName>" and "<password>"
  	And click on login button
  	Then warning message is dispalyed
  
  Examples:
  		|UserName| password |
  		|xyz	 |abc		|
  		|qwerty	 |1234|
  		
  		