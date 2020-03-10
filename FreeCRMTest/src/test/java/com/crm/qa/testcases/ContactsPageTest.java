package com.crm.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	String SheetName = "Contacts";
	
	
	public ContactsPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactspage = homepage.clickContactsLink();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}
	
   @Test(priority=1)
	public void contactslabelTest()
	{
		Assert.assertTrue(contactspage.verifyContactslableDisplay());
	}
	
	@Test(priority=2)
	public void SelectCheckboxByNameTest()
	{
		contactspage.verifySelectCheckboxByName("tejas y kadu"); 
	}

	
	@DataProvider
	public Object[][]getCRMTestData(){
		Object data[][] = TestUtil.getTestData(SheetName);
		return data;
	}
	
	@Test (dataProvider = "getCRMTestData")
	public void createNewContcatTest(String FirstName,String LastName,String Company,String PhoneNumber)
	{
		//contactspage.verifyCreateNewContact("Tejas","Kadu","SS","1231231231");
		contactspage.verifyCreateNewContact(FirstName,LastName,Company,PhoneNumber);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}