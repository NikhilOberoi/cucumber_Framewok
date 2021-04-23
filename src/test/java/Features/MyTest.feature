#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Functional_Test 
Feature:	 Facebook Login Check Facebook Login

@Amz_Login_Scenario
	Scenario: Amazon Web APP Login
	Given Intialize Driver
	When Navigate to Amazon
	And Signin to Amazon
	Then Validate Title
	And Sign Out from Amazon
	And Close the Browser
	
	@Working_with_Frames
	Scenario: Tools QA - Working with Frames
	Given Intialize Driver
	When Navigate to ToolsQA
#	And Navigate to Frame Section
	And Move to Frame and get text
	Then Close the Browser
	
	@Working_with_Nested_Frames
	Scenario: Tools QA - Working with Nested Frames
	Given Intialize Driver
	When Navigate to ToolsQA Nested Frames
	And Navigate to Nested Frame Section
	
	@working_With_Alerts
	Scenario: Tools QA - Working with Alerts
	Given Intialize Driver
	When Navigate to ToolsQA Alerts
	And Click on Alerts
	
	@Working_With_Elements
	Scenario: Tools QA - Working with Elements
	Given Intialize Driver
	When Open Tools QA Checkbox Screen
#	And Click on Checkbox
#	And Navigate to radio Button
#	And work with Radios
#	And Navigate to Web Tables
#	And Get Table Headder
#	And Navigate to Buttons
#	And Navigate to Upload and Download
#	And Navigate to Window Handles
	And Navigate to Drag and Drop
	And Navigate to Draggable
	And Navigate to Resizable
	
	
	@Working_With_Widgets
	Scenario: Working with Widgets
	Given Intialize Driver
	When Open to accordian in Widget
	And Click all the Accordian
	And Navigate to Autocomplete
	And Working with date and time
	Then Close the Browser
	
	@Auth_Urls
	Scenario: Handling Authentication URLs
	Given Intialize Driver
	When Open Basic Auth URL
	And validate Title
	Then Close the Browser
	
	@window_handles
	Scenario: working with window Handles
	Given Intialize Driver
	When open browse Window URL
	And perform new window Actions
	And Close the Browser
	And perform new window message Actions
#	And Close the Browser
	
	@statusCode
	Scenario: working with status Code
	Given Intialize Driver
	When validate status code
	
  @Login_Scenario @negativeTestCase
  Scenario Outline: Login functionality exists
    Given I have open the browser
    When I Open Facebook Site
	  And Enter Username <username> and Password <password>
    Then Login button Should Exsist
    And Take Screen Shot
    And Close the Browser 
	
Examples:
|username										|password				|
|nikhiloberoi143@gmail.com	|Nikhilob				|
|prnchawla@gmail.com				|AbC@123				|


	@dataTable
	Scenario: this is dataTable Scenario
	
	
