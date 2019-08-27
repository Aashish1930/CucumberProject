package com.stepdefination;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.NewsPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class NewsStepDefination extends TestBase {

	HomePage homepage;
	NewsPage News;
	
	@Then("^User Click on NewsPage$")
	public void user_Click_on_NewsPage() throws InterruptedException {
		homepage= new HomePage();
		News=homepage.clickOnNews();
	
	}

	@Then("^Check User is onNews page$")
	public void check_User_is_onNews_page()  {
		News.checkUserOnNewspage();
	}

	@Then("^Check All Element Visibility$")
	public void check_All_Element_Visibility()  {
		News.checkAllButtonLink();
	}

}
