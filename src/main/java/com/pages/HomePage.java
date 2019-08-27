package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

import cucumber.deps.com.thoughtworks.xstream.io.binary.Token.Value;

public class HomePage extends TestBase {

	@FindBy(xpath = "//a[@class='whitelink'][contains(text(),'HOME')]")
	WebElement Home;

	@FindBy(xpath = "//a[contains(text(),'ACCOUNTS')]")
	WebElement ACCOUNTS;
	
	@FindBy(xpath = "//a[contains(text(),'NEWS')]")
	WebElement News;
	
	@FindBy(xpath="//a[contains(text(),'PORTFOLIO')]")
	WebElement PORTFOLIO;

	@FindBy(xpath = "//a[contains(text(),'PROFILE')]")
	WebElement PROFILE;
	
	@FindBy(xpath="//a[contains(text(),'MARKET WATCH')]")
	WebElement MarketWatch;
	

	@FindBy(xpath = "//a[contains(text(),'TRADE NOW')]")
	WebElement TRADENOW;

	@FindBy(xpath = "//a[contains(text(),'REPORTS')]")
	WebElement REPORTS;

	@FindBy(xpath = "//a[contains(text(),'CS')]")
	WebElement ContactUs;

	@FindBy(xpath = "//a[contains(text(),'IPO/BONDS')]")
	WebElement IOPBOND;
	
	@FindBy(xpath = "//a[contains(text(),'MUTUAL FUND')]")
	WebElement MetualFund;
	// ---------------------------------------------------------------ALL LEFT
	// SIDE LINK ON SHAREKHAN
	// PAGE------------------------------------------------

	@FindBy(xpath = "//a[contains(text(),'RESEARCH')]")
	WebElement Research;

	@FindBy(xpath = "//a[contains(text(),'DEMAT')]")
	WebElement Dmart;

	@FindBy(xpath = "//a[contains(text(),'MOVE FUNDS')]")
	WebElement MoveFund;

	@FindBy(xpath = "//a[contains(text(),'TOP PICK BASKET')]")
	WebElement TopPickBasket;

	@FindBy(xpath = "//a[contains(text(),'STOCK SIP')]")
	WebElement StockSIP;

	@FindBy(xpath = "//a[contains(text(),'MUTUAL FUND SIP')]")
	WebElement MutualFundSIP;

	@FindBy(xpath = "//a[contains(text(),'Sharekhan Classroom')]")
	WebElement SharekhanClassroom;
	
	@FindBy(xpath="//a[contains(text(),'OPTION CHAIN')]")
	WebElement OptionChain;

	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	public void validateAllButton() {

		boolean arr[] = new boolean[] { Home.isDisplayed(), PROFILE.isDisplayed(), ACCOUNTS.isDisplayed(),
				TRADENOW.isDisplayed(), REPORTS.isDisplayed(), ContactUs.isDisplayed() };
		try {
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				Assert.assertTrue(arr[i]);
			}
		}
		catch (Exception e) {
			//collector.addError(e);
		}
	}

	public void CheckLeftSideLink() {
		boolean arr[] = new boolean[] { Research.isDisplayed(), Dmart.isDisplayed(), MoveFund.isDisplayed(),
				TopPickBasket.isDisplayed(), StockSIP.isDisplayed(), MutualFundSIP.isDisplayed(),
				SharekhanClassroom.isDisplayed() };
		try {
			for (int i = 0; i < arr.length; i++) {
					Assert.assertTrue(arr[i]);
			}
		}  catch (Exception e) {
			//collector.addError(e);
		}

	}
	
	public ProfilePage ClickOnProfile() throws InterruptedException{
		
		PROFILE.click();
		Thread.sleep(5000);
		return new ProfilePage();
		}
	
	public TradeNowPage ClickOnTradeNow() throws InterruptedException{
		TRADENOW.click();
		Thread.sleep(5000);
		return new TradeNowPage();
		}
	
	public  ResearchPage clickOnReaserch() throws InterruptedException{
		Research.click();
	Thread.sleep(5000);
		return new ResearchPage();
	}

	public  AccountPage clickOnAccount() throws InterruptedException{
		ACCOUNTS.click();
		Thread.sleep(5000);

		return new AccountPage();
	}
	public ReportsPages ClickOnReports() throws InterruptedException{
		REPORTS.click();
		Thread.sleep(5000);

		return new ReportsPages();
	}
	
	public MarketWatchPage ClickOnMarketWatch() throws InterruptedException{
		MarketWatch.click();
		Thread.sleep(5000);

		return new MarketWatchPage();
		}
	public IPO_BOND_Page ClickONIPO_BOND_Page() throws InterruptedException{
		IOPBOND.click();
		Thread.sleep(5000);

		return new IPO_BOND_Page();
		
	}
	public MutualFundPage clickOnMetualButton() throws InterruptedException{
		
		MetualFund.click();
		Thread.sleep(5000);
		return new MutualFundPage();
		
	}
	public PORTFOLIO_Page cllickOnPORTFOLIO() throws InterruptedException{
		//Thread.sleep(2000);
		PORTFOLIO.click();
		Thread.sleep(5000);
		return new PORTFOLIO_Page();
		
	}
	public OptionChainPage ClickOnOptionChain() throws InterruptedException{
		//Thread.sleep(5000);
		OptionChain.click();
		Thread.sleep(5000);
		return new OptionChainPage();
		
	}
	public NewsPage clickOnNews() throws InterruptedException{
		News.click();
		Thread.sleep(5000);
		return new NewsPage();
		
	}
	public CS_Page clickOnCS() throws InterruptedException{
		ContactUs.click();
		Thread.sleep(5000);
		return new CS_Page();
		
	}
	
}
