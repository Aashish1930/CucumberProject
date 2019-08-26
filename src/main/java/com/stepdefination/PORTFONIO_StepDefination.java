package com.stepdefination;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.PORTFOLIO_Page;

import cucumber.api.java.en.Then;

public class PORTFONIO_StepDefination extends TestBase {

	HomePage homepage;
	PORTFOLIO_Page PORTFOLIO;

	@Then("^user click on PORTFOLIO page$")
	public void user_click_on_PORTFOLIO_page() throws InterruptedException {
		homepage = new HomePage();
		PORTFOLIO = homepage.cllickOnPORTFOLIO();
	}

	@Then("^check user On PORTFOLIO page$")
	public void check_user_On_PORTFOLIO_page() {
		PORTFOLIO.checkTitle();
		}

	@Then("^check All Button Present in PORTFOLIO page$")
	public void check_All_Button_Present_in_PORTFOLIO_page() throws InterruptedException {
		Thread.sleep(2000);
		PORTFOLIO.checkAllLeftSideButton();
	}

	@Then("^Check All DropDown in PORTFOLIO page$")
	public void check_All_DropDown_in_PORTFOLIO_page() {
		PORTFOLIO.CheckAllButton();
	}

}
