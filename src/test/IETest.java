package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest {

		
		static String driverPath = "IE driver path";
		public static void main(String args[]){
			System.out.println("*******************");
			System.out.println("launching IE browser");
			System.setProperty("webdriver.ie.driver", "./resources/IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			System.out.println("2");
			driver.get("http://google.com");
			System.out.println("3");
			String appTitle = driver.getTitle();
			System.out.println("4");
			System.out.println("Application title is :: "+appTitle);
			driver.quit();
		}
}
