package Listener_Demo;		

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;             		

@Listeners(Listener_Demo.ListenerTest.class)			

public class TestCases {				
WebDriver driver= new FirefoxDriver();					

//Test to pass as to verify listeners.		
@Test		
public void Login()				
{		
    driver.get("http://demo.guru99.com/V4/");					
    driver.findElement(By.name("uid")).sendKeys("mngr34926");							
    driver.findElement(By.name("password")).sendKeys("amUpenu");							
    driver.findElement(By.id("")).click();					
}		

//Forcefully failed this test as verify listener.		
@Test		
public void TestToFail()				
{		
    System.out.println("This method to test fail");					
    AssertJUnit.assertTrue(false);			
}		
}			