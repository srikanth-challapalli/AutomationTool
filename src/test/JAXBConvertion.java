package test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.traveltripper.jaxb.instances.Flowlauncher;

public class JAXBConvertion {
	
	public static void main(String ... strings) throws JAXBException{
		 JAXBContext jaxbContext = JAXBContext.newInstance(Flowlauncher.class);  
         Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
         Flowlauncher flow = (Flowlauncher) jaxbUnmarshaller.unmarshal(new File("./config/flow.xml"));
         System.out.println(flow.getFlow().getBaseUrl());
	}
}
