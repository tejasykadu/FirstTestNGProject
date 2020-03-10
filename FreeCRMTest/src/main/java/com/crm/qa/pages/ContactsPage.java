package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath = "(//div[contains(.,'Contacts')])[8]")
	WebElement Contactslabel;
	
	@FindBy(xpath = "//div[@name='view']")
	WebElement SelectAllViews;
	
	@FindBy(xpath = "//div[@class='text'][contains(.,'View_3')]")
	WebElement SelectView1;
	
	@FindBy(xpath = "(//i[contains(@aria-hidden,'true')])[11]")
	WebElement CreateNewContact;
	
	//@FindBy(xpath = "//td[contains(.,'max n gulati')]")
	//WebElement SelectCheckbox;
	
	@FindBy(xpath = "//input[contains(@name,'first_name')]")
	WebElement FirstName;
	@FindBy(xpath = "//input[contains(@name,'last_name')]")
	WebElement LastName;
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])")
	WebElement Company;
	@FindBy(xpath = "//input[@placeholder='Number']")
	WebElement PhoneNumber;
	//input[@placeholder='Number']
	
	@FindBy(xpath = "//button[@class='ui linkedin button'][contains(.,'Save')]")
	WebElement Savebtn;
	
	
	
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactslableDisplay()
	{
		return Contactslabel.isDisplayed();
	}
	
	public void verifySelectCheckboxByName(String name)
	{
		driver.findElement(By.xpath("//td[contains(.,'"+name+"')]")).click();;
		 
		//SelectCheckbox.click();
	}
	

	
	
	
	public void verifyCreateNewContact(String FirstName,String LastName,String Company,String PhoneNumber)
	{
		CreateNewContact.click();
		this.FirstName.sendKeys(FirstName);
		this.LastName.sendKeys(LastName);
		this.Company.sendKeys(Company);
		this.PhoneNumber.sendKeys(PhoneNumber);
		Savebtn.click();
		
		
		
	}
	
	public void verifyCreateNewContact()
	{
		CreateNewContact.click();
		this.FirstName.sendKeys("TejasLead");
		this.LastName.sendKeys("Kadu");
		this.Company.sendKeys("bank");
		this.PhoneNumber.sendKeys("5123123123");
	
		
		Savebtn.click();
		
		
		
	}

}
