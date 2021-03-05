package com.traveltripper.automation.browsers;

import org.openqa.selenium.WebDriver;

/**
@author Challapalli Srikanth
*/
public abstract class Browser {
	
	protected WebDriver driver;
	protected boolean isMaximized;
	
	public Browser(String driverName, String driverPath,boolean isMaximized){
		this.isMaximized = isMaximized;
		System.setProperty(driverName, driverPath);
	}
	
	public abstract WebDriver getDriver();


}
