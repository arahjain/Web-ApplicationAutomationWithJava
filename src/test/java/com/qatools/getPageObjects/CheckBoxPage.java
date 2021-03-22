package com.qatools.getPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage {
	
	private WebDriver driver;

	public CheckBoxPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(css = "#tree-node > div > button.rct-option.rct-option-expand-all")
	private WebElement expandAll;
	
//	@FindBy(className = "rct-title")
	
	public void empandAll() {
		System.out.print(expandAll);
		expandAll.click();
	}
	
	public void verifyExpension() {
//		assertFalse()
	}
	
	

}
