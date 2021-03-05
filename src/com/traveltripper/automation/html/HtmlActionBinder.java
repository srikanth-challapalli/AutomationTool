package com.traveltripper.automation.html;

import static com.traveltripper.data.IConstants.AUTOMATION_BUTTON;
import static com.traveltripper.data.IConstants.AUTOMATION_LINK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.traveltripper.jaxb.instances.Flowlauncher.Flow.Navigate.Fields.Action;
/**
@author Challapalli Srikanth
*/
public class HtmlActionBinder  {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public HtmlActionBinder(WebDriver driver) {
		this.driver = driver;
		wait=new WebDriverWait(driver, 20);
	}
	
	public boolean navigate(Action action) throws Exception{
		String type = action.getType();
		Long async = action.getAsync();
		if(validate(type)) {
			if(new Boolean(action.getValidate())) {
				switch(type){
					case AUTOMATION_BUTTON:{
						HtmlSubmitButtonIdentifier submit = new HtmlSubmitButtonIdentifier(driver);
						Thread.sleep(async*1000);
						System.out.println("Following navigation is being processed and navigates from  "+action.getFrom()+" to "+action.getTo());
						if(!submit.navigateByName(action.getName(),action.getChangeFocusTo())) {
							if(!submit.navigateByXPath(action.getXpath(),action.getChangeFocusTo())){
								System.out.println("Xml attribute is not defined properly");
							}
						}
						break;
					}
					case AUTOMATION_LINK:{
						HtmlLinkIdentifier submit = new HtmlLinkIdentifier(driver);
						Thread.sleep(async*1000);
						System.out.println("Following navigation is being processed and navigates from  "+action.getFrom()+" to "+action.getTo());
						if(!submit.navigateByName(action.getName())) {
							if(submit.navigateByXPath(action.getXpath())){
								System.out.println("Xml attribute is not defined properly");
							}
						}
						break;
					}
				}
			}
		}
		
		return true;
	}
	
	
	private boolean validate(String value) {
		boolean isValid = false;
		if(value!=null && !value.equalsIgnoreCase("")) {
			isValid=true;
		}
		
		return isValid;
	}
	
	/**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return driver;
	}

	/**
	 * @param driver the driver to set
	 */
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriverWait postpone() {
		return wait;
	}
	
	

	
}
