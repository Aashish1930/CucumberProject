package com.stepdefination;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProfilePage;
import com.pages.TradeNowPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomepageSteps extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	ProfilePage profilepage;
	TradeNowPage tradenow;

	@Given("^user opens browser$")
	public void user_opens_browser() throws Exception {
		TestBase.initilization();
	}

	@Then("^user is on Loginpage$")
	public void user_is_on_Loginpage() {
		 loginpage = new LoginPage();
		System.out.println("Title is " + loginpage.ValidateTitle());

	}

	@Then("^user login app$")
	public void enter_username_and_password() throws InterruptedException {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Then("^User is On Homepage$")
	public void homepage_is_displayed() {

		String HomepageTitle = driver.getTitle();
		System.out.println("HomePage Titile is " + HomepageTitle);

	}

	@Then("^User check All Top Panel Link Verify$")
	public void user_check_All_Top_Panel_Link_Verify() {
		homepage.validateAllButton();
	}

	@Then("^user Check All Left Panel Link Verify$")
	public void user_Check_All_LinkDisplay() {
		homepage.CheckLeftSideLink();
	}

	@Then("^user click on profile Button$")
	public void user_click_on_profile_Button() throws InterruptedException {
		homepage = new HomePage();
		profilepage = homepage.ClickOnProfile();

	}

	@Then("^user Verify All Link and Button On ProfilePage$")
	public void user_Verify_All_Link_and_Button_On_ProfilePage() {
		profilepage = new ProfilePage();
		profilepage.VerifyAllLinkOnProfilePage();
	}

	@Then("^Check user properly Logout$")
	public void check_user_properly_Logout() throws Throwable {
		loginpage= new LoginPage();
		loginpage.Logout();
	}


	
	
	
	
}
