package org.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class accessdatafb {
	static WebDriver driver;
	@Test(dataProvider="testdata" ,dataProviderClass=Company.class)
	private void tc1(String s1,String s2) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys(s1);
		WebElement txtPassWord = driver.findElement(By.id("pass"));
		txtPassWord.sendKeys(s2);
		
		

		
	}
	
	
	}

