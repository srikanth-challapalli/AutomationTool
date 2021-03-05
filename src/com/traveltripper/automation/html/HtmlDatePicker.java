package com.traveltripper.automation.html;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.traveltripper.jaxb.instances.Flowlauncher.Flow.Navigate.Fields.Field;
/**
@author Challapalli Srikanth
*/
public class HtmlDatePicker extends HtmlDataBinder {
	
	public HtmlDatePicker(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String ...strings) {/*
		Date fromDate;
		Date toDate;
		Date currDate;
		boolean found = false;
		String dateValues = "02-22-2018,02-26-2018,MM-dd-yyyy";
	//	if(dateValues.isEmpty())return found;
		if(dateValues.contains(",")) {
			String dates[] = dateValues.split(",");
			String fromDateStr = dates[0];
			String toDateStr=dates[1];
			String formatStr = dates[2];
			try {
				fromDate=new SimpleDateFormat(formatStr).parse(fromDateStr);
				toDate = new SimpleDateFormat(formatStr).parse(toDateStr);
				Calendar cal = Calendar.getInstance();
			    SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
			    String strDate = sdf.format(cal.getTime());
			    currDate = new SimpleDateFormat(formatStr).parse(strDate);
			    System.out.println("Current date in String Format: "+currDate);
			    if(fromDate.after(currDate) && toDate.after(currDate) && fromDate.before(toDate)) {
			    	
			    }else {
			    	
			    	//div[5]//span[@aria-label='April 6, 2018' and text()='6']
			    	sdf = new SimpleDateFormat("MM-dd-YY");
			    	Calendar c = Calendar.getInstance();
			    	c.setTime(currDate); // Now use today date.
			    	c.add(Calendar.DATE, 5); // Adding 5 days
			    	String output = sdf.format(c.getTime());
			    	System.out.println(output);
			    	c = Calendar.getInstance();
			    	c.setTime(currDate); // Now use today date.
			    	c.add(Calendar.DATE, 11); // Adding 5 days
			    	output = sdf.format(c.getTime());
			    	System.out.println(output);
			    	Formatter fmt = new Formatter();
			    	System.out.println(fmt.format("%tB", c));
			    	System.out.println(c.get(Calendar.DAY_OF_MONTH));
			    	System.out.println(c.get(Calendar.YEAR));
			    	buildXpath()
			    }
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		

			}
		}
	*/}
	
	public boolean pickDates(Field field) {
		Date fromDate;
		Date toDate;
		Date currDate;
		boolean found = false;
		String dateValues = field.getInputValue();//"2018-02-22,2018-02-26,yyyy-MM-dd";
		if(dateValues.isEmpty())return found;
		if(dateValues.contains(",")) {
			String dates[] = dateValues.split(",");
			String fromDateStr = dates[0];
			String toDateStr=dates[1];
			String formatStr = dates[2];
			try {
				fromDate=new SimpleDateFormat(formatStr).parse(fromDateStr);
				toDate = new SimpleDateFormat(formatStr).parse(toDateStr);
				Calendar cal = Calendar.getInstance();
			    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-YY");
			    String strDate = sdf.format(cal.getTime());
			    currDate = new SimpleDateFormat(formatStr).parse(strDate);
			    if(fromDate.after(currDate) && toDate.after(currDate) && fromDate.before(toDate)) {
			    	String[] xpaths = field.getXpath().split("#");
			    	postpone().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpaths[0]))).click();
			    	try{Thread.sleep(1000);}catch(Exception e) {}
			    	postpone().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpaths[1]))).click();
			    	try{Thread.sleep(1000);}catch(Exception e) {}
			    	postpone().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpaths[2]))).click();
			    }/*else {
			    	sdf = new SimpleDateFormat("MM-dd-YY");
			    	Calendar fromCalDate = Calendar.getInstance();
			    	fromCalDate.setTime(currDate); // Now use today date.
			    	fromCalDate.add(Calendar.DATE, 5); // Adding 5 days
			    	fromDateStr = sdf.format(fromCalDate.getTime());
			    	Calendar toCalDate = Calendar.getInstance();
			    	toCalDate.setTime(currDate); // Now use today date.
			    	toCalDate.add(Calendar.DATE, 10); // Adding 5 days
			    	toDateStr = sdf.format(toCalDate.getTime());
			    	System.out.println(toDateStr);
			    	String xpath = reconstructXpath(field,fromCalDate,toCalDate);
			    }*/
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
		}
			
		}
		return found;
	}
	
	/*private String reconstructXpath(Field field,Calendar fromDate, Calendar toDate) {
		List<String> monthList = new ArrayList<>(); 
		//div[5]//span[@aria-label='March 25, 2018' and text()='25'
		String xpath="";
		Formatter fmt = new Formatter();
    	String month = fmt.format("%tB", fromDate).toString();
    	int day = Integer.valueOf(fromDate.get(Calendar.DAY_OF_MONTH));
    	int year = Integer.valueOf(fromDate.get(Calendar.YEAR));
    	for(String monthName : monthList) {
    		if(field.getXpath().contains(monthName)) {
    			field.getXpath().replaceAll(monthName, month);
    		}
    	}
    	
		return null;
		
	}
	*/

}
