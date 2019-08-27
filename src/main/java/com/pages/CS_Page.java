package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class CS_Page extends TestBase {
	public CS_Page(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"dropDown\"]")
	List<WebElement>LeftPanel;
	
	@FindBy(xpath="	//*[@id=\"id1\"]")
	List<WebElement>MiddlePanel;
	
	@FindBy(xpath="//*[@class=\"rMenu\"]")
	List<WebElement>RightPanel;
	
	public void checkLeftLink() {
		try {
			for (int i = 0; i < LeftPanel.size(); i++) {
				if (LeftPanel.get(i).isDisplayed())
				{
					System.out.println(LeftPanel.get(i).getText() +":- isDisplayed");
				} else 
				{
					System.out.println(LeftPanel.get(i).getText() + ":- is Not Displayed");
				}
			}
		} catch (Throwable e) {
			collector.addError(e);
		}

	}
	
	public void checkMiddlePanelLink() {
		try {
			for (int i = 0; i < MiddlePanel.size(); i++) {
				if (MiddlePanel.get(i).isDisplayed())
				{
					System.out.println(MiddlePanel.get(i).getText() +":- isDisplayed");
				} else 
				{
					System.out.println(MiddlePanel.get(i).getText() + ":- is Not Displayed");
				}
			}
		} catch (Throwable e) {
			collector.addError(e);
		}
	}
	
	public void checkRightPanelLink() {
		try {
			for (int i = 0; i < RightPanel.size(); i++) {
				if (RightPanel.get(i).isDisplayed())
				{
					System.out.println(RightPanel.get(i).getText() +":- isDisplayed");
				} else 
				{
					System.out.println(RightPanel.get(i).getText() + ":- is Not Displayed");
				}
			}
		} catch (Throwable e) {
			collector.addError(e);
		}
	}
	
}
