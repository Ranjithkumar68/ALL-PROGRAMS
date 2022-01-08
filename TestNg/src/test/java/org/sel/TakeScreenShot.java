package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenShot {
	@Test
		private void T() throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://www.amazon.com/");
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			File file = ts.getScreenshotAs(OutputType.FILE);
			
			File des = new File ("C:\\Users\\ADMN\\Pictures\\Saved Pictures\\sample.jpeg");
			
			
			FileUtils.copyFile(file, des);
			 Thread.sleep(2000);
			 
			 driver.quit();
		}
	public static void main(String[] args) throws IOException, InterruptedException {
		TakeScreenShot t = new TakeScreenShot();
		t.T();
		
		
		
	}

}
