package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class ReportsPages extends TestBase {

	public ReportsPages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[contains(text(),'Cash Reports')]")
	WebElement LogoText;

	@FindBy(xpath = "//div[@class='divChild sidebar']//div[1]//ul[1]//li[1]//a[1]")
	WebElement Order;

	@FindBy(xpath = "//div[@class='divChild sidebar']//div[1]//ul[1]//li[2]//a[1]")
	WebElement Trade;

	@FindBy(xpath = "//div[@class='divChild sidebar']//div[1]//ul[1]//li[3]")
	WebElement TurnoverPosition;

	@FindBy(xpath = "//a[contains(text(),'Obligation')]")
	WebElement Obligation;

	@FindBy(xpath = "//div[@class='divChild sidebar']//div[1]//ul[1]//li[5]//a[1]")
	WebElement OrderHistory;

	@FindBy(xpath = "//div[@class='divChild sidebar']//div[1]//ul[1]//li[8]//a[1]")
	WebElement ConractTracker;

	@FindBy(xpath = "//div[@class='divParent']//div[2]//ul[1]//li[1]//a[1]")
	WebElement OrderURR;

	@FindBy(xpath = "//div[@class='divParent']//div[2]//ul[1]//li[2]//a[1]")
	WebElement Position;

	@FindBy(xpath = "//div[2]//ul[1]//li[5]")
	WebElement TradeURR;

	@FindBy(xpath = "//div[2]//ul[1]//li[6]//a[1]")
	WebElement OrderHistoryURR;

	@FindBy(xpath = "//a[contains(text(),'Fund Transfer Report')]")
	WebElement FundTransferReports;

	@FindBy(xpath = "//a[contains(text(),'Withdraw Cash Report')]")
	WebElement WithdrowCashReports;

	@FindBy(xpath = "//h1[contains(text(),'Limit')]")
	WebElement Limit;

	@FindBy(xpath = "//h1[contains(text(),'Ledger')]")
	WebElement Leadger;

	@FindBy(xpath = "//h1[contains(text(),'Demat')]")
	WebElement Demand;

	@FindBy(xpath = "//h1[contains(text(),'Order')]")
	WebElement StockSIP;

	@FindBy(xpath = "//h1[contains(text(),'Option Chain')]")
	WebElement OptionChain;

	public void CheckCashReports() {
		boolean arr[] = new boolean[] { Order.isDisplayed(), Trade.isDisplayed(), TurnoverPosition.isDisplayed(),
				Obligation.isDisplayed(), OrderHistory.isDisplayed() };
		try {
			for (int i = 0; i < arr.length; i++) {
				Assert.assertTrue(arr[i]);
			}
		} catch (Exception e) {
			//collector.addError(e);
		}
	}

	public void CheckFNO_COMM_CURR_Reports() {
		boolean arr[] = new boolean[] { OrderURR.isDisplayed(), TradeURR.isDisplayed(), OrderHistoryURR.isDisplayed(),
				TradeURR.isDisplayed(), ConractTracker.isDisplayed() };
		try {
			for (int i = 0; i < arr.length; i++) {
				Assert.assertTrue(arr[i]);
			}
		} catch (Exception e) {
			//collector.addError(e);
		}
	}

	public void CheckMiddlePanel() {
		boolean arr[] = new boolean[] { Limit.isDisplayed(), Leadger.isDisplayed(), Demand.isDisplayed(),
				Position.isDisplayed(), StockSIP.isDisplayed(), OptionChain.isDisplayed() };
		try {
			for (int i = 0; i < arr.length; i++) {
				Assert.assertTrue(arr[i]);
			}
		} catch (Exception e) {
			//collector.addError(e);
		}
	}
	
	public void UserOnReportsPage(){
		String Title=LogoText.getText();
		Assert.assertEquals(Title, "Cash Reports");
	}

}
