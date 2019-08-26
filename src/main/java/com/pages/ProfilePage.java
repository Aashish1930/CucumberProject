package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

import junit.framework.Assert;

public class ProfilePage extends TestBase {

	@FindBy(xpath = "	//a[contains(text(),'View Profile')]	")
	WebElement ViewProfile;

	@FindBy(xpath = "//a[contains(text(),'Edit Profile')]")
	WebElement EditProfile;

	@FindBy(xpath = "//a[contains(text(),'Membership Password')]")
	WebElement MembershipPassword;

	@FindBy(xpath = "//a[contains(text(),'Trading Password')]")
	WebElement TradingPassword;

	@FindBy(xpath = "//a[contains(text(),'?')]")
	WebElement ForgatePassword;

	@FindBy(xpath = "//div[@class='profile-box rd']//input[@id='emob']")
	WebElement ExistingMobile;

	public ProfilePage() {

		PageFactory.initElements(driver, this);
	}

	public void VerifyAllLinkOnProfilePage() {

		boolean b1[] = new boolean[] { ViewProfile.isDisplayed(), EditProfile.isDisplayed(),
				MembershipPassword.isDisplayed(), TradingPassword.isDisplayed(), ForgatePassword.isDisplayed(),
				ExistingMobile.isDisplayed() };
		try {
			for (int i = 0; i < b1.length; i++) {
				Assert.assertEquals(b1[i], true);
			}
			driver.navigate().back();
		} catch (Exception e) {
			//collector.addError(e);
		}


	}

}
