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

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement Logout;
	
	@FindBy(xpath = "	//*[@id=\"mainHeader\"]/div/div[2]/div[2]/div/ul/li[1]/a[1]")
	WebElement Login;
	
	
	
	
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

public void Logout(){
	try {

		Logout.click();
		if(Login.getText()=="Login/Trade Now"){
			System.out.println("Logout success");
			
		}
	} catch (Exception e) {
		System.out.println("Logout-Fail");
		
	}
}
	
	
	
}
