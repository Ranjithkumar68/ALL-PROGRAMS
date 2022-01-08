package org.tcs;

import java.io.IOException;

import org.library.LibGlobal;
import org.openqa.selenium.WebElement;
import org.pages.BookHotel;
import org.pages.LoginPage;
import org.pages.SearchHotel;
import org.pages.SelectHotel;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactinHotel {
		
	
	@Parameters({"username","password","firstname","lastname","address","cardnumber","cvv"})
	@Test
	private void Paramet(String s1,String s2,String s3,String s4,String s5,String s6,String s7) throws IOException, InterruptedException {


		LibGlobal l = new LibGlobal();
	
		l.launchBrowser("chrome", "https://adactinhotelapp.com/");
		LoginPage LoginPage = new LoginPage(); // LoginPage POM
		l.sendKeys(LoginPage.getTxtUserName(), s1);
		l.sendKeys(LoginPage.getTxtPassWord(),s2);
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
		l.sendKeys(b.getFirstName(), s3);
		l.sendKeys(b.getLastname(),s4);
		l.sendKeys(b.getAddress(), s5);
		l.sendKeys(b.getCcNum(), s6);
		l.selectByVisibleText(b.getCcType(), l.getDataFromExcel(1, 12));
		l.selectByVisibleText(b.getCcExpMonth(), l.getDataFromExcel(1, 13));
		l.selectByVisibleText(b.getCcExpYear(), l.getDataFromExcel(12, 14));
		l.sendKeys(b.getCcCvv(),s7);
		b.getBtnBook().click();
		l.threadSleep(10000);
		System.out.println(l.getAttribute(b.getRefNo(), "value"));
		l.quit();
	}
}
