package com.stepdefination;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ReportsPages;

import cucumber.api.java.en.Then;

public class ReportsStepDefination extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	ReportsPages Reports;
	
	@Then("^UserClick On ReportsPage$")
	public void userclick_On_ReportsPage() throws InterruptedException {
		homepage= new HomePage();
		Reports= homepage.ClickOnReports();
	}

	@Then("^User Verify ReportsPage Or Not$")
	public void user_Verify_ReportsPage_Or_Not() {
		Reports.UserOnReportsPage();
	}

	@Then("^user Check Cash Reports$")
	public void user_Check_Cash_Reports() {
		Reports.CheckCashReports();
	}

	@Then("^Check FNO COMM CURR Reports$")
	public void check_FNO_COMM_CURR_Reports() {
		Reports.CheckFNO_COMM_CURR_Reports();
	}

	@Then("^Check Middle Panel$")
	public void check_Middle_Panel()  {
		Reports.CheckMiddlePanel();
	}

	
	
}
