package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TakeScreenshots;


public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	static String ScreeshotPath ="C:\\Selenium\\FirstTestNGProject\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\testdata\\";
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage = new LoginPage();
		
	}
	
	@Test(priority= 1)
	public void validateloginpagetitileTest()
	{
		String Title = loginpage.validateloginpagetitile();
		Assert.assertEquals(Title, "Cogmento CRM");
	}
	
	@Test(priority= 2)
	public void loginTest() throws Exception
	{
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		TakeScreenshots.takeSnapShot(driver,ScreeshotPath+"test.png");
	}
	
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		//driver.quit();
	}
	

}
