package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

import junit.framework.Assert;

public class TradeNowPage extends TestBase {
	
	

	@FindBy(xpath = "//a[@id='big-trade-plus1']")
	WebElement BRACKET_ORDER;

	@FindBy(xpath = "//a[@id='big-trade-plus2']")
	WebElement BRACKET_TRADING_ORDER;

	@FindBy(xpath = "//a[contains(text(),'BSE')]")
	WebElement BSE;

	@FindBy(xpath = "//a[@id='big-trade-plus']")
	WebElement BIG_TRADE_PLUS;

	@FindBy(xpath = "//ul[@class='grey-arrow-list']//a[contains(text(),'MCXFO')]")
	WebElement MCXFO;

	@FindBy(xpath = "//div[@class='divParent']//div[2]//ul[1]//li[1]")
	WebElement CREATE_STOCK_SIP;

	@FindBy(xpath = "//a[contains(text(),'Stock SIP Report')]")
	WebElement STOCK_SIP_REPORT;

	@FindBy(xpath = "//a[contains(text(),'CASH BASKET ORDER')]")
	WebElement CASH_BASKET_ORDER;

	@FindBy(xpath = "//a[contains(text(),'Top Picks Basket')]")
	WebElement TOP_PICKS_BASKET;
	// ---------------------------------------------------- ALL NEW ORDER FORM
	// XPATH--------------------------

	@FindBy(xpath = "//select[@id='exchangecode']")
	WebElement Exchange;

	@FindBy(xpath = "//input[@id='scrip']")
	WebElement Scrip;

	@FindBy(xpath = "//select[@id='buysell']")
	WebElement Buy_Sell;

	@FindBy(xpath = "//select[@id='validity']")
	WebElement Validity;

	@FindBy(xpath = "//input[@id='quantity']")
	WebElement quantity;

	@FindBy(xpath = "//input[@name='disclosedorderqty']")
	WebElement Disclosed_Qty;

	@FindBy(xpath = "//td[contains(text(),'Market order')]")
	WebElement Market_order;

	@FindBy(xpath = "//tr[@id='hidetr1']//td[contains(text(),'Limit order')]")
	WebElement Limit_order;

	@FindBy(xpath = "//input[@id='tprice']")
	WebElement tprice;

	@FindBy(xpath = "//input[@id='price']")
	WebElement price;

	@FindBy(xpath = "//select[@id='adv_order_type']")
	WebElement AdvanceOrder;

	@FindBy(xpath = "//select[@name='dpclient']")
	WebElement DP_AC;

	@FindBy(xpath = "//input[@id='placeOrderbutton']")
	WebElement PlaceOrder;

	@FindBy(xpath = "//input[@name='Reset']")
	WebElement Reset;

	@FindBy(xpath = "//div[@class='bkListH1']")
	WebElement NewOrderForm;

	@FindBy(xpath = "//input[@id='tr_pwd']")
	WebElement Tradingpass;

	@FindBy(xpath = "//*[@id=\"subBtn\"]")
	WebElement SubmitButton;

	public TradeNowPage() {
		PageFactory.initElements(driver, this);
	}

	public void TradingPassword() {
		Tradingpass.sendKeys("LALLA@1930");
		SubmitButton.click();
	}

	public void CheckUserOnTradePage() {
		String Text = NewOrderForm.getText();
		try {
			Assert.assertEquals(Text, "New Order Form");
		} catch (Exception e) {
			//collector.addError(e);
			System.out.println(Text + "Not Equal");
		}

	}

	public void Verift_Left_panel_Link() {
				
				boolean Arr[] = new boolean[] {CASH_BASKET_ORDER.isDisplayed(),
				STOCK_SIP_REPORT.isDisplayed(),CREATE_STOCK_SIP.isDisplayed(), MCXFO.isDisplayed(),
				BIG_TRADE_PLUS.isDisplayed(), BSE.isDisplayed(), BRACKET_TRADING_ORDER.isDisplayed(),
				BRACKET_ORDER.isDisplayed() };
			try{
				
				for (int i = 0; i < Arr.length; i++) {
				System.out.println(Arr[i] + "tradenow ");

				Assert.assertTrue(Arr[i]);
			}
		} catch (Exception e) {
			//collector.addError(e);
		}

	}

	

	public void VerifyNewOrderForm() {
		boolean Arr[] = new boolean[] { Reset.isDisplayed(), PlaceOrder.isDisplayed(), DP_AC.isDisplayed(),
				AdvanceOrder.isDisplayed(), price.isDisplayed(), tprice.isDisplayed(),Limit_order.isDisplayed(),
				Market_order.isDisplayed(), Disclosed_Qty.isDisplayed(), quantity.isDisplayed(), Validity.isDisplayed(),
				Buy_Sell.isDisplayed(), Scrip.isDisplayed(), Exchange.isDisplayed() };

	try {
			for (int i = 0; i < Arr.length; i++) {
				Assert.assertEquals(Arr[i], true);
			}
		}catch (Exception e) {
			//collector.addError(e);
		}

	}

}
