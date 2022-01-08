package org.tcs;

import java.io.IOException;

import org.library.LibGlobal;
import org.openqa.selenium.WebElement;
import org.pages.BookHotel;
import org.pages.LoginPage;
import org.pages.SearchHotel;
import org.pages.SelectHotel;

public class Adactin extends BookHotel {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		LibGlobal l = new LibGlobal();
	
		l.launchBrowser("edge", "https://adactinhotelapp.com/");
		LoginPage LoginPage = new LoginPage(); // LoginPage POM
		l.sendKeys(LoginPage.getTxtUserName(), l.getDataFromExcel("Adactin", 1, 0));
		l.sendKeys(LoginPage.getTxtPassWord(), l.getDataFromExcel("Adactin", 1, 1));
		l.click(LoginPage.getBtnLogin());
		SearchHotel Search = new SearchHotel();
		WebElement location = Search.getLocation();
		l.selectByVisibleText(location, l.getDataFromExcel("Adactin", 1, 2));
		WebElement hotels = Search.getHotels();
		l.selectByVisibleText(hotels, l.getDataFromExcel("Adactin", 1, 3));
		l.selectByVisibleText(Search.getRoomType(), l.getDataFromExcel("Adactin", 1, 4));
		l.selectByVisibleText(Search.getRoomNos(), l.getDataFromExcel("Adactin", 1, 5));
		l.selectByVisibleText(Search.getAdultRoom(), l.getDataFromExcel("Adactin", 1, 6));
		l.selectByVisibleText(Search.getChildRoom(), l.getDataFromExcel("Adactin", 1, 7));
		Search.getSubmit().click();
		SelectHotel s = new SelectHotel();
		s.getRadioBtn().click();
		s.getContinueBtn().click();
		BookHotel b = new BookHotel();
		l.sendKeys(b.getFirstName(), l.getDataFromExcel("Adactin", 1, 8));
		l.sendKeys(b.getLastname(), l.getDataFromExcel("Adactin", 1, 9));
		l.sendKeys(b.getAddress(), l.getDataFromExcel("Adactin", 1, 10));
		l.sendKeys(b.getCcNum(), l.getDataFromExcel("Adactin", 1, 11));
		l.selectByVisibleText(b.getCcType(), l.getDataFromExcel("Adactin", 1, 12));
		l.selectByVisibleText(b.getCcExpMonth(), l.getDataFromExcel("Adactin", 1, 13));
		l.selectByVisibleText(b.getCcExpYear(), l.getDataFromExcel("Adactin", 12, 14));
		l.sendKeys(b.getCcCvv(), l.getDataFromExcel("Adactin", 1, 15));
		b.getBtnBook().click();
		l.threadSleep(10000);
		System.out.println(l.getAttribute(b.getRefNo(), "value"));
		l.quit();
	}
}
