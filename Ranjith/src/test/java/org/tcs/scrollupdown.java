package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.amazon.com/");

		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value','iphone')", txtSearch);
		WebElement btnSearch = driver.findElement(By.id("nav-search-submit-button"));

		// js.executeScript("arguments[0].click()", btnSearch);

		WebElement bottom = driver.findElement(By.id("navFooter"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", bottom);
		
		Thread.sleep(2000);

		js.executeScript("arguments[0].scrollIntoView(false)", btnSearch);

		Thread.sleep(2000);
		driver.quit();

	}
}
