package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;


public class LoginPage extends TestBase {
	
	
	@FindBy(xpath = "//input[@name='emailLoginId']")
	WebElement username;

	@FindBy(xpath = "//button[@class='blk-lg-button col-sm-12 more-margin']")
	WebElement nextbtn;

	@FindBy(xpath = "//input[@name='br_pwd']")
	WebElement password;

	@FindBy(xpath = "//button[@class='blk-lg-button col-sm-12 ng-binding']")
	WebElement btnlogin;

	
	@FindBy(xpath = "//*[@class='hamburgerMenuIcon']")
	WebElement switchMenu;

	
	@FindBy(xpath = "//a[@class='blk-sm-button']")
	WebElement switchpage;

	
	
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}
	
	
	public String ValidateTitle(){
		return driver.getTitle();
	}
	

public HomePage login(String user,String pass) throws InterruptedException{
		
		username.sendKeys(user);
		nextbtn.click();
		password.sendKeys(pass);
		btnlogin.click();
		Thread.sleep(5000);
		switchMenu.click();
		switchpage.click();
		return new HomePage(); 
		
		}
	
	
	
}
