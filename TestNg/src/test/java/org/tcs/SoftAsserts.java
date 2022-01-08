package org.tcs;

import java.io.IOException;

import org.library.LibGlobal;
import org.openqa.selenium.WebElement;
import org.pages.BookHotel;
import org.pages.LoginPage;
import org.pages.SearchHotel;
import org.pages.SelectHotel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserts extends LibGlobal {
	SoftAssert soft = new SoftAssert();
		
	@Test
	private void Login() throws IOException, InterruptedException {
		LibGlobal l = new LibGlobal();  
		l.launchBrowser("chrome", "https://adactinhotelapp.com/");
		soft.assertTrue(l.getCurrentUrl().contains("facebook"), "Verify Url");
		LoginPage LoginPage = new LoginPage(); // LoginPage POM
		l.sendKeys(LoginPage.getTxtUserName(), l.getDataFromExcel(1, 0));
		soft.assertEquals(LoginPage.getTxtUserName().getAttribute("value"), "Ranjith", "Verify UserName");
		l.sendKeys(LoginPage.getTxtPassWord(), l.getDataFromExcel(1, 1));
		l.click(LoginPage.getBtnLogin());
		SearchHotel Search = new SearchHotel();
		WebElement location = Search.getLocation();
		l.selectByVisibleText(location, l.getDataFromExcel(1, 2));
		WebElement hotels = Search.getHotels();
		l.selectByVisibleText(hotels, l.getDataFromExcel(1, 3));
		l.selectByVisibleText(Search.getRoomType(), l.getDataFromExcel(1, 4));
		l.selectByVisibleText(Search.getRoomNos(), l.getDataFromExcel(1, 5));
		l.selectByVisibleText(Search.getAdultRoom(), l.getDataFromExcel(1, 6));
		l.selectByVisibleText(Search.getChildRoom(), l.getDataFromExcel(1, 7));
		Search.getSubmit().click();
		SelectHotel s = new SelectHotel();
		s.getRadioBtn().click();
		s.getContinueBtn().click();
		BookHotel b = new BookHotel();
		l.sendKeys(b.getFirstName(), l.getDataFromExcel(1, 8));
		l.sendKeys(b.getLastname(), l.getDataFromExcel(1, 9));
		l.sendKeys(b.getAddress(), l.getDataFromExcel(1, 10));
		l.sendKeys(b.getCcNum(), l.getDataFromExcel(1, 11));
		l.selectByVisibleText(b.getCcType(), l.getDataFromExcel(1, 12));
		l.selectByVisibleText(b.getCcExpMonth(), l.getDataFromExcel(1, 13));
		l.selectByVisibleText(b.getCcExpYear(), l.getDataFromExcel(12, 14));
		l.sendKeys(b.getCcCvv(), l.getDataFromExcel(1, 15));
		b.getBtnBook().click();
		l.threadSleep(10000);
		System.out.println(l.getAttribute(b.getRefNo(), "value"));
		l.quit();
		soft.assertAll();
	}}