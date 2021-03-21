package com.qatools.testinitator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUI {	
	protected WebDriver driver = null;
	
	@BeforeClass
	@Parameters("browser")
	public void beforeTest(@Optional("chrome") String browser){	
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();		
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			throw new RuntimeException("Does not support the browser:" + browser);
		}
		
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	

}
