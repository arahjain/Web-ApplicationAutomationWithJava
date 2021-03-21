package com.qatools.tests;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qatools.actions.ChnageURLAction;
import com.qatools.getPageObjects.TextBoxPage;
import com.qatools.testinitator.BaseUI;
import com.qatools.utils.WaitUtils;

public class Elements extends BaseUI {	
	private static final String baseURL = "https://demoqa.com/text-box";

	@Test
	public void textBox() 
	{	
	ChnageURLAction moveto = PageFactory.initElements(driver, ChnageURLAction.class);
	moveto.moveToElementPage(baseURL);	
	
	TextBoxPage textboxpage = PageFactory.initElements(driver, TextBoxPage.class);
	
	textboxpage.enterName("Ajay Kumar");
	textboxpage.enterEmal("tester123@abc.com");
	textboxpage.enterCurrentAddress("H no. 272\nMoh Adarsh Nagar\nSardhana\nMeerut\n250342");
	textboxpage.enterPermanentAddress("\"H no. 272\nMoh Adarsh Nagar\nSardhana\nMeerut\n250342\"");
	WaitUtils.sleepThread(1);
	textboxpage.subitButton();
	}
}
