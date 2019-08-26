package com.pages;

import java.util.List;

import org.joda.time.field.LenientDateTimeField;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class MutualFundPage extends TestBase {

	public MutualFundPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class=\"grey-arrow-list\"]")
	List<WebElement> LeftPanel;

	public void checkAllLeftSideLink() {
		for (int i = 0; i < LeftPanel.size(); i++) {
			System.out.println("LEFT SIDE ALL DATA :" + LeftPanel.get(i).getText());
		
			if (LeftPanel.get(i).isDisplayed() == true) {
			
				System.out.println("Display :-" + LeftPanel.get(i).getText());

				Assert.assertEquals(LeftPanel.get(i).isDisplayed(), true);
				
			}
		}
	}

}
