Feature: To check the adactin page login function

  Scenario: To validate the login page with vaild credentials
    Given User should open the login page
    When User should type the valid credentials
    Then User should click login button

  Scenario: To validate the search hotel page
    When User should select the location and hotel
    When User should select the room type and number of rooms
    When User should type adults count and child count
    Then User should click search button
    
    Scenario:  To validate the hotel selection page
    When User should click the Radiobutton for hotel selection
    Then User should click the continuebutton
    
    Scenario: To validate the payment page
    When User should type  first name
    When User should type  last name
    When User should type billing address
    When User should type the cardnumber
    When User should select the cardtype expirydate year and cvv
    Then User should click booknow button