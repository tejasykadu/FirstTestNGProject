package firsttestngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class MultipleTestWithPriority {
  @Test (priority = 0)
  public void d() {
	  
	  System.out.println("method d");
  }
  
  @Test (priority = 1)
  public void b() {
	  
	  System.out.println("method b");
  }
  
  @BeforeTest
  public void beforetest() {
	  
	  System.out.println("beforetest");
  }
  
  @AfterTest
  public void aftertest() {
	  
	  System.out.println("aftertest");
  }
  
  @Test (priority = 2)
  public void c() {
	  
	  System.out.println("method c");
  }

  @Test (priority = 3)
  public void a() {
	  
	  System.out.println("method a");
  }
}

