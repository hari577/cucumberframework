
@tag
Feature: Title of your feature
  I want to use this template for my feature file
  
  Background:
     Given I launch URL
    When I click On register button in opencart page
    And i enter emil
    And 

  @tag1
  Scenario Outline: Title of your scenario
 
    And I enter <username> as username in opencart page
    And I enter <firstname> as firstname in opencart page
    And I check this
    
       Examples: 
      | username  | firstname |
      |    mani|    ffff | 
      | hati   |    hghgh| 
    
   
    

  @tag2
  Scenario: Title of your scenario
  
    And I enter "harajkjasjhas@gmail.com" as username in opencart page
    And I enter "manijhasj" as firstname in opencart page 
    
    
    
    



