package com.traveltripper.automation;

import static com.traveltripper.data.StaticDataContainer.AUTOMATION_VALIDATION_CHECK_SUCCESS;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.traveltripper.automation.browsers.Browser;
import com.traveltripper.automation.browsers.ChromeBrowser;
import com.traveltripper.automation.browsers.FireFoxBrowser;
import com.traveltripper.automation.browsers.InternerExplorerBrowser;
import com.traveltripper.automation.exception.NullCheckException;
import com.traveltripper.automation.exception.PropertyNotDefined;
import com.traveltripper.automation.html.HtmlActionBinder;
import com.traveltripper.automation.html.HtmlDataBinder;
import com.traveltripper.data.AutomationPropertyContainer;
import com.traveltripper.data.NavigationControlData;
import com.traveltripper.data.ScreenCapture;
import com.traveltripper.jaxb.instances.Flowlauncher.Flow.Navigate.Fields;
import com.traveltripper.jaxb.instances.Flowlauncher.Flow.Navigate.Fields.Action;
import com.traveltripper.jaxb.instances.Flowlauncher.Flow.Navigate.Fields.Field;
import com.traveltripper.jaxb.instances.Flowlauncher.Flow.Navigate.Fields.Screenshot;

/**
@author Challapalli Srikanth
*/
public class InitiateAutomation {
	private WebDriver driver;
	private  Browser browser;
	
	public  void automate(AutomationPropertyContainer dataContainer,Properties browserProperties) throws Exception{
		try {
			if(new Boolean(browserProperties.getProperty("chrome"))) {
				browser =  new ChromeBrowser("CHROME", browserProperties.getProperty("chromeproperty"), browserProperties.getProperty("chromedriver"),new Boolean(browserProperties.getProperty("chromeMaximize")),Long.valueOf(browserProperties.getProperty("chrometimeout")));
				driver = browser.getDriver();
				initializeAutomation(dataContainer,driver);
				
			}if(new Boolean(browserProperties.getProperty("firefox"))) {
				browser =  new FireFoxBrowser("FireFox", browserProperties.getProperty("firefoxproperty"), browserProperties.getProperty("firefoxdriver"),new Boolean(browserProperties.getProperty("firefoxMaximize")),Long.valueOf(browserProperties.getProperty("firefoxtimeout")));
				driver = browser.getDriver();
				initializeAutomation(dataContainer, driver);
			}if(new Boolean(browserProperties.getProperty("ie"))) {
				browser =  new InternerExplorerBrowser("InternetExplorer", browserProperties.getProperty("ieproperty"), browserProperties.getProperty("iedriver"),new Boolean(browserProperties.getProperty("ieMaximize")),Long.valueOf(browserProperties.getProperty("ietimeout")));
				driver = browser.getDriver();
				initializeAutomation(dataContainer, driver);
			}
		}catch(WebDriverException wde) {
		//	driver.close();
			wde.printStackTrace();
		}catch(ElementNotFoundException enf) {
		//	driver.quit();
			enf.printStackTrace();
		}catch(Exception e) {
			//driver.quit();
			e.printStackTrace();
		}
	}
	
	private Boolean initializeAutomation(AutomationPropertyContainer dataContainer,WebDriver driver) throws Exception{
		
		System.out.println("Automation started for Application "+dataContainer.getFlowName());
		driver.get(dataContainer.getBaseUrl().trim());
		Map<String, NavigationControlData> navigationMap = dataContainer.getNavigationMap();
		int index=0;
		for(String pageName : navigationMap.keySet()) {
			boolean isElementLoaded = false;
			NavigationControlData navigationControlData = navigationMap.get(pageName);
			if(index==navigationControlData.getIndex()) {
				System.out.println("Page Index "+navigationControlData.getIndex());
				index+=1;
				System.out.println("Automating following page "+navigationControlData.getPageName());
				Fields fields=navigationControlData.getFields();
				List<Object> fieldOrAction = fields.getScreenshotOrFieldOrAction();
				for(Object fieldOrActionInstance : fieldOrAction) {
					if(fieldOrActionInstance instanceof Field) {
						Field field = ((Field) fieldOrActionInstance);
						System.out.println("Following field is being addressed "+field.getFieldName());
						if(field.getFieldName().contains("Override Code")) {
							System.out.println("Break point");
						}	
						WebDriverWait wait = new WebDriverWait (driver, 20);
						if(new Boolean(((Field) fieldOrActionInstance).getRequired())) {
							if(field.getId()!=null&&!field.getId().equals("")  && !isElementLoaded ) {
								wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(field.getId())));
								isElementLoaded = true;
							}
							if(field.getName()!=null&&!field.getName().equals("") && !isElementLoaded) {
								wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(field.getName())));
							}
							if(field.getCssClass()!=null&&!field.getCssClass().equals("") && !isElementLoaded) {
								wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(field.getCssClass())));
							}
							if(field.getClassName()!=null&&!field.getClassName().equals("")&& !isElementLoaded) {
								wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(field.getClassName())));
							}
							if(field.getXpath()!=null&&!field.getXpath().equals("")&& !isElementLoaded) {
								if(field.getXpath().contains("#")) {
									String xpath = field.getXpath().split("#")[0];
									wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
								}else {
									try {
										wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(field.getXpath())));
									}catch(TimeoutException toe) {
										if(field.isProceedIfNotPresent()) {
											continue;
										}
									}
								}
							}
							new HtmlDataBinder(driver).loadDataItem((Field)fieldOrActionInstance);
						}
					}if(fieldOrActionInstance instanceof Action) {
						Action action = ((Action) fieldOrActionInstance);
						WebDriverWait wait = new WebDriverWait (driver, 20);
						if(new Boolean(((Action) fieldOrActionInstance).getValidate())) {
							if(action.getId()!=null&&!action.getId().equals("") && !isElementLoaded) {
								wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(action.getId())));
							}
							if(action.getFieldName()!=null&&!action.getFieldName().equals("")&& !isElementLoaded) {
								wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(action.getFieldName())));
							}
							if(action.getCssClass()!=null&&!action.getCssClass().equals("")&& !isElementLoaded) {
								wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(action.getCssClass())));
							}
							if(action.getClassName()!=null&&!action.getClassName().equals("")&& !isElementLoaded) {
								wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(action.getClassName())));
							}
							if(action.getXpath()!=null&&!action.getXpath().equals("")&& !isElementLoaded) {
								wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(action.getXpath())));
							}
							new HtmlActionBinder(driver).navigate((Action)fieldOrActionInstance);
						}
					}if(fieldOrActionInstance instanceof com.traveltripper.jaxb.instances.Flowlauncher.Flow.Navigate.Fields.Screenshot) {
						Screenshot screenprintInst = (Screenshot)fieldOrActionInstance;
						
						try {//<screenshot isRequired="true" name="ceasars_home" format="jpg" fullscreen="false" waitTime="5"/>
							if(validateMarker(screenprintInst.getIsRequired()).equals(AUTOMATION_VALIDATION_CHECK_SUCCESS)) {
								if(validateMarker(screenprintInst.getFullscreen()).equals(AUTOMATION_VALIDATION_CHECK_SUCCESS)) {
									boolean isRequired = new Boolean(screenprintInst.getIsRequired());
									boolean fullScreen = new Boolean(screenprintInst.getFullscreen());
									String fileName = (screenprintInst.getName()!=null && !screenprintInst.getName().isEmpty()) ? screenprintInst.getName() : dataContainer.getFlowName()+"_"+pageName ;
									String imageFormat = (screenprintInst.getFormat()!=null && !screenprintInst.getFormat().isEmpty())? screenprintInst.getFormat() : "JPG";
									int waitInSec = StringUtils.isNumeric(screenprintInst.getWaitTime()) ? Integer.valueOf(screenprintInst.getWaitTime())*1000 : 0;
									ScreenCapture.capture(driver,fileName,imageFormat,waitInSec,fullScreen);
								}
							}
						} catch (PropertyNotDefined | NullCheckException e) {
							e.printStackTrace();
						}
					}
				}
				
			}else {
				System.out.println("Indexing not clearly defined");
			}
		}
		return true;
		
	}
	
	
	public Wait<WebDriver> waitUntilLoad(WebDriver driver){
		return new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	}
	
	private static String validateMarker(String flag) throws PropertyNotDefined,NullCheckException{
		if(flag !=null) {
			if(flag.equalsIgnoreCase("true")||flag.equalsIgnoreCase("false")){
				return AUTOMATION_VALIDATION_CHECK_SUCCESS;
			}else {
				throw new PropertyNotDefined("Property value should either be true/false.Please define property correctly...");
			}
			
		}else {
			throw new NullCheckException("Property which was defined has no value defined");
		}
		
	}

}
