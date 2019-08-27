package com.stepdefination;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.IPO_BOND_Page;
import com.pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

public class IOP_BOND_StepDefination extends TestBase {

	HomePage homepage;
	IPO_BOND_Page IOPBOND;



	@Then("^user click on BondPage$")
	public void user_click_on_BondPage() throws InterruptedException {
		homepage = new HomePage();
		IOPBOND = homepage.ClickONIPO_BOND_Page();

	}

	@Then("^Check User On BOND page$")
	public void check_User_On_BOND_page() {
		IOPBOND.CheckTitle();
	}

	@Then("^User Check All Top Link$")
	public void user_Check_All_Top_Link() {
		IOPBOND.Check_All_TopLink();
	}

	@Then("^User Check APPLY IPO Link$")
	public void user_Check_APPLY_IPO_Link() {
		IOPBOND.Check_All_Apply_IOP_Link();
	}

}
