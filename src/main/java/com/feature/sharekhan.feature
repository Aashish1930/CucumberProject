@FunctionalTest
Feature: Test sharekhan Application

@SmokeTest @RegressionTest
Scenario:  Validate Home Page
Given user opens browser
Then  user is on Loginpage
Then user login app
Then User is On Homepage
Then User check All Top Panel Link Verify
Then user Check All Left Panel Link Verify

@SmokeTest @RegressionTest
Scenario:  Validate profile Page
Then user click on profile Button
Then user Verify All Link and Button On ProfilePage

@SmokeTest
Scenario:  Validate Trade now Page
Then user Click on Trade Now Button
Then Enter Trading Password
Then check User is on TradeNow Page
Then User Verify All Left Panel Link
Then user Verify New Order Form

Scenario:  Validate ReSearch Page
Then User click on Research Button
Then Research display
Then Verify All Link Display
Then check Today calls watch
Then Validate Stock Idea
Then Check IT and Services

Scenario:  Validate Account Page
Then User Click on Account Button
Then Check All cash Transfer Link
Then Check All Withdraw Cash link
Then  check Allocate Fund Link
Then Check all Fund Transfer Link

@SmokeTest @End2End
Scenario:  Validate ReportsPages
Then UserClick On ReportsPage
Then User Verify ReportsPage Or Not
Then user Check Cash Reports
Then Check FNO COMM CURR Reports
Then Check Middle Panel

Scenario:  Validate MarketWatchPage
Then user Click on MarketWatch Button
Then Check User On MarketWatchPage
Then Check All button MarketWatchPage







