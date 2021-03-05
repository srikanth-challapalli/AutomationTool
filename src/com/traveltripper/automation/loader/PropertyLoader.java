package com.traveltripper.automation.loader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.traveltripper.automation.loader.AbstractFactory;
import com.traveltripper.automation.loader.XmlLoader;
/**
@author Challapalli Srikanth
*/
public class PropertyLoader  extends AbstractFactory{
	
	
	
	public Properties loadProperties(String propertiesFile) throws FileNotFoundException,IOException  {
		Properties prop = new Properties();
		InputStream input = null;
		input = getClass().getResourceAsStream(propertiesFile);
		prop.load(input);
		return prop;
		
		/*
		 * <appender name="EMAIL" class="org.apache.log4j.net.SMTPAppender">
        <param name="BufferSize" value="1" />
        <param name="SMTPHost" value="email-smtp.us-east-1.amazonaws.com" />
        <param name="SMTPPort" value="587" />
        <param name="SMTPUsername" value="AKIAJLWCYVHQKQ7XC5YQ" />
        <param name="SMTPPassword" value="Ahlxqg9VJVsJpNnPne/C69X8/a+Siclg2q0uogERxOHR" />
        <param name="From" value="noreply@traveltripper.com" />
        <param name="To" value="ttsystemerrors@gmail.com" />
        <param name="Subject" value="[PROD-AWS] RezTrip2 Application Error" />
        <param name="threshold" value="fatal" />
        <layout class="org.apache.log4j.PatternLayout">
            <param name="ConversionPattern"
              value="%d [%t] %-5p %c %x - %m%n" />
        </layout>
    </appender>
		 */
	}

	@Override
	public PropertyLoader getPropertyLoader() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public XmlLoader getXmlLoader() {
		// TODO Auto-generated method stub
		return null;
	}

}
