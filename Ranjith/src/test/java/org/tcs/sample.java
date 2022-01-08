package org.tcs;

import java.io.IOException;

import org.library.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sample {
	public static void main(String[] args) throws InterruptedException, IOException {

		LibGlobal l = new LibGlobal();
		
		WebDriver driver = l.launchBrowser("http://demo.automationtesting.in/Alerts.html");
		
		WebElement findElement = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		l.click(findElement);
		l.threadSleep(2000);
		l.acceptAlert();
		l.takesScreenShot("C:\\Users\\ADMN\\OneDrive\\Pictures\\Saved Pictures\\ranjith.jpeg");
		l.quit();
		
	
	}

}
