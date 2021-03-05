package com.traveltripper.automation.loader;
/**
@author Challapalli Srikanth
*/
public abstract class AbstractFactory {
	
	public AbstractFactory() {
			System.out.println("Abstract Factory Design Pattern Instantiation suceeded ");
	}
	  public abstract PropertyLoader getPropertyLoader();
	  public abstract XmlLoader getXmlLoader() ;
	
	}