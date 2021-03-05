package com.traveltripper.automation.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
/**
@author Challapalli Srikanth
*/
public class InternerExplorerBrowser extends Browser {
	public InternerExplorerBrowser(String browserName,String driverName, String driverPath, boolean isMaximized, Long timeOut){
		super(driverName,  driverPath, isMaximized);
		
	}
	
	public WebDriver getDriver() {
		driver = new InternetExplorerDriver();
		if(isMaximized)
			driver.manage().window().maximize();
		return driver;
	}
}
