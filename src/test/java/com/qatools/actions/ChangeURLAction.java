package com.qatools.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qatools.testinitator.BaseUI;

public class ChangeURLAction extends BaseUI{
	
	private WebDriver driver;

	public ChangeURLAction(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	private WebElement elementPage;
	
	public void changePage(String baseURL) {
		driver.get(baseURL);
	}

//	public void moveToElementPage() {
//		// TODO Auto-generated method stub
//		
//	}
	
	

}
