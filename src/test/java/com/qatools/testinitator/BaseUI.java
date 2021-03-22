package com.qatools.testinitator;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUI {	
	protected WebDriver driver = null;
	
	@BeforeClass
	@Parameters("browser")
	public void beforeTest(@Optional("chrome") String browser) throws MalformedURLException{	
		
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setBrowserName(browser);
//		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		if (browser.equals("chrome")) {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setBrowserName(browser);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);		
		} else if (browser.equals("firefox")) {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setBrowserName(browser);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
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
