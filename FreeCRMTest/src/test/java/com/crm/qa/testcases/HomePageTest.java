package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	DealsPage dealspage;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void verifyhomepagetitleTest()
	{
		String HomePageTitle = homepage.verifyhomepagetitle();
		Assert.assertEquals(HomePageTitle,"Cogmento CRM","Assertion Failed");
	}
	
	@Test(priority = 2)
	public void verifUserNameTest()
	{
		String HomepageUserName = homepage.verrifyUserName();
		Assert.assertEquals(HomepageUserName, "Tejas kadu");
	}
	
	@Test(priority = 3)
	public void verifUserNameDisplayTest()
	{
		Assert.assertTrue(homepage.verifyUserNameDisplay());
	}
	
	@Test(priority = 4)
	public void verifyContactsLinkTest()
	{
		contactspage = homepage.clickContactsLink();
	}
	
	@Test(priority = 5)
	public void verifyDealsLinkTest()
	{
		dealspage = homepage.clickDealsLink();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
