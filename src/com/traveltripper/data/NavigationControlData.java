package com.traveltripper.data;

import com.traveltripper.jaxb.instances.Flowlauncher.Flow.Navigate.Fields;

/**
@author Challapalli Srikanth
*/
public class NavigationControlData {
	
	private int index;
	private String pageName;
	private Fields fields;
	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
	/**
	 * @return the pageName
	 */
	public String getPageName() {
		return pageName;
	}
	/**
	 * @param pageName the pageName to set
	 */
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	
	/**
	 * @return the fields
	 */
	public Fields getFields() {
		return fields;
	}
	/**
	 * @param fields the fields to set
	 */
	public void setFields(Fields fields) {
		this.fields = fields;
	}
	
	

}
