package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Sample {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
//		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("Ranjithkumar68");
	
		WebElement txtPassWord = driver.findElement(By.id("password"));
		txtPassWord.sendKeys("8Q551M");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		Thread.sleep(1000);
		WebElement ddLocation = driver.findElement(By.name("location"));
		Select a = new Select(ddLocation);
		a.selectByIndex(3);
		
		WebElement ddRoomType = driver.findElement(By.name("room_type"));
		Select b = new Select(ddRoomType);
		b.selectByIndex(1);
		
		WebElement ddRoomNos = driver.findElement(By.name("room_nos"));
		Select c = new Select(ddRoomNos);
		c.selectByIndex(1);
		
		WebElement ddCheckIn = driver.findElement(By.name("datepick_in"));
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		ddCheckIn.sendKeys("06/12/2021");
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		WebElement ddAdult = driver.findElement(By.name("adult_room"));
		Select d = new Select(ddAdult);
		d.selectByIndex(1);
		
		WebElement ddChild = driver.findElement(By.name("child_room"));
		Select e = new Select(ddChild);
		e.selectByIndex(0);
		
		WebElement btnSearch = driver.findElement(By.name("Submit"));
		btnSearch.click();
		
		
		
		
		
		
	}		
}
