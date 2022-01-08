package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFIle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://imageresizer.com/");
		
		WebElement lnk = driver.findElement(By.xpath("(//img[@class='jss177'])[1]"));
		lnk.click();
		
		WebElement txtUrl = driver.findElement(By.id("file-url"));
		txtUrl.sendKeys("C:\\Users\\ADMN\\Pictures\\Saved Pictures\\sample.jpeg",Keys.ENTER);
		
	}

}
