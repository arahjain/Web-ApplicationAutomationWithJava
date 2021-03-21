package com.qatools.utils;

import org.openqa.selenium.WebDriver;

public class WaitUtils {
	
	public static void sleepThread(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
