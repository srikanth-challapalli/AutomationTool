package com.traveltripper.automation.loader;
/**
@author Challapalli Srikanth
*/
public class LoaderFactory {
	
	
	
	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("properties")){
		     return new PropertyLoader().getPropertyLoader();
        }else if(choice.equalsIgnoreCase("xml")){
	         return new XmlLoader().getXmlLoader();
	    }
      return null;
   }
}
