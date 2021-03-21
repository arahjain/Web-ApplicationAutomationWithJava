package com.qatools.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qatools.testinitator.BaseUI;

public class ChnageURLAction extends BaseUI{
	
	private WebDriver driver;

	public ChnageURLAction(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	private WebElement elementPage;
	
	public void moveToElementPage(String baseURL) {
		driver.get(baseURL);
	}

//	public void moveToElementPage() {
//		// TODO Auto-generated method stub
//		
//	}
	
	

}
