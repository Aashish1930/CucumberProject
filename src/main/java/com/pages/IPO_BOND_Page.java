package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

import junit.framework.Assert;

public class IPO_BOND_Page extends TestBase {

	@FindBy(xpath = "//body//div[@id='mainwrapper']//tr//tr[1]//td[1]")
	WebElement FundTransferLink;

	@FindBy(xpath = "//td[2]//a[1]//img[1]")
	WebElement AllocateFunds;

	@FindBy(xpath = "//div[@id='mainwrapper']//td[3]//img[1]")
	WebElement OrderReports;

	@FindBy(xpath = "//div[@id='mainwrapper']//td[4]//img[1]")
	WebElement AcountBook;

	@FindBy(xpath = "//td[5]//img[1]")
	WebElement YourProfile;

	@FindBy(xpath = "//span[contains(text(),'Click to Apply Book Bulding IPO')]")
	WebElement Apply_Book_Building_IPO;

	@FindBy(xpath = "//body/div[@class='middle-ui']/table/tbody/tr/td/div[@id='mainwrapper']/div[@id='content-postlogin']/div[@class='right-post']/div[@class='amplitude clearfix']/div/div[@id='list1b']/h5[2]/span[1]")
	WebElement Fixed_IPO;

	@FindBy(xpath = "//span[contains(text(),'Bonds')]")
	WebElement Bonds;

	@FindBy(xpath = "//span[contains(text(),\"ETF'S\")]")
	WebElement ETF;

	@FindBy(xpath = "//span[contains(text(),'OFS')]")
	WebElement OFS;

	@FindBy(xpath = "//span[contains(text(),\"NCD'S\")]")
	WebElement NCD;
	
	@FindBy(xpath="//div[@class='top-navrol']//table//tbody//tr//td//div//div//div[contains(text(),'APPLY IPO')]")
	WebElement TitleText;

	public IPO_BOND_Page() {
		PageFactory.initElements(driver, this);
	}
	
	public void CheckTitle(){
		String Title=TitleText.getText();
		Assert.assertEquals("APPLY IPO", Title);
	}

	public void Check_All_TopLink(){
		boolean arr[] = new boolean[] { NCD.isDisplayed(), OFS.isDisplayed(), ETF.isDisplayed(),
				Bonds.isDisplayed(), Fixed_IPO.isDisplayed(), Apply_Book_Building_IPO.isDisplayed(),
				YourProfile.isDisplayed(),AcountBook.isDisplayed(),OrderReports.isDisplayed(),
				AllocateFunds.isDisplayed(),FundTransferLink.isDisplayed()};
		try {
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				Assert.assertTrue(arr[i]);
			}
		} catch (Exception e) {
			//collector.addError(e);
		}
	}
	
	public void Check_All_Apply_IOP_Link(){
		boolean arr[] = new boolean[] { NCD.isDisplayed(), OFS.isDisplayed(), ETF.isDisplayed(),
				Bonds.isDisplayed(), Fixed_IPO.isDisplayed(), Apply_Book_Building_IPO.isDisplayed()};
		try {
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				Assert.assertTrue(arr[i]);
			}
		} catch (Exception e) {
			//collector.addError(e);
		}
	}
	
	
}
