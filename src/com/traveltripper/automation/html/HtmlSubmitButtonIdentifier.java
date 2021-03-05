package com.traveltripper.automation.html;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
/**
@author Challapalli Srikanth
*/
public class HtmlSubmitButtonIdentifier extends HtmlActionBinder{
	
	public HtmlSubmitButtonIdentifier(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public boolean navigateById(String id){
		boolean found =false;
		if(id.isEmpty())return found;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		if(element!=null) {
			found =true;
			element.click();
		}
		return found;
	}
	public boolean navigateByName(String name,String changeFocusToFlag){
		boolean found =false;
		if(name.isEmpty())return found;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
		if(element!=null) {
			found =true;
			element.click();
			try {Thread.sleep(3000);}catch(Exception e) {}
			if(new Boolean(changeFocusToFlag)) {
				getDriver().switchTo().alert().accept();
				try {Thread.sleep(5000);}catch(Exception e) {}
			}
		}
		return found;
	}
	public boolean navigateByCss(String css,String changeFocusToFlag){
		boolean found =false;
		if(css.isEmpty()) return found;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css)));
		if(element!=null) {
			found =true;
			element.click();
			try {Thread.sleep(3000);}catch(Exception e) {}
			if(new Boolean(changeFocusToFlag)) {
				getDriver().switchTo().alert().accept();
				try {Thread.sleep(5000);}catch(Exception e) {}
			}
		}
		return found;
	}
	public boolean navigateByClassName(String className,String changeFocusToFlag){
		boolean found =false;
		if(className.isEmpty())return found;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
		if(element!=null) {
			found =true;
			element.click();
			try {Thread.sleep(3000);}catch(Exception e) {}
			if(new Boolean(changeFocusToFlag)) {
				getDriver().switchTo().alert().accept();
				try {Thread.sleep(5000);}catch(Exception e) {}
			}
		}
		return found;
	}
	public boolean navigateByXPath(String xpath,String changeFocusToFlag){
		boolean found =false;
		if(xpath.isEmpty())return found;
		WebElement element= postpone().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		if(xpath.trim().equalsIgnoreCase("//i[@type='button' and @class='fa fa-plus-square-o pull-right font-20']")) {
			System.out.println("Breakpoint");
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			js.executeScript("arguments[0].scrollIntoView();", element);
		}
	
		if(element!=null) {
			found =true;
			element.click();
			if(new Boolean(changeFocusToFlag)) {
				getDriver().switchTo().alert().accept();
				try {Thread.sleep(5000);}catch(Exception e) {}
			}
		}
		return found;
	}

}
