package com.traveltripper.automation.html;

import static com.traveltripper.data.IConstants.AUTOMATION_CHECKBOX;
import static com.traveltripper.data.IConstants.AUTOMATION_DATE;
import static com.traveltripper.data.IConstants.AUTOMATION_DROPDOWN;
import static com.traveltripper.data.IConstants.AUTOMATION_NG_SELECT;
import static com.traveltripper.data.IConstants.AUTOMATION_RADIO_BUTTON;
import static com.traveltripper.data.IConstants.AUTOMATION_TAB;
import static com.traveltripper.data.IConstants.AUTOMATION_TEXTAREA;
import static com.traveltripper.data.IConstants.AUTOMATION_TEXTBOX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.traveltripper.jaxb.instances.Flowlauncher.Flow.Navigate.Fields.Field;
/**
@author Challapalli Srikanth
*/
public class HtmlDataBinder {
	private WebDriver driver;
	private WebDriverWait wait;
	 
	
	
	public HtmlDataBinder(WebDriver driver) {
		this.driver = driver;
		wait=new WebDriverWait(driver, 20);
	}
	
	public boolean loadDataItem(Field field) {
		String fieldType = field.getInputType();
		if(validate(fieldType)) {
			switch(fieldType) {
			
			case AUTOMATION_TEXTBOX:
				HtmlTextBoxIdentifier textBox =new HtmlTextBoxIdentifier(this.driver);
				if(!validateBoolean(field.getAutofill())) {
					if(!validateBoolean(field.getIframe())) {
						if(!textBox.loadById(field.getId(), field.getInputValue())) {
							if(!textBox.loadByName(field.getName(), field.getInputValue())) {
								if(!textBox.loadByCss(field.getCssClass(), field.getInputValue())){
									if(!textBox.loadByClassName(field.getClassName(), field.getInputValue())) {
										if(!textBox.loadByXpath(field.getXpath(), field.getInputValue())) {
											System.out.println("Text box entry is not defined properly in xml file ");
										}
									}
								}
							}
						}
					}
				}
			
			break;
			case AUTOMATION_DROPDOWN:
				HtmlDropdownIdentifier dropDown = new HtmlDropdownIdentifier(this.driver);
				System.out.println("Addressing field name :"+field.getFieldName());
				if(field.getFieldName().contains("System")) {
					System.out.println("Breakpoint");
				}
				if(validateBoolean(field.getRequired())) {
					if(!validateBoolean(field.getAutofill())) {
						if(!validateBoolean(field.getIframe())) {
							if(!dropDown.loadById(field.getId(), field.getInputValue())) {
								if(!dropDown.loadByName(field.getName(), field.getInputValue())) {
									if(!dropDown.loadByCss(field.getCssClass(), field.getInputValue())){
										if(!dropDown.loadByClassName(field.getClassName(), field.getInputValue())) {
											if(!dropDown.loadByXpath(field.getXpath(), field.getInputValue(),field.getAsync())) {
												System.out.println("Dropdown entry is not defined properly in xml file ");
											}
										}
									}
								}
							}
						}
					}
				}
				break;
			case AUTOMATION_RADIO_BUTTON:
				HtmlRadioButtonIdentifier radioButton = new HtmlRadioButtonIdentifier(this.driver);
				System.out.println("Addressing field name :"+field.getFieldName());
				if(validateBoolean(field.getRequired())) {
					if(!validateBoolean(field.getAutofill())) {
						if(!validateBoolean(field.getIframe())) {
							if(!radioButton.loadById(field.getId(), field.getInputValue())) {
								if(!radioButton.loadByName(field.getName(), field.getInputValue())) {
									if(!radioButton.loadByCss(field.getCssClass(), field.getInputValue())){
										if(!radioButton.loadByClassName(field.getClassName(), field.getInputValue())) {
											if(!radioButton.loadByXpath(field.getXpath(), field.getInputValue())) {
												System.out.println("Dropdown entry is not defined properly in xml file ");
											}
										}
									}
								}
							}
						}
					}
				}
				
				break;
			case AUTOMATION_CHECKBOX:
				HtmlCheckboxIdentifier checkBox = new HtmlCheckboxIdentifier(this.driver);
				System.out.println("Addressing field name :"+field.getFieldName());
				if(validateBoolean(field.getRequired())) {
					if(!validateBoolean(field.getAutofill())) {
						if(!validateBoolean(field.getIframe())) {
							if(!checkBox.loadById(field.getId(), field.getInputValue())) {
								if(!checkBox.loadByName(field.getName(), field.getInputValue())) {
									if(!checkBox.loadByCss(field.getCssClass(), field.getInputValue())){
										if(!checkBox.loadByClassName(field.getClassName(), field.getInputValue())) {
											if(!checkBox.loadByXpath(field.getXpath(), field.getInputValue())) {
												System.out.println("Dropdown entry is not defined properly in xml file ");
											}
										}
									}
								}
							}
						}
					}
				}
				
				break;
			case AUTOMATION_TEXTAREA:
				HtmlTextAreaIdentifier textArea = new HtmlTextAreaIdentifier(this.driver);
				System.out.println("Addressing field name :"+field.getFieldName());
				if(validateBoolean(field.getRequired())) {
					if(!validateBoolean(field.getAutofill())) {
						if(!validateBoolean(field.getIframe())) {
							if(!textArea.loadById(field.getId(), field.getInputValue())) {
								if(!textArea.loadByName(field.getName(), field.getInputValue())) {
									if(!textArea.loadByCss(field.getCssClass(), field.getInputValue())){
										if(!textArea.loadByClassName(field.getClassName(), field.getInputValue())) {
											if(!textArea.loadByXpath(field.getXpath(), field.getInputValue())) {
												System.out.println("Text box entry is not defined properly in xml file ");
											}
										}
									}
								}
							}
						}
					}
				}
				
				break;
			case AUTOMATION_TAB:{
				HtmlTabIdentifier tab = new HtmlTabIdentifier(this.driver);
				System.out.println("Addressing field name :"+field.getFieldName());
				if(validateBoolean(field.getRequired())) {
					if(!validateBoolean(field.getAutofill())) {
						if(!validateBoolean(field.getIframe())) {
							if(!tab.selectById(field.getId())) {
								if(!tab.selectByName(field.getName())) {
									if(!tab.selectByCss(field.getCssClass())){
										if(!tab.selectByClassName(field.getClassName())) {
											if(!tab.selectByXpath(field.getXpath())) {
												System.out.println("Text box entry is not defined properly in xml file ");
											}
										}
									}
								}
							}
						}
					}
				}
				
				break;
			}
			case AUTOMATION_DATE:{
				System.out.println("Addressing field name :"+field.getFieldName());
				HtmlDatePicker date = new HtmlDatePicker(driver);
				date.pickDates(field);
				
				break;
			}
			case AUTOMATION_NG_SELECT:{
				HtmlNGSelectIdentifier ngselect= new HtmlNGSelectIdentifier(getDriver());
				System.out.println("Addressing field name :"+field.getFieldName());
				if(validateBoolean(field.getRequired())) {
					if(!validateBoolean(field.getAutofill())) {
						if(!validateBoolean(field.getIframe())) {
							if(!ngselect.loadById(field.getId(), field.getInputValue())) {
								if(!ngselect.loadByName(field.getName(), field.getInputValue())) {
									if(!ngselect.loadByCss(field.getCssClass(), field.getInputValue())){
										if(!ngselect.loadByClassName(field.getClassName(), field.getInputValue())) {
											if(!ngselect.loadByXpath(field.getXpath(), field.getInputValue())) {
												System.out.println("Text box entry is not defined properly in xml file ");
											}
										}
									}
								}
							}
						}
					}
				}
				
				break;
			}
		}
	}
	return false;
	}
	
	/*private boolean fillContent(HtmlDataBinder dataBinder,WebDriver driver,Field field ) {
		if(validateBoolean(field.getRequired())) {
			if(!validateBoolean(field.getAutofill())) {
				if(!validateBoolean(field.getIframe())) {
					if(!dataBinder.loadById(field.getId(), field.getInputValue())) {
						if(!dataBinder.loadByName(field.getFieldName(), field.getInputValue())) {
							if(!dataBinder.loadByCss(field.getCssClass(), field.getInputValue())){
								if(!dataBinder.loadByClassName(field.getClassName(), field.getInputValue())) {
									if(!dataBinder.loadByXpath(field.getXpath(), field.getInputValue())) {
										System.out.println("Text box entry is not defined properly in xml file ");
									}
								}
							}
						}
					}
				}
				if(StringUtils.isNumeric(field.getAsync())) {
					driver.manage().timeouts().implicitlyWait(Integer.valueOf(field.getAsync()), TimeUnit.SECONDS);	
				}
			}
		}
		return true;
	}*/
	
	private boolean validate(String value) {
		boolean isValid = false;
		if(value!=null && !value.equalsIgnoreCase("")) {
			isValid=true;
		}
		
		return isValid;
	}
	
	private boolean validateBoolean(String required) {
		
		if(required!=null&&!required.isEmpty()) {
			if(required.equalsIgnoreCase("true")){
				return true;
			}else if(required.equalsIgnoreCase("false")) {
				return false;
			}else {
				System.out.println("Required element in xml file should either ne true or false");
			}
			
		}
		return false;
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
