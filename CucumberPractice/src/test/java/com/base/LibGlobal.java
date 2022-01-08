package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;
	
	public WebDriver launchBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public String getText(WebElement e) {
		String text = e.getText();
		return text;
	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	public void click(WebElement e) {
		e.click();

	}
	public String getAttribute(WebElement e, String name) {
		String attribute = e.getAttribute(name);
		return attribute;
	}
	public void close() {
		driver.close();
	}
	public void quit() {
		driver.quit();
	}
	public Set<String> getWindowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	public String getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	public void Pause(int time) throws InterruptedException {
		Thread.sleep(time);
	}
	public void sendKeys(WebElement e, String keysToSend) {
		e.sendKeys(keysToSend);
	}
	// Actions Class
	public Actions action() {
		Actions action = new Actions(driver);
		return action;
	}
	public void moveToElement(WebElement target) {
		action().moveToElement(target).perform();
	}
	public void dragAndDrop(WebElement source, WebElement target) {
		action().dragAndDrop(source, target).perform();

	}
	public void contextClick(WebElement target) {
		action().contextClick(target).perform();
	}

	public void doubleClick(WebElement target) {
		action().doubleClick(target).perform();
		
	}
	// Alert Interface
	public TargetLocator switchTo() {
		TargetLocator switchTo = driver.switchTo();
		return switchTo;
	}
	public void acceptAlert() {
		switchTo().alert().accept();

	}
	public void dismissAlert() {
		switchTo().alert().dismiss();
	}
	public void promptAlert(String keysToSend) {
		switchTo().alert().sendKeys(keysToSend);
		acceptAlert();
	}
	// Navigation Interface
	public Navigation navigation() {
		Navigation navigate = driver.navigate();
		return navigate;
	}
	public void navigationBack() {
		navigation().back();
	}
	public void navigationForward() {
		navigation().forward();
	}
	public void navigationRefresh() {
		navigation().refresh();
	}
	public void navigateTo(String url) {
		navigation().to(url);
	}
	// select class
	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void getOptionandWriteToExcel(WebElement element,int row) throws IOException {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i <options.size(); i++) {
			WebElement  r = options.get(i);
			String text = r.getText();
			writeExcel("D:\\Workspace\\Ranjith\\EXCEL\\adactin.xlsx", text, row, i);
			
		}
		
	}

	public void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public void deselectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public void deselectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public void deselectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	public List<WebElement> getAllSelectedOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	}

	public String getFirstSelectedOption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		return text;
	}

	public boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	// TakesScreenShot Interface
	public void takesScreenShot(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(location);
		FileUtils.copyFile(file, des);
	}
	// Frames
	
	public void switchToFrameIndex(int index) {
		switchTo().frame(index);
	}
	public void switchToFrameId(String nameOrId) {
		switchTo().frame(nameOrId);

	}
	public void switchToFrame(WebElement frameElement) {
		switchTo().frame(frameElement);

	}
	public void switchToParentFrame() {
		switchTo().parentFrame();
	}
	//Excel Integration 
	public String getDataFromExcel(String sheet,int row,int cell) throws IOException {
		String value = null;
		File excelLoc = new File("D:\\Workspace\\Ranjith\\EXCEL\\adactin.xlsx");
		FileInputStream stream = new FileInputStream(excelLoc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		int cellType = c.getCellType();
		if (cellType == 1) {
			value = c.getStringCellValue();
		}if (cellType==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MM-YYYY");
				value= sim.format(d);
			}else {
				double numericCellValue = c.getNumericCellValue();
				value = String.valueOf(numericCellValue);
			}
		}
		return value;
			}
	//Excel Integration write

	public void writeExcel(String pathname,String data,int row,int cell) throws IOException {
		File excelLoc = new File(pathname);
		Workbook w = new XSSFWorkbook();
		Sheet createSheet = w.createSheet("sheet");
		Row createRow = createSheet.createRow(row);
		Cell createCell = createRow.createCell(cell);
		createCell.setCellValue(data);
		FileOutputStream stream = new FileOutputStream(excelLoc);
		w.write(stream);
	}

}
