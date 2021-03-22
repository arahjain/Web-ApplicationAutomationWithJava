package com.qatools.getPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage {
	
	private WebDriver driver;

	public TextBoxPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(id = "userName")
	private WebElement fullName;
	
	@FindBy(id = "userEmail")
	private WebElement email;
	
	@FindBy(id = "currentAddress")
	private WebElement currentAddress;
	
	@FindBy(id = "permanentAddress")
	private WebElement permanentAddress;
	
	@FindBy(id = "submit")
	public WebElement submitbutton;
	
	@FindBy(id = "name")
	private WebElement name;
	
	

	
	public void enterName(String name) {
		fullName.sendKeys(name);
	}
	
	public void enterEmal(String enterEmail) {
		email.sendKeys(enterEmail);
	}
	
	public void enterCurrentAddress(String cAddress) {
		currentAddress.sendKeys(cAddress);
	}
	
	public void enterPermanentAddress(String pAddress) {
		permanentAddress.sendKeys(pAddress);
	}
	
	public void subitButton() {
		submitbutton.click();
	}
	
	public String verifyName() {
		return name.getText();
	}
}
