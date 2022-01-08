package org.sel;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		Set<String> allWindowsid = driver.getWindowHandles();
		System.out.println(allWindowsid);
		
		
		
		for (String eachWindowId : allWindowsid) {
			if (!parentWindowId.equals(eachWindowId)) {
				driver.switchTo().window(eachWindowId);
				
			
			}
		}
		
		WebElement txt = driver.findElement(By.xpath("//input[@name='emailid']"));
		txt.sendKeys("abc@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.close();		
		driver.switchTo().window(parentWindowId);
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);
		driver.quit();
	}

}
