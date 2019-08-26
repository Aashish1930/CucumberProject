package com.stepdefination;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.MarketWatchPage;

import cucumber.api.java.en.Then;

public class MarketWatchStepDefination {

	HomePage homepage;
	MarketWatchPage MarketWatch;

	@Then("^user Click on MarketWatch Button$")
	public void user_Click_on_MarketWatch_Button() throws InterruptedException {
		homepage= new HomePage();
		MarketWatch = homepage.ClickOnMarketWatch();
	}

	@Then("^Check User On MarketWatchPage$")
	public void check_User_On_MarketWatchPage() {
		MarketWatch.ValidateTitle();
	}

	@Then("^Check All button MarketWatchPage$")
	public void check_All_button_MarketWatchPage() {

		MarketWatch.checkAllButtonLink();
	}

}
