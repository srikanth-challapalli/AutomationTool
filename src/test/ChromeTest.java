package test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
	
 public static WebDriver driver;
 
	public static void main(String []args) {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://qa3.ttaws.com/rt/admin/login.jsp;jsessionid=80B9DB99AC8B839A6EEC195547D2AA17");
		List<String> items = new ArrayList<String>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		//lambda
		//Output : A,B,C,D,E
		items.forEach(item->System.out.println(item));

	}
}