package firsttestngpackage;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class FirstTestNGFile {
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Selenium\\geckodriver\\geckodriver.exe";
	public WebDriver driver ; 

     
  @Test
  public void verifyHomepageTitle() {
       
	  System.out.println("launching firefox browser"); 
	 // System.setProperty("webdriver.gecko.driver", driverPath);
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      AssertJUnit.assertEquals(actualTitle, expectedTitle);
      driver.close();
}
}
