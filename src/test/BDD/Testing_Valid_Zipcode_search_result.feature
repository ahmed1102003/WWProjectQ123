Feature: WW find location 

Scenario: Testing valid Zipcode in search result


Given User at Home page

When Confirm the tatile is 'WW (Weight Watchers): Weight Loss & Wellness Help'

When I Click on //*[@id="ela-menu-visitor-desktop-supplementa_find-a-studio"] button by xpath

And I Enter 10011 in the meetingSearch

And I Click on //*[@id="content"]/div/div/ui-view/ui-view/div/div/div/div/div[2]/div[1]/div/form/div[1]/span/button button by xpath
 
And get the location '//*[@id="ml-1180510"]/result-location/div/div[1]/a/location-address/div'
 
And I Click on //*[@id="ml-1180510"]/result-location/div/div[1] button by xpath
 
And Display the opening hours
 
Then Confrim the message will display at '//*[@id="content"]/div/div/ui-view/ui-view/div[1]/div/div/div[1]/div[2]/div[2]/div/location-address/div/div'

