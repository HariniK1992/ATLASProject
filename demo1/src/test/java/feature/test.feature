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
@tag
Feature: ATLAS application testing
 
  @Login
  Scenario: Login with valid credentials
    Given user is on ATLAS application
    When user enters Username and password
    Then Home page will be displayed

  @Overview
  Scenario: Overview option
    Given I need to select the Overview option from the left Menu bar
    Then Validate the GraphNames
    
   @AgentSetup
   Scenario: Agent setup option
   Given I need to select the Agent Setup option from the Left Menu bar
   When Agent Setup screen is displaying
   Then Select the Agent Version
   And Click on Download option
   
   @AgentStatus
   Scenario: Agent status option
   Given I need to select the Agent Status option from the Left Menu bar
   When Agent Status screen is displaying
   Then Verify all the related columns are displaying or not

	@Discover
	Scenario: Discover Option
	Given I need to select the Discover option from the Left Menu bar
	Then Click on any Agent in the Network Topology
	And Verify whether the System Info and Metadata Info is displaying or not
	
	@Plan
   Scenario: Plan option
   Given I need to select the Plan option from the Left Menu bar
   When Plan screen is displaying
   Then Verify All,Apps,MoveGroups are displaying or not
   
   
   
 ## @tag2
  ##Scenario Outline: Title of your scenario outline
    ##Given I want to write a step with <name>
    ##When I check for the <value> in step
    ##Then I verify the <status> in step

    ##Examples: 
      ##| name  | value | status  |
      ##| name1 |     5 | success |
      ##| name2 |     7 | Fail    |
