@amazon

Feature: Amazon account 
Scenario Outline: Create a valid account
Given I am on amazon homepage
When I click on sign in button
And I click on create your amazon account 
And I put my valid "<name>" 
And I put a valid "<email>" 
And I put a valid password as "<password>" 
And I reenter the valid "<repassword>" 
And I click on continue button
Then I land on puzzle page

Examples:
|name      |email                   |password      |repassword      |
|sami      |samiapple@gmail.com			|Sami123			 |Sami123					|
|Apu		   |apugreen@gmail.com			|Apu123				 |Apu123					|
