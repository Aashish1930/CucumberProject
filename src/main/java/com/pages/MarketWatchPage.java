package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class MarketWatchPage extends TestBase {

	@FindBy(xpath = "//span[@class='holdSelect']//select[@name='template']")
	WebElement MyWatchList;

	@FindBy(xpath = "//td[3]//span[1]//select[1]")
	WebElement MarketStates;

	@FindBy(xpath = "//td[4]//span[1]//select[1]")
	WebElement MetualFund;

	@FindBy(xpath = "//td[5]//span[1]//select[1]")
	WebElement Filter;

	@FindBy(xpath = "//td[6]//span[1]//select[1]")
	WebElement IndexSector;

	@FindBy(xpath = "//a[@class='orange button1 inpButtonStyle']")
	WebElement TopPicksBasket;

	@FindBy(xpath = "//select[@id='ex']")
	WebElement NSE;

	@FindBy(xpath = "//select[@id='optiontype']")
	WebElement feture;

	@FindBy(xpath = "//input[@id='scrip']")
	WebElement EnterStrikeName;

	@FindBy(xpath = "//input[@id='strike']")
	WebElement StrikePrice;

	@FindBy(xpath = "//table[@class='tools']//input[3]")
	WebElement StrikeButton;

	@FindBy(xpath = "//input[@placeholder='Template Name']")
	WebElement TemplateName;

	@FindBy(xpath = "//td[2]//div[1]//input[2]")
	WebElement TemplateAdd;

	@FindBy(xpath = "//tr[@class='orgbg']//select[@name='template']")
	WebElement DeleteTemplate;

	@FindBy(xpath = "//td[3]//div[1]//input[1]")
	WebElement DeleteTemplateButton;

	@FindBy(xpath = "//body/div[@class='middle-ui']/table/tbody/tr/td[@class='ps2']/div[1]/input[1]")
	WebElement PlaceTrade;

	@FindBy(xpath = "//body/div[@class='middle-ui']/table/tbody/tr/td[@class='ps2']/div[1]/input[2]")
	WebElement DeleteScript;

	@FindBy(xpath = "//body/div[@class='middle-ui']/table/tbody/tr/td[@class='ps2']/div[1]/input[3]")
	WebElement CreateStockSIP;

	@FindBy(xpath = "//body/div[@class='middle-ui']/table/tbody/tr/td[@class='ps2']/div[1]/input[4]")
	WebElement OptionsChain;

	public MarketWatchPage() {
		PageFactory.initElements(driver, this);
	}

	public void checkAllButtonLink() {

		boolean arr[] = new boolean[] { OptionsChain.isEnabled(), CreateStockSIP.isEnabled(), DeleteScript.isEnabled(),
				PlaceTrade.isEnabled(), DeleteTemplateButton.isEnabled(), DeleteTemplate.isEnabled(),
				TemplateAdd.isEnabled(), TemplateName.isEnabled(), StrikeButton.isEnabled(), StrikePrice.isEnabled(),
				EnterStrikeName.isEnabled(), feture.isEnabled(), NSE.isEnabled(), IndexSector.isEnabled(),
				Filter.isEnabled(), MetualFund.isEnabled(), MarketStates.isEnabled(), MyWatchList.isEnabled() };
		try {

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == true) {
					System.out.println("Display");
				} else {
					System.out.println("Not Display");

				}

			}
		} catch (Exception e) {
			collector.addError(e);
		}
	}

	public void ValidateTitle() {
		String Title = driver.getTitle();
		System.out.println("market watch title is" + Title);
	}

}
