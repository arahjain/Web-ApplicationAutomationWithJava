package com.util;

public class AutomationUtilities {
	
	public static void sleep(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
