Feature: some feature 
Background: 
	Given I am on the registration page 
	
@positive
Scenario: login as end user 
	Given I am on the homepage 
	When I login as a user 
	|Email			|Password	  |
	|hello@hello.com|hellodarkness|
	|bye@hello.com	|teatime	  |
	Then I am on account page 
	
@positive
Scenario: new user registration 
	When I fill the form 
	Then I am registred as new user 
	
@negative 
Scenario: new user registration fail 
	When I leave blank field with * 
	And I do not agree with Privacy Policy 
	Then I am not registred as new user 
	
@negative
Scenario Outline: new user registration fail 
	When I fill the form with <password> password 
	Then I am not registred as new user 
	Examples: 
	|password|
	|short   |
	|long	 |
#Here I found the bug. In the registration form max password length is 20 symbols,
#but it allowed to register using long password with 21 symbol.	
	
#Tasks	
	#background	
	#scenario outline
	#steps which will pass values to java steps
	#tests with data table usage
	#data table + scenario outline