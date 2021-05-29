
Feature: User should check the Best seller options

  Background: 

  
    Given User should open the browser
    When User should enter the url

  @sanity
  Scenario: 
    Given User should click Hot new Releases text
    When User should display the books
@regression
  Scenario: 
    Given User should click Movers and Shakers text
    When User should display the book
@sanity @regression
  Scenario: 
    Given User should click Most wished for text
    When User should display the list of books
@sanity
  Scenario: 
    Given User should click mosted gifted text
    When User shounld display the list of books
