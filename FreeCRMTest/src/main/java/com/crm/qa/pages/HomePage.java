package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//span[contains(@class,'user-display')]")
	WebElement UserDisplay;
	
	@FindBy(xpath = "//span[@class='item-text'][contains(.,'Contacts')]")
	WebElement ContactsLink;

	@FindBy(xpath = "//span[@class='item-text'][contains(.,'Deals')]")
	WebElement DealsLink;
	
	@FindBy(xpath = "//span[@class='item-text'][contains(.,'Tasks')]")
	WebElement TasksLink;
	

	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyhomepagetitle()
	{
		return driver.getTitle();
	}
	
	public String verrifyUserName()
	{
		return UserDisplay.getText();
	}
	
	public boolean verifyUserNameDisplay()
	{
		return UserDisplay.isDisplayed();
	}
	
	public ContactsPage clickContactsLink()
	{
		ContactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickDealsLink()
	{
		DealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickTasksLink()
	{
		TasksLink.click();
		return new TasksPage();
	}
	
	
	
}
