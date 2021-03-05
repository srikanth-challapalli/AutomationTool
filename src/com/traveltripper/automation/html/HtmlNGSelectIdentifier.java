package com.traveltripper.automation.html;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
/**
@author Challapalli Srikanth
*/
public class HtmlNGSelectIdentifier extends HtmlDataBinder {
	

	 
	
	public HtmlNGSelectIdentifier(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public boolean loadById(String id,String value){
		boolean found =false;
		if(id.isEmpty())return found;
		
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.id(id.split("#")[0])));
		if(element !=null) {
			element.click();
			element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.id(id.split("#")[1])));
			if(element!=null) {
				String isReadOnly = element.getAttribute("readonly");
				if(new Boolean(isReadOnly)) {
					JavascriptExecutor jst= (JavascriptExecutor) getDriver();
					jst.executeScript("arguments[1].value = arguments[0]; ", value, element); 
					found =true;
				}else {
					found =true;
					element.sendKeys(value);
				}
			}
		}
		return found;
	}
	public boolean loadByName(String name,String value){
		boolean found =false;
		if(name.isEmpty())return found;
		
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.name(name.split("#")[0])));
		if(element !=null) {
			element.click();
			element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.name(name.split("#")[1])));
			if(element!=null) {
				String isReadOnly = element.getAttribute("readonly");
				if(new Boolean(isReadOnly)) {
					JavascriptExecutor jst= (JavascriptExecutor) getDriver();
					jst.executeScript("arguments[1].value = arguments[0]; ", value, element); 
					found =true;
				}else {
					found =true;
					element.sendKeys(value);
				}
			}
		}
		return found;
	}
	public boolean loadByCss(String css,String value){
		boolean found =false;
		if(css.isEmpty())return found;
		
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css.split("#")[0])));
		if(element !=null) {
			element.click();
			element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css.split("#")[1])));
			if(element!=null) {
				String isReadOnly = element.getAttribute("readonly");
				if(new Boolean(isReadOnly)) {
					JavascriptExecutor jst= (JavascriptExecutor) getDriver();
					jst.executeScript("arguments[1].value = arguments[0]; ", value, element); 
					found =true;
				}else {
					found =true;
					element.sendKeys(value);
				}
			}
		}
		return found;
	}
	public boolean loadByClassName(String className,String value){
		boolean found =false;
		if(className.isEmpty())return found;
		
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.className(className.split("#")[0])));
		if(element !=null) {
			element.click();
			element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.className(className.split("#")[1])));
			if(element!=null) {
				String isReadOnly = element.getAttribute("readonly");
				if(new Boolean(isReadOnly)) {
					JavascriptExecutor jst= (JavascriptExecutor) getDriver();
					jst.executeScript("arguments[1].value = arguments[0]; ", value, element); 
					found =true;
				}else {
					found =true;
					element.sendKeys(value);
				}
			}
		}
		return found;
	}
	public boolean loadByXpath(String xpath,String value){
		boolean found =false;
		if(xpath.isEmpty())return found;
		
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.className(xpath.split("#")[0])));
		if(element !=null) {
			element.click();
			element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.className(xpath.split("#")[1])));
			if(element!=null) {
				String isReadOnly = element.getAttribute("readonly");
				if(new Boolean(isReadOnly)) {
					JavascriptExecutor jst= (JavascriptExecutor) getDriver();
					jst.executeScript("arguments[1].value = arguments[0]; ", value, element); 
					found =true;
				}else {
					found =true;
					element.sendKeys(value);
				}
			}
		}
		return found;
	}



	
	

}
