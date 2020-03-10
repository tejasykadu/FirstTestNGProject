package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//PageFactory Object Repository
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement EmailAddress;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath = "(//div[contains(.,'Login')])[5]")
	WebElement LoginButton;
	
	@FindBy(xpath = "//a[contains(.,'Sign Up')]")
	WebElement SignUp;
	
	//initialize
	public LoginPage()
	{
	  PageFactory.initElements(driver, this);
	}
	
	public String validateloginpagetitile() {
		return driver.getTitle();
	}
	
	public HomePage login(String EmailAddress,String Password)
	{
		this.EmailAddress.sendKeys(EmailAddress);
		this.Password.sendKeys(Password);
		LoginButton.click();
		
		return new HomePage();
	}

}
