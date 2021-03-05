package com.traveltripper.automation;

import static com.traveltripper.data.StaticDataContainer.AUTOMATION_BROWSER_PROPERTY_REL_LOC;
import static com.traveltripper.data.StaticDataContainer.AUTOMATION_FLOW_PREFIX;
import static com.traveltripper.data.StaticDataContainer.AUTOMATION_FLOW_PROPERTY_REL_LOC;
import static com.traveltripper.data.StaticDataContainer.AUTOMATION_FLOW_SUFFIX;
import static com.traveltripper.data.StaticDataContainer.AUTOMATION_HYPHEN;
import static com.traveltripper.data.StaticDataContainer.AUTOMATION_PROPERTIES;
import static com.traveltripper.data.StaticDataContainer.AUTOMATION_VALIDATION_CHECK_SUCCESS;
import static com.traveltripper.data.StaticDataContainer.AUTOMATION_XML;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.xml.bind.JAXBException;

import com.traveltripper.automation.exception.NullCheckException;
import com.traveltripper.automation.exception.PropertyNotDefined;
import com.traveltripper.automation.loader.LoaderFactory;
import com.traveltripper.automation.loader.PropertyLoader;
import com.traveltripper.automation.loader.XmlLoader;
import com.traveltripper.data.AutomationPropertyContainer;
import com.traveltripper.data.StaticDataContainerImpl;
/**
@author Challapalli Srikanth
*/
public class InitializeAutomationtool {

	public static void main(String[] args) throws Exception {
		try {
			Properties flowProperties = ((PropertyLoader) LoaderFactory.getFactory(AUTOMATION_PROPERTIES)).getPropertyLoader().loadProperties(AUTOMATION_FLOW_PROPERTY_REL_LOC);
			Properties browserProperties = ((PropertyLoader)LoaderFactory.getFactory(AUTOMATION_PROPERTIES)).getPropertyLoader().loadProperties(AUTOMATION_BROWSER_PROPERTY_REL_LOC);
			flowProperties.forEach((flow,flag)->{
				try {
					if(validateMarker(flag.toString()).equals(AUTOMATION_VALIDATION_CHECK_SUCCESS)) {
						if(new Boolean(flag.toString())) {
							try {
								AutomationPropertyContainer dataContainer = StaticDataContainerImpl.getInstance().populateStaticDataContainer(((XmlLoader) LoaderFactory.getFactory(AUTOMATION_XML)).getXmlLoader().unmarshallXml(populateFlowFileName(flow.toString())));
								try {
									new InitiateAutomation().automate(dataContainer, browserProperties);
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} 
							} catch (FileNotFoundException | JAXBException e) {
								e.printStackTrace();
							} 
						}
					}
				} catch (PropertyNotDefined | NullCheckException e) {
					e.printStackTrace();
				}
			});
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

	private static String populateFlowFileName(String flow) {
		System.out.println("Loading ..."+AUTOMATION_FLOW_PREFIX+AUTOMATION_HYPHEN+flow+AUTOMATION_FLOW_SUFFIX);
		return "/"+AUTOMATION_FLOW_PREFIX+AUTOMATION_HYPHEN+flow+AUTOMATION_FLOW_SUFFIX;
		
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
