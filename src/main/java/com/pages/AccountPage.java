package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class AccountPage extends TestBase {

	@FindBy(xpath = "//a[contains(text(),'Bank to Equity')]")
	WebElement Equity;

	@FindBy(xpath = "//a[contains(text(),'Bank to IPO')]")
	WebElement IPO;

	@FindBy(xpath = "//a[contains(text(),'Bank to MF')]")
	WebElement BANK_MF;

	@FindBy(xpath = "//a[contains(text(),'MF to Bank')]")
	WebElement MF_TO_BANK;

	@FindBy(xpath = "//div[@class='divParent']//li[5]")
	WebElement MEFT_RTGS;

	@FindBy(xpath = "//a[contains(text(),\"Standing Instruction for SIP's\")]")
	WebElement STANDING_INSTRACTION_FOR_SIP;

	@FindBy(xpath = "//a[contains(text(),'Equity to Bank')]")
	WebElement EQUITY_TO_BANK;

	@FindBy(xpath = "//a[contains(text(),'Equity to IPO')]")
	WebElement EQUITY_TO_IPO;

	@FindBy(xpath = "//a[contains(text(),'Equity to MF')]")
	WebElement EQUITY_TO_MF;

	@FindBy(xpath = "//input[@name='amount']")
	WebElement moveRS;

	@FindBy(xpath = "//select[@id='frombank']")
	WebElement From;

	@FindBy(xpath = "//select[@id='tobank']")
	WebElement TO;

	@FindBy(xpath = "//td[2]//div[1]//table[1]//tbody[1]//tr[5]//td[1]")
	WebElement Note;

	@FindBy(xpath = "//input[@name='btn']")
	WebElement TransferButton;

	public AccountPage() {

		PageFactory.initElements(driver, this);
	}

	public void checkCashTransferLink(){

		boolean arr[] = new boolean[] { Equity.isDisplayed(), IPO.isDisplayed(), BANK_MF.isDisplayed(),
				MF_TO_BANK.isDisplayed(), MEFT_RTGS.isDisplayed(), STANDING_INSTRACTION_FOR_SIP.isDisplayed()};
		try {
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				Assert.assertTrue(arr[i]);
			}
		} catch (Throwable e) {
			collector.addError(e);
		}
	}

	public void CheckAllocateFundLink() {

		boolean arr[] = new boolean[] { EQUITY_TO_MF.isDisplayed(), EQUITY_TO_IPO.isDisplayed() };
		try {
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				Assert.assertTrue(arr[i]);
			}
		} catch (Throwable e) {
			collector.addError(e);
		}
	}

	public void WithdrawCashLink() {
		boolean flag = EQUITY_TO_BANK.isDisplayed();
		Assert.assertEquals(true, flag);
	}

	public void FundTransferLink() {
		boolean arr[] = new boolean[] { moveRS.isDisplayed(), From.isDisplayed(), TO.isDisplayed(), Note.isDisplayed(),
				Note.isEnabled() };
		try {
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				Assert.assertTrue(arr[i]);
			}
		} catch (Throwable e) {
			collector.addError(e);
		}
	}

}
