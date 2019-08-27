package com.stepdefination;

import com.base.TestBase;
import com.pages.CS_Page;
import com.pages.HomePage;

import cucumber.api.java.en.Then;

public class CS_StepDefination extends TestBase {

	HomePage homepage;
	CS_Page cs;

	@Then("^user click on CS Page$")
	public void user_click_on_CS_Page() throws InterruptedException {
		homepage = new HomePage();
		cs = homepage.clickOnCS();

	}

	@Then("^User CheckAllLeftPannel link$")
	public void user_CheckAllLeftPannel_link() {
		cs.checkLeftLink();
	}

	@Then("^User check MiddlePanelLink$")
	public void user_check_MiddlePanelLink() {
		cs.checkMiddlePanelLink();

	}

	@Then("^User check RightPanel Link$")
	public void user_check_RightPanel_Link() {
		cs.checkRightPanelLink();

	}

}
