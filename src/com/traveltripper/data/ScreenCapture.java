package com.traveltripper.data;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.screentaker.ViewportPastingStrategy;

public class ScreenCapture {
	
	
	public static void capture(WebDriver driver, String fileName,String format,int waitTimeInSec,boolean fullScreen) {
			 try {
				 if(fullScreen) {
					 try{Thread.sleep(waitTimeInSec);}catch(Exception e) {}
						final Screenshot screenshot = new AShot().shootingStrategy(new ViewportPastingStrategy(0)).takeScreenshot(driver);
						final BufferedImage image = screenshot.getImage();
						ImageIO.write(image, format, new File("./screenshots/"+fileName+"."+format));
						try{Thread.sleep(5000);}catch(Exception e) {}
						JavascriptExecutor jse = (JavascriptExecutor)driver;
						jse.executeScript("scroll(0, -250);");
				 }else {
					 try{Thread.sleep(waitTimeInSec);}catch(Exception e) {}
					 TakesScreenshot scrShot =((TakesScreenshot)driver);
				     File srcFldr=scrShot.getScreenshotAs(OutputType.FILE);
				     File destFldr=new File("./screenshots/"+fileName+"."+format);
				     FileUtils.copyFile(srcFldr, destFldr);
				 }
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
