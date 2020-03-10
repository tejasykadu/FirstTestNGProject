package firsttestngpackage;

import org.testng.annotations.Test;

@Test
public class Display_child extends Display_Inh {
  public void t_display() {
	  
	  Display_child obj1 = new Display_child();
	  obj1.displya();
	  
	  
  }
}
