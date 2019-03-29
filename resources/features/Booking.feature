Feature: Test Booking


  Scenario Outline: Test Booking
  
    Given I am on a page with url \"([^\"]*)\"
    
    When I enter city and calendar \"([^\"]*)\" in search field
    And I enter starting date and finish date
    And I check the dates
	And I check that there are any some hotels
	Then I sort out by the rating






I check that there are any some hotels
    Examples: 
      |url                 | 
      |https://www.booking.com|    
      