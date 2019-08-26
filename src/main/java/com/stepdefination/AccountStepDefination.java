package com.stepdefination;

import com.base.TestBase;
import com.pages.AccountPage;
import com.pages.HomePage;
import com.pages.LoginPage;

import cucumber.api.java.en.Then;

public class AccountStepDefination extends TestBase {

	HomePage homepage;
	AccountPage Account;

	@Then("^User Click on Account Button$")
	public void user_Click_on_Account_Button() throws InterruptedException {
		homepage = new HomePage();
		Account = homepage.clickOnAccount();

	}

	@Then("^Check All cash Transfer Link$")
	public void check_All_cash_Transfer_Link() throws InterruptedException {
		Thread.sleep(2000);
		Account.checkCashTransferLink();
	}

	@Then("^Check All Withdraw Cash link$")
	public void check_All_Withdraw_Cash_link() throws InterruptedException {
		Thread.sleep(2000);
		Account.WithdrawCashLink();
	}

	@Then("^check Allocate Fund Link$")
	public void check_Allocate_Fund_Link() throws InterruptedException {
		Thread.sleep(2000);
		Account.CheckAllocateFundLink();
	}

	@Then("^Check all Fund Transfer Link$")
	public void check_all_Fund_Transfer_Link() throws InterruptedException {
		Thread.sleep(2000);
		Account.FundTransferLink();
	}

}
