package com.traveltripper.automation.html;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
/**
@author Challapalli Srikanth
*/
public class HtmlTabIdentifier extends HtmlDataBinder{
	
	public HtmlTabIdentifier(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public boolean selectById(String id){
		boolean found =false;
		if(id.isEmpty()) {return found;}
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		if(element!=null) {
			found =true;
			element.click();
		}
		return found;
	}
	public boolean selectByName(String name){
		boolean found =false;
		if(name.isEmpty()) {
			return found;
		}
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
		if(element!=null) {
			found =true;
			element.click();
		}
		return found;
	}
	public boolean selectByCss(String css){
		boolean found =false;
		if(css.isEmpty()) {
			return found;
		}
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css)));
		if(element!=null) {
			found =true;
			element.click();
		}
		return found;
	}
	public boolean selectByClassName(String className){
		boolean found =false;
		if(className.isEmpty()) {
			return found;
		}
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
		if(element!=null) {
			found =true;
			element.click();
		}
		return found;
	}
	public boolean selectByXpath(String xpath){
		boolean found =false;
		if(xpath.isEmpty()) {
			return found;
		}
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		if(element!=null) {
			found =true;
			element.click();
		}
		return found;
	}

}
