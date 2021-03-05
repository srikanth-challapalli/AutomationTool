package com.traveltripper.automation.loader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.traveltripper.jaxb.instances.Flowlauncher;
import com.traveltripper.jaxb.instances.Flowlauncher.Flow;
/**
@author Challapalli Srikanth
*/
public class XmlLoader extends AbstractFactory {
	
	public Flow unmarshallXml(String xmlfile) throws JAXBException,FileNotFoundException  {
		
		 JAXBContext jaxbContext = JAXBContext.newInstance(Flowlauncher.class);  
         Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
         InputStream input = getClass().getResourceAsStream(xmlfile);;
         Flowlauncher flow = (Flowlauncher) jaxbUnmarshaller.unmarshal(input);
         return flow.getFlow();
	}

	@Override
	public PropertyLoader getPropertyLoader() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XmlLoader getXmlLoader() {
		// TODO Auto-generated method stub
		return this;
	}

}
