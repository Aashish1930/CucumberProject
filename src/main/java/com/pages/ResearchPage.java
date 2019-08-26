package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class ResearchPage extends TestBase {

	@FindBy(xpath="//a[contains(text(),\"Today's Call Watch\")]")
	WebElement TodayCallWatch;
	
	@FindBy(xpath="//h2[contains(text(),'Sharekhan Research')]")
	WebElement TitleResearch ;
	
	@FindBy(xpath="//a[contains(text(),'STOCK IDEA [84]')]")
	WebElement StockIdea ;
	
	@FindBy(xpath="//a[@class='active']")
	WebElement ITServices ;
		
	
	public ResearchPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void CheckLeftSideLink() {
		boolean arr[] = new boolean[] { ITServices.isDisplayed(), StockIdea.isDisplayed(), TitleResearch.isDisplayed(),
				TodayCallWatch.isDisplayed()};
		try {
			for (int i = 0; i < arr.length; i++) {
				Thread.sleep(2000);
					Assert.assertTrue(arr[i]);
			}
		} catch (Exception e) {
			collector.addError(e);
		}

	}
	public void ResearchTitile(){
		String str=TitleResearch.getText();
	
			Assert.assertEquals(str, "Sharekhan Research");		
			System.out.println("TitleResearch"+TitleResearch);
			}
	
	public void ClickOnITServices(){
		ITServices.click();
	}
	public void ClickOnStockIdea(){
		StockIdea.click();
	}
	public void ClickOnTodayCallWatch(){
		TodayCallWatch.click();
	}
	
	
	
}
