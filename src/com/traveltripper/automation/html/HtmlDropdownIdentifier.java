package com.traveltripper.automation.html;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
@author Challapalli Srikanth
*/
public class HtmlDropdownIdentifier extends HtmlDataBinder {
	private WebDriver driver;
	
	
	public HtmlDropdownIdentifier(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	public boolean loadById(String id,String value){
		boolean found =false;
		if(id.isEmpty()) {
			return found;
		}
		Select element = new Select(postpone().until(ExpectedConditions.visibilityOfElementLocated(By.id(id))));
		if(element!=null) {
			found =true;
			try{Thread.sleep(5000);}catch(Exception e) {}
			element.selectByVisibleText(value);
		}
		return found;
	}
	public boolean loadByName(String name,String value){
		boolean found =false;
		if(name.isEmpty()) {
			return found;
		}
		Select element = new Select(postpone().until(ExpectedConditions.visibilityOfElementLocated(By.name(name))));
		if(element!=null) {
			found =true;
			element.selectByVisibleText(value);
		}
		return found;
	}
	public boolean loadByCss(String css,String value){
		boolean found =false;
		if(css.isEmpty()) {
			return found;
		}
		Select element = new Select(postpone().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css))));
		if(element!=null) {
			found =true;
			element.selectByVisibleText(value);
		}
		return found;
	}
	public boolean loadByClassName(String className,String value){
		boolean found =false;
		if(className.isEmpty()) {
			return found;
		}
		Select element = new Select(getDriver().findElement(By.className(className)));
		if(element!=null) {
			found =true;
			element.selectByVisibleText(value);
		}
		return found;
	}
	public boolean loadByXpath(String xpath,String value,int time) {
		boolean found =false;
		Select element=null;
		if(xpath.isEmpty()) {
			return found;
		}
		WebElement webElement = postpone().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		if(webElement instanceof Select) {
			element = new Select(postpone().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))));
		}
		if(webElement instanceof RemoteWebElement) {
			webElement.click();
			try {
			Thread.sleep(1000);
			}catch(InterruptedException ie) {}
			webElement = postpone().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
			try {
				Thread.sleep(1000);
				}catch(InterruptedException ie) {}
			webElement.click();
		}
		if(element!=null && element instanceof Select) {
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
			found =true;
			element.selectByVisibleText(value);
			
		}
		return found;
	}
	
	

}

	