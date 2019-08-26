package com.stepdefination;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.MutualFundPage;

import cucumber.api.java.en.Then;

public class MutualFundStepDefination extends TestBase {

	

	HomePage homepage;
	MutualFundPage Metual;
	
	@Then("^User Click on MetualFund Page$")
	public void user_Click_on_MetualFund_Page() throws InterruptedException {
		homepage= new HomePage();
		Metual=homepage.clickOnMetualButton();
		
	}

	@Then("^check all left side Link$")
	public void check_all_left_side_Link() throws InterruptedException  {
		Thread.sleep(2000);
		Metual.checkAllLeftSideLink();
	}

}
