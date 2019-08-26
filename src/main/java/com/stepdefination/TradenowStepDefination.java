package com.stepdefination;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.TradeNowPage;

import cucumber.api.java.en.Then;

public class TradenowStepDefination extends TestBase{
	HomePage homepage;
	TradeNowPage tradenow;
	
	
	// -------------------------------------------Trade now Page Test-------------------------------------------------------------------------------
	

	@Then("^user Click on Trade Now Button$")
	public void user_Click_on_Trade_Now_Button() throws InterruptedException  {
		homepage = new HomePage();
		tradenow=homepage.ClickOnTradeNow();
	}

	@Then("^Enter Trading Password$")
	public void enter_Trading_Password()  {
	  tradenow.TradingPassword();
	}


	@Then("^check User is on TradeNow Page$")
	public void check_User_is_on_TradeNow_Page() {
	   tradenow.CheckUserOnTradePage();
	}

	@Then("^User Verify All Left Panel Link$")
	public void user_Verify_All_Left_Panel_Link() throws InterruptedException  {
		Thread.sleep(2000);
	 tradenow.Verift_Left_panel_Link();
	}

	@Then("^user Verify New Order Form$")
	public void user_Verify_New_Order_Form() throws InterruptedException  {
		Thread.sleep(2000);
	 tradenow.VerifyNewOrderForm();
	}



}
