package com.traveltripper.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.traveltripper.jaxb.instances.Flowlauncher;
import com.traveltripper.jaxb.instances.Flowlauncher.Flow;
import com.traveltripper.jaxb.instances.Flowlauncher.Flow.Navigate;
import com.traveltripper.jaxb.instances.Flowlauncher.Flow.Navigate.Fields.Action;
import com.traveltripper.jaxb.instances.Flowlauncher.Flow.Navigate.Fields;
import com.traveltripper.jaxb.instances.Flowlauncher.Flow.Navigate.Fields.Field;
/**
@author Challapalli Srikanth
*/
public class StaticDataContainerImpl implements StaticDataContainer {
	
	
	private static StaticDataContainerImpl instance;

	static {
		instance = new StaticDataContainerImpl();
	}
	private StaticDataContainerImpl() {
		System.out.println("Singleton instance created");
	}
	
	public AutomationPropertyContainer populateStaticDataContainer(Flow flowXmlLoader){
		AutomationPropertyContainer container = new AutomationPropertyContainer();
		Map<String, NavigationControlData> dataContainer = new LinkedHashMap<>(flowXmlLoader.getNavigate().size());
		container.setBaseUrl(flowXmlLoader.getBaseUrl());
		container.setFlowName(flowXmlLoader.getName());
		NavigationControlData controlData = null;
		List<Navigate> navigationList = flowXmlLoader.getNavigate();
		
		for(Navigate navigateInst : navigationList) {
			controlData= new NavigationControlData();
			controlData.setIndex(navigateInst.getIndex());
			controlData.setPageName(navigateInst.getPageName());
			Fields fields = navigateInst.getFields();
			controlData.setFields(fields);
			dataContainer.put(navigateInst.getPageName(),controlData);
		}
		container.setNavigationMap(dataContainer);
		return container;
		}
	
	
	public static StaticDataContainerImpl getInstance() {
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
