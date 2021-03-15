package com.qatools.tests;
//package com.qatools.setup;



import org.testng.annotations.Test;

import com.qatools.setup.DriverSetup;

public class First extends DriverSetup{
	
  
  @Test
  public void testMethod (){
	  driver.get("https://www.google.com");
//	  sleep(5);
  }
}
