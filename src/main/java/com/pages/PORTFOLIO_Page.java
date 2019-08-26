package com.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class PORTFOLIO_Page extends TestBase {
	@FindBy(xpath = "//*[@class='inpButtonStyle black button1']")
	List<WebElement> ALL_BUTTON;

	public PORTFOLIO_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='middle-ui']//input[1]")
	WebElement SequreButton;

	@FindBy(xpath = "//body//input[2]")
	WebElement AddButton;

	@FindBy(xpath = "//body//input[3]")
	WebElement AddtoWatch;

	@FindBy(xpath = "//body//input[4]")
	WebElement CreateStockSIP;

	@FindBy(xpath = "//body//input[5]")
	WebElement ViewDSARreport;

	@FindBy(xpath = "//*[@id='eqmftype']")
	WebElement EquityDropDown;

	@FindBy(xpath = "//*[@name=\"foliotype\"]")
	List<WebElement> Dropdown;

	public void checkAllLeftSideButton() {
		try {
			for (int i = 0; i < Dropdown.size(); i++) {

				if (Dropdown.get(i).isEnabled() == true) {
					System.out.println("Dropdown is enable");
				} else {
					System.out.println("Dropdown is not enable");

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void CheckAllButton() {
		boolean arr[] = new boolean[] { EquityDropDown.isEnabled(), ViewDSARreport.isEnabled(),
				CreateStockSIP.isEnabled(), AddtoWatch.isEnabled(), SequreButton.isEnabled(), AddButton.isEnabled() };
		try {
			for (int i = 0; i < arr.length; i++) {
				Assert.assertTrue(arr[i]);
			}
		} catch (Exception e) {
		}

	}

	public void checkTitle() {
		String Title = driver.getTitle();
		System.out.println("User On PORTFOLIO Page & Page Title is "+Title);
			}

}
