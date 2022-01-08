package org.tcs;

import java.io.IOException;

import org.library.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin {
	public static void main(String[] args) throws IOException {
		LibGlobal l = new LibGlobal();
		WebDriver driver = l.launchBrowser("https://adactinhotelapp.com/");
		WebElement txtUserName = driver.findElement(By.id("username"));
		String username = l.getDataFromExcel("sheet1", 0, 1);
		l.sendKeys(txtUserName, username);
		
		WebElement txtPassWord = driver.findElement(By.id("password"));
		String password = l.getDataFromExcel("sheet1", 1, 1);
		l.sendKeys(txtPassWord, password);
		WebElement btnLogin = driver.findElement(By.id("login"));
		l.click(btnLogin);
		
WebElement ddLocation = driver.findElement(By.className("search_combobox"));	
l.getOptionandWriteToExcel(ddLocation, 3);	
	
}
	}


