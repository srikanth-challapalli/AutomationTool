package com.traveltripper.automation.html;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
/**
@author Challapalli Srikanth
*/
public class HtmlLinkIdentifier extends HtmlActionBinder {
	
	public HtmlLinkIdentifier(WebDriver driver) {
		super(driver);
	}
	public boolean navigateById(String id){
		boolean found =false;
		if(id.isEmpty())return false;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		if(element!=null) {
			found =true;
			element.click();
		}
		return found;
	}
	public boolean navigateByName(String name){
		boolean found =false;
		if(name.isEmpty())return false;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
		if(element!=null) {
			found =true;
			element.click();
		}
		return found;
	}
	public boolean navigateByCss(String css){
		boolean found =false;
		if(css.isEmpty())return false;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css)));
		if(element!=null) {
			found =true;
			element.click();
		}
		return found;
	}
	public boolean navigateByClassName(String className){
		boolean found =false;
		if(className.isEmpty())return false;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
		if(element!=null) {
			found =true;
			element.click();
		}
		return found;
	}
	public boolean navigateByXPath(String xpath){
		boolean found =false;
		if(xpath.isEmpty())return false;
		WebElement element = getDriver().findElement(By.xpath(xpath));
		if(element!=null) {
			found =true;
			element.click();
		}
		return found;
	}

}
