package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class NewsPage extends TestBase {

	public NewsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='scrip']")
	WebElement SearchBox;

	@FindBy(xpath = "//input[@class='inpButtonStyle black button1']")
	WebElement GOButton;

	@FindBy(xpath = "//div[@class='bkListH1']")
	WebElement HeadingSharekhan;

	@FindBy(xpath = "//*[@class=\"grey-arrow-list\"]")
	List<WebElement> AllElement;

	public void checkAllButtonLink() {
		try {
			for (int i = 0; i < AllElement.size(); i++) {
				if (AllElement.get(i).isDisplayed())
				{
					System.out.println(AllElement.get(i).getText() +":- isDisplayed");
				} else 
				{
					System.out.println(AllElement.get(i).getText() + ":- is Not Displayed");
				}
			}
		} catch (Throwable e) {
			collector.addError(e);
		}

	}
	
	public void checkUserOnNewspage(){
		String Heading=HeadingSharekhan.getText();
		System.out.println("News Page Heading is :-"+Heading);
	}

}