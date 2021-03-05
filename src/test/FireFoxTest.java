package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class FireFoxTest {


		
		public static void main(String args[]) {
			System.out.println("1");
			System.setProperty("webdriver.gecko.driver", "./resources/geckodriver.exe");

			//Now you can Initialize marionette driver to launch firefox
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			WebDriver driver  = new FirefoxDriver();
			System.out.println("2");
			driver.get("http://google.com");
			System.out.println("3");
			String appTitle = driver.getTitle();
			System.out.println("4");
			System.out.println("Application title is :: "+appTitle);
			driver.quit();
		}


}