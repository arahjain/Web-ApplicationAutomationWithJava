package com.qatools.tests;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qatools.actions.ChangeURLAction;
import com.qatools.getPageObjects.CheckBoxPage;
import com.qatools.getPageObjects.TextBoxPage;
import com.qatools.testinitator.BaseUI;
import com.qatools.utils.WaitUtils;

public class Elements extends BaseUI {	
	private static final String CURRENT_ADDRESS = "H no. 272\nMoh Adarsh Nagar\nSardhana\nMeerut\n250342";
	private static final String PERMANENT_ADDRESS = "H no. 272\nMoh Adarsh Nagar\nSardhana\nMeerut\n250342";	
	private static final String NAME = "Ajay Kumar";
	private static final String EMAIL = "tester123@abc.com";
	

	@Test(priority=1)
	public void textBox() 
	{	
		final String baseURL = "https://demoqa.com/text-box";
		ChangeURLAction moveto = PageFactory.initElements(driver, ChangeURLAction.class);
		moveto.changePage(baseURL);		
		TextBoxPage textboxpage = PageFactory.initElements(driver, TextBoxPage.class);	
		textboxpage.enterName(NAME);	
		textboxpage.enterEmal(EMAIL);
		textboxpage.enterCurrentAddress(CURRENT_ADDRESS);
		textboxpage.enterPermanentAddress(PERMANENT_ADDRESS);
		WaitUtils.sleepThread(1);
		textboxpage.subitButton();
		WaitUtils.sleepThread(3);
	}
	
	@Test(priority=2)
	public void checkBox()
	{
		final String baseURL = "https://demoqa.com/checkbox";
		ChangeURLAction moveto = PageFactory.initElements(driver, ChangeURLAction.class);
		moveto.changePage(baseURL);		
		CheckBoxPage checkboxpage = PageFactory.initElements(driver, CheckBoxPage.class);
		checkboxpage.empandAll();
		WaitUtils.sleepThread(5);
	}
}
