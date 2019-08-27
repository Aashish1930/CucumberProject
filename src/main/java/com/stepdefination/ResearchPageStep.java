package com.stepdefination;

import com.base.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ResearchPage;

import cucumber.api.java.en.Then;

public class ResearchPageStep extends TestBase {


	LoginPage loginpage;
	HomePage homepage;
	ResearchPage Research;
	
	

@Then("^User click on Research Button$")
public void user_click_on_Research_Button() throws InterruptedException  {
	homepage=new HomePage();
	Research=homepage.clickOnReaserch();
}

@Then("^Research display$")
public void research_display() throws Throwable {
	Research.ResearchTitile();
}

@Then("^Verify All Link Display$")
public void verify_All_Link_Display() throws InterruptedException  {
	Thread.sleep(2000);
	Research.CheckLeftSideLink();
}

@Then("^check Today calls watch$")
public void check_Today_calls_watch()  {
//	Research.ClickOnTodayCallWatch();
}

@Then("^Validate Stock Idea$")
public void validate_Stock_Idea() throws InterruptedException {
	
	//Research.ClickOnStockIdea();
}

@Then("^Check IT and Services$")
public void check_IT_and_Services()  {
	//Research.ClickOnITServices();
    
}


	
	
	
	
	
	
	
}
