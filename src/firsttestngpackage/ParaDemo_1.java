package firsttestngpackage;


import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParaDemo_1 {

  @Test
  @Parameters("Iteration")
  public void parademo_1(int Iteration) {
	  
	  System.out.println(Iteration);
  }
}
