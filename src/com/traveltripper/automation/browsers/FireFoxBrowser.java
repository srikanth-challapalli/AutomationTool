package com.traveltripper.automation.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
/**
@author Challapalli Srikanth
*/
public class FireFoxBrowser extends Browser {
	public FireFoxBrowser(String browserName,String driverName, String driverPath, boolean isMaximized, Long timeOut){
		super(driverName,  driverPath, isMaximized);
		
	}
	
	public WebDriver getDriver() {
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver();
		if(isMaximized)
			driver.manage().window().maximize();
		return driver;
	}
}
