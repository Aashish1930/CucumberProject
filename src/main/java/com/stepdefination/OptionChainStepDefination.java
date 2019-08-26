package com.stepdefination;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.OptionChainPage;

import cucumber.api.java.en.Then;

public class OptionChainStepDefination extends TestBase {

	HomePage homepage;
	OptionChainPage optionchain;

	@Then("^user click on Option chain page$")
	public void user_click_on_Option_chain_page() throws InterruptedException {
		homepage = new HomePage();
		optionchain = homepage.ClickOnOptionChain();
	}

	@Then("^Check user is on OptionChainPage$")
	public void check_user_is_on_OptionChainPage() {
		optionchain.checkTitle();
	}

	@Then("^check all dropdown Button and button OptionChainPage$")
	public void check_all_dropdown_Button_OptionChainPage() {
		optionchain.checkAllDropDownAndButton();
	}

	@Then("^check all heading OptionChainPage$")
	public void check_all_heading_OptionChainPage() {
		optionchain.CheckAllHeading();
	
	}

}
