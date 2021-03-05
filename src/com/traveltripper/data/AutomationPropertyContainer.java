package com.traveltripper.data;
import java.util.Map;

import com.traveltripper.jaxb.instances.Flowlauncher;
/**
@author Challapalli Srikanth
*/
public class AutomationPropertyContainer {
	
	private String flowName;
	private String baseUrl;
	private Map<String, NavigationControlData> navigationMap;
	/**
	 * @return the flowName
	 */
	public String getFlowName() {
		return flowName;
	}
	/**
	 * @param flowName the flowName to set
	 */
	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}
	/**
	 * @return the baseUrl
	 */
	public String getBaseUrl() {
		return baseUrl;
	}
	/**
	 * @param baseUrl the baseUrl to set
	 */
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	/**
	 * @return the navigationMap
	 */
	public Map<String, NavigationControlData> getNavigationMap() {
		return navigationMap;
	}
	/**
	 * @param navigationMap the navigationMap to set
	 */
	public void setNavigationMap(Map<String, NavigationControlData> navigationMap) {
		this.navigationMap = navigationMap;
	}
	
}
