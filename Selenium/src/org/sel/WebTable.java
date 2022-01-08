package org.sel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		
		WebElement data = driver.findElement(By.xpath("//td[text()='Italy']"));
		System.out.println(data.getText());

		
		
				
		
			
		driver.quit();
	}
}
	
//for (int i = 0; i < tableRows.size(); i++) {
//	WebElement tableRow = tableRows.get(i);
//
//	List<WebElement> tableDatas = tableRow.findElements(By.tagName("td"));
//	for (int j = 0; j < tableDatas.size(); j++) {
//		WebElement tableData = tableDatas.get(j);
//		String text = tableData.getText();
//		if (text.equals("Canada")) {
//			System.out.println(text);



//No of Rows
//		System.out.println(tableRows.size());
//		//No of Columns
//		List<WebElement> tableCols = table.findElements(By.tagName("th"));
//		System.out.println(tableCols.size());






//
//for (WebElement tableRow : tableRows) {
//	List<WebElement> tableDatas = tableRow.findElements(By.tagName("td"));
//	for (WebElement tableData : tableDatas) {
//		String text = tableData.getText();
//		System.out.println(text);
//		System.out.println();
//	}
//	


//
//
//List<WebElement> tableRows = table.findElements(By.tagName("tr"));
//for (WebElement tableRow : tableRows) {
//	List<WebElement> tableDatas = tableRow.findElements(By.tagName("td"));
//	
//	
//	for (WebElement tableData : tableDatas) {
//		String text = tableData.getText();
//		System.out.println(text);
