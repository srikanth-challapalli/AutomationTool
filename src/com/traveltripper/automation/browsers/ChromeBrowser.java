package com.traveltripper.automation.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
@author Challapalli Srikanth
*/
public class ChromeBrowser extends Browser {
	
	
	public ChromeBrowser(String browserName,String driverName, String driverPath, boolean isMaximized, Long timeOut){
		super(driverName,  driverPath, isMaximized);
		
	}
	
	public WebDriver getDriver() {
		driver = new ChromeDriver();
		if(isMaximized)
			driver.manage().window().maximize();
		return driver;
	}
	
	

}
