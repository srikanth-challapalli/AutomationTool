package com.traveltripper.automation.html;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
/**
@author Challapalli Srikanth
*/
public class HtmlCheckboxIdentifier extends HtmlDataBinder{

	

	
	public HtmlCheckboxIdentifier(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public boolean loadById(String id,String value){
		boolean found =false;
		if(id.isEmpty())return false;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		if(element!=null) {
			found =true;
			element.click();
		}
		return found;
	}
	public boolean loadByName(String name,String value){
		boolean found =false;
		if(name.isEmpty())return false;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
		if(element!=null) {
			found =true;
			element.click();
		}
		return found;
	}
	public boolean loadByCss(String css,String value){
		boolean found =false;
		if(css.isEmpty())return false;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css)));
		if(element!=null) {
			found =true;
			element.click();
		}
		return found;
	}
	public boolean loadByClassName(String className,String value){
		boolean found =false;
		if(className.isEmpty())return false;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
		if(element!=null) {
			found =true;
			element.click();
		}
		return found;
	}
	public boolean loadByXpath(String xpath,String value){
		boolean found =false;
		if(xpath.isEmpty())return false;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		if(element!=null) {
			found =true;
			element.click();
		}
		return found;
	}




	


}
