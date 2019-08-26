package com.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class OptionChainPage extends TestBase {

	@FindBy(xpath = "//div[contains(text(),'Option Chain')]")
	WebElement TitleCheck;

	@FindBy(xpath = "//select[@name='exchangecode']")
	WebElement NSEFO_DropDown;

	@FindBy(xpath = "//select[@name='scrip']")
	WebElement NIFTY_DropDown;

	@FindBy(xpath = "//select[@name='expiry']")
	WebElement Date_Dropdown;

	@FindBy(xpath = "//select[@name='range']")
	WebElement Filter_Drop_Down;

	@FindBy(xpath = "//body//select[5]")
	WebElement Sigma_DropDown;

	@FindBy(xpath = "//tr[1]//td[1]//input[1]")
	WebElement PlaceTradeButton;

	@FindBy(xpath = "//td[@class='ps2']//td[1]//input[2]")
	WebElement AddWatchList;

	@FindBy(xpath = "//*[@class=\"orgbg1\"]")
	List<WebElement> Heading;

	public OptionChainPage() {
		PageFactory.initElements(driver, this);
	}

	public void checkAllDropDownAndButton() {
		boolean arr[] = new boolean[] { Sigma_DropDown.isEnabled(), PlaceTradeButton.isEnabled(),
				AddWatchList.isEnabled(), Filter_Drop_Down.isEnabled(), Date_Dropdown.isEnabled(),
				NIFTY_DropDown.isEnabled(), NSEFO_DropDown.isEnabled() };
		try {
			for (int i = 0; i < arr.length; i++) {
				Assert.assertTrue(arr[i]);
			}
		} catch (Exception e) {
		}

	}

	public void CheckAllHeading() {
		for (int i = 0; i < Heading.size(); i++) {
			if (Heading.get(i).isEnabled()) {
				System.out.println("Heading is Display" + Heading.get(i).getText());
			} else {
				System.out.println("Heading not display");
			}
		}

	}

	public void checkTitle() {

		String Title = TitleCheck.getText();
		System.out.println("OptionChainPage Title is " + Title);
		Assert.assertEquals("Option Chain", Title);

	}
}
