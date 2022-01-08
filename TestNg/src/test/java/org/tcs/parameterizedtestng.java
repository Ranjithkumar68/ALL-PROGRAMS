package org.tcs;

import java.io.IOException;	
import java.util.Date;

import org.library.LibGlobal;
import org.pages.BookHotel;
import org.pages.LoginPage;
import org.pages.SearchHotel;
import org.pages.SelectHotel;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class parameterizedtestng extends LibGlobal {

	@BeforeClass
	private void LaunchBrowser() {
		launchBrowser("chrome", "https://adactinhotelapp.com/");
	}
	
	@AfterClass(enabled=false)
	private void QuitBrowser() {
		quit();
	}

	@BeforeMethod
	private void Start() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	private void End() {
		Date d = new Date();
		System.out.println(d);
	}
	@Test
	private void Login() throws IOException {
		LoginPage l = new LoginPage();
		sendKeys(l.getTxtUserName(), getDataFromExcel(1, 0));
		sendKeys(l.getTxtPassWord(), getDataFromExcel(1, 1));
		l.getBtnLogin().click();
	}
	@Test(priority=10)
	private void BookHotel() throws InterruptedException {
		BookHotel b = new BookHotel();
		sendKeys(b.getFirstName(), "Ranjith");
		sendKeys(b.getLastname(), "Kumar");
		sendKeys(b.getAddress(), "Mayiladuthurai");
		sendKeys(b.getCcNum(), "1234567891234567");
		sendKeys(b.getCcCvv(), "123");
		selectByIndex(b.getCcExpMonth(), 1);
		selectByIndex(b.getCcExpYear(), 12);
		selectByIndex(b.getCcType(), 1);
		b.getBtnBook().click();
		threadSleep(6000);
		System.out.println(b.getRefNo().getAttribute("value"));
		
	
	}
	@Test(priority=5)
	private void SearchHotel() {
		SearchHotel s = new SearchHotel();
		selectByIndex(s.getLocation(), 1);
		selectByIndex(s.getHotels(), 1);
		selectByIndex(s.getRoomNos(), 1);
		selectByIndex(s.getRoomType(), 1);
		selectByIndex(s.getAdultRoom(), 1);
		selectByIndex(s.getChildRoom(), 1);
		s.getSubmit().click();
	}
	@Test(priority=7)
	private void SelectHotel() {
		SelectHotel sh = new SelectHotel();
		sh.getRadioBtn().click();
		sh.getContinueBtn().click();
		
	}
	
	
	
	

}
