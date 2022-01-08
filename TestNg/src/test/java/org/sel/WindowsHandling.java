package org.sel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ContextClickAction;
import org.testng.annotations.Test;

public class WindowsHandling {
	@Test
	private void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com/");
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys("iphone 13", Keys.ENTER);
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String eachWindowId : windowHandles) {
			if (!parentId.equalsIgnoreCase(eachWindowId)) {
				driver.switchTo().window(eachWindowId);
			}
		}
		WebElement lnk1 = driver
				.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		lnk1.click();

		WebElement btnaddToCart = driver.findElement(By.id("add-to-cart-button"));
		btnaddToCart.click();

		List<String> li = new ArrayList<String>();
		li.addAll(windowHandles);

		driver.switchTo().window(parentId);
		String x = li.get(0);
		driver.switchTo().window(x);

	}

	public static void main(String[] args) throws InterruptedException {

		WindowsHandling w = new WindowsHandling();
		w.LaunchBrowser();

	}

}
