package com.qatools.setup;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverSetup {
	 
	public WebDriver driver;
	
	
	@BeforeClass
	public void beforeTest() throws MalformedURLException {	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities.setBrowserName("chrome");	  
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	

}
