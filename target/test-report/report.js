$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/BDD/Testing_Valid_Zipcode_search_result.feature");
formatter.feature({
  "line": 1,
  "name": "WW find location",
  "description": "",
  "id": "ww-find-location",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Testing valid Zipcode in search result",
  "description": "",
  "id": "ww-find-location;testing-valid-zipcode-in-search-result",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User at Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Confirm the tatile is \u0027WW (Weight Watchers): Weight Loss \u0026 Wellness Help\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I Click on //*[@id\u003d\"ela-menu-visitor-desktop-supplementa_find-a-studio\"] button by xpath",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I Enter 10011 in the meetingSearch",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I Click on //*[@id\u003d\"content\"]/div/div/ui-view/ui-view/div/div/div/div/div[2]/div[1]/div/form/div[1]/span/button button by xpath",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "get the location \u0027//*[@id\u003d\"ml-1180510\"]/result-location/div/div[1]/a/location-address/div\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I Click on //*[@id\u003d\"ml-1180510\"]/result-location/div/div[1] button by xpath",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Display the opening hours",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Confrim the message will display at \u0027//*[@id\u003d\"content\"]/div/div/ui-view/ui-view/div[1]/div/div/div[1]/div[2]/div[2]/div/location-address/div/div\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "JavaCode.user_at_login_page()"
});
formatter.result({
  "duration": 21199717325,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "WW (Weight Watchers): Weight Loss \u0026 Wellness Help",
      "offset": 23
    }
  ],
  "location": "JavaCode.confimr_the_Title(String)"
});
formatter.result({
  "duration": 1041368355,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//*[@id\u003d\"ela-menu-visitor-desktop-supplementa_find-a-studio\"]",
      "offset": 11
    }
  ],
  "location": "JavaCode.I_click_on_xpath_button(String)"
});
formatter.result({
  "duration": 6881653443,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10011",
      "offset": 8
    },
    {
      "val": "meetingSearch",
      "offset": 21
    }
  ],
  "location": "JavaCode.I_enter_username_in_the(String,String)"
});
formatter.result({
  "duration": 4338488938,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//*[@id\u003d\"content\"]/div/div/ui-view/ui-view/div/div/div/div/div[2]/div[1]/div/form/div[1]/span/button",
      "offset": 11
    }
  ],
  "location": "JavaCode.I_click_on_xpath_button(String)"
});
formatter.result({
  "duration": 1460389489,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//*[@id\u003d\"ml-1180510\"]/result-location/div/div[1]/a/location-address/div",
      "offset": 18
    }
  ],
  "location": "JavaCode.get_the_location(String)"
});
formatter.result({
  "duration": 795044008,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//*[@id\u003d\"ml-1180510\"]/result-location/div/div[1]",
      "offset": 11
    }
  ],
  "location": "JavaCode.I_click_on_xpath_button(String)"
});
formatter.result({
  "duration": 1266066517,
  "status": "passed"
});
formatter.match({
  "location": "JavaCode.Display_the_Opening_Hours()"
});
formatter.result({
  "duration": 692799889,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//*[@id\u003d\"content\"]/div/div/ui-view/ui-view/div[1]/div/div/div[1]/div[2]/div[2]/div/location-address/div/div",
      "offset": 37
    }
  ],
  "location": "JavaCode.confirm_Messages(String)"
});
formatter.result({
  "duration": 110721658,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cWW Studio Flatiron\n[0.49 mi.\n]14 W 23RD ST 2ND FL\n...\u003e but was:\u003cWW Studio Flatiron\n[]14 W 23RD ST 2ND FL\n...\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat ww.JavaCode.confirm_Messages(JavaCode.java:189)\n\tat ✽.Then Confrim the message will display at \u0027//*[@id\u003d\"content\"]/div/div/ui-view/ui-view/div[1]/div/div/div[1]/div[2]/div[2]/div/location-address/div/div\u0027(src/test/BDD/Testing_Valid_Zipcode_search_result.feature:22)\n",
  "status": "failed"
});
});