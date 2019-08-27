@FunctionalTest
Feature: Test sharekhan Application

@SmokeTest @RegressionTest
Scenario:  Validate PORTFOLIO Page
Then user click on PORTFOLIO page
Then check user On PORTFOLIO page
Then check All Button Present in PORTFOLIO page
Then Check All DropDown in PORTFOLIO page

@RegressionTest
Scenario: Validate Option Chain Page
Then user click on Option chain page
Then Check user is on OptionChainPage 
Then check all dropdown Button and button OptionChainPage
Then check all heading OptionChainPage

@RegressionTest
Scenario: Validate News Page
Then User Click on NewsPage
Then Check User is onNews page
Then Check All Element Visibility

@End2End
Scenario: Validate CS Page
Then user click on CS Page
Then User CheckAllLeftPannel link
Then User check MiddlePanelLink
Then User check RightPanel Link

@End2End
Scenario: Validate Transfering Fund
Then User click on AccountButton
Then User Enter SomeAmout To beTransfered
Then User Salect Segment FROM and TO
Then user Salect Payment Mode By Online
Then User Click OnTraseferButton

@End2End
Scenario: Logout Sharekhan Account
Then Check user properly Logout

Scenario:  Validate MetualFund Page
Then User Click on MetualFund Page
Then check all left side Link

Scenario:  Validate IPO_BOND Page
Then user click on BondPage 
Then Check User On BOND page
Then User Check All Top Link
Then User Check APPLY IPO Link

