package com.traveltripper.automation.html;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
/**
@author Challapalli Srikanth
*/
public class HtmlTextAreaIdentifier extends HtmlDataBinder {
	 
	
	public HtmlTextAreaIdentifier(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public boolean loadById(String id,String value){
		boolean found =false;
		if(id.isEmpty())return found;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		if(element !=null) {
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
		return found;
	}
	public boolean loadByName(String name,String value){
		boolean found =false;
		if(name.isEmpty())return found;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
		if(element !=null) {
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
		return found;
	}
	public boolean loadByCss(String css,String value){
		boolean found =false;
		if(css.isEmpty())return found;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css)));
		if(element !=null) {
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
		return found;
	}
	public boolean loadByClassName(String className,String value){
		boolean found =false;
		if(className.isEmpty())return found;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
		if(element !=null) {
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
		return found;
	}
	public boolean loadByXpath(String xpath,String value){
		boolean found =false;
		if(xpath.isEmpty())return found;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		if(element !=null) {
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
		return found;
	}


}
