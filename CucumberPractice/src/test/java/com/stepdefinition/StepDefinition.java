package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.base.LibGlobal;
import com.pojo.BookHotel;
import com.pojo.LoginPage;
import com.pojo.SearchHotel;
import com.pojo.SelectHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends LibGlobal {
	LoginPage l;
	SearchHotel s;
	SelectHotel ss;
	BookHotel b;

	@Given("User launch browser and open the Adactinhotel WebPage")
	public void user_launch_browser_and_open_the_Adactinhotel_WebPage() {

	}

	@When("User enters the valid userName and passWord")
	public void user_enters_the_valid_userName_and_passWord() {
		
		l = new LoginPage();
		l.getTxtUserName().sendKeys("Ranjithkumar68");
		l.getTxtPassWord().sendKeys("8Q551M");
	}

	@When("User Click on login Button")
	public void user_Click_on_login_Button() {
		l = new LoginPage();
		l.getBtnLogin().click();
	}

	@Given("User Verify the SearchHotel Page is displayed")
	public void user_Verify_the_SearchHotel_Page_is_displayed() {

		System.out.println("SearchHotel Page is Displayed:  " + getTitle().contains("Search"));

	}

	@When("User Select Valid Details of Location,Hotel,RoomType,Number of Rooms, and enters the CheckIn Date ,CheckOut Date and Select the Adult Room ,ChildRoom")
	public void user_Select_Valid_Details_of_Location_Hotel_RoomType_Number_of_Rooms_and_enters_the_CheckIn_Date_CheckOut_Date_and_Select_the_Adult_Room_ChildRoom() {
		Assert.assertTrue(false);
		s = new SearchHotel();
		selectByIndex(s.getLocation(), 1);
		selectByIndex(s.getHotels(), 1);
		selectByIndex(s.getRoomType(), 1);
		selectByIndex(s.getRoomNos(), 1);
		selectByIndex(s.getAdultRoom(), 1);
		selectByIndex(s.getChildRoom(), 1);

	}

	@Then("User Click on Submit Button")
	public void user_Click_on_Submit_Button() {
		s = new SearchHotel();
		s.getSubmit().click();
	}

	@Then("User Verify the Select Hotel Page is Displayed")
	public void user_Verify_the_Select_Hotel_Page_is_Displayed() {

		System.out.println("SelectHotel Page is Displayed:  " + getTitle().contains("Select"));
	}

	@Then("User click the Select Radio Button and  click the Continue Button")
	public void user_click_the_Select_Radio_Button_and_click_the_Continue_Button() {
		ss = new SelectHotel();
		ss.getRadioBtn().click();
		ss.getContinueBtn().click();

	}

	@Then("Useer Verify the Book A Hotel Page is displayed")
	public void useer_Verify_the_Book_A_Hotel_Page_is_displayed() {

		System.out.println("Book A Hotel Page is Displayed:  " + getTitle().contains("Book"));
	}

	@When("User enter the Valid FirstName,LastName,Billing Address,CreditCardNo and Select CreditCardType,Expiry Month,Expiry Year and Enter Valid Cvv")
	public void user_enter_the_Valid_FirstName_LastName_Billing_Address_CreditCardNo_and_Select_CreditCardType_Expiry_Month_Expiry_Year_and_Enter_Valid_Cvv() {
		b = new BookHotel();
		sendKeys(b.getFirstName(), "Ranjithkumar");
		sendKeys(b.getLastname(), "Jayakumar");
		sendKeys(b.getAddress(), "mayiladuthurai");
		sendKeys(b.getCcNum(), "1234567890123456");
		selectByIndex(b.getCcType(), 1);
		selectByIndex(b.getCcExpMonth(), 1);
		selectByIndex(b.getCcExpYear(), 12);
		sendKeys(b.getCcCvv(), "123");

	}

	@When("User  click the Book Now Button")
	public void user_click_the_Book_Now_Button() {
		b = new BookHotel();
		b.getBtnBook().click();

	}

	@Then("User verify the OrderId is displayed")
	public void user_verify_the_OrderId_is_displayed() throws InterruptedException {
		Pause(7000);
		System.out.println("Order Id Is: " + getAttribute(b.getRefNo(), "value"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", b.getRefNo());

	}

	@When("User Select Valid Details of Location{string},Hotel{string},RoomType{string},Number of Rooms{string}, and enters the CheckIn Date ,CheckOut Date and Select the Adult Room{string} ,ChildRoom{string}")
	public void user_Select_Valid_Details_of_Location_Hotel_RoomType_Number_of_Rooms_and_enters_the_CheckIn_Date_CheckOut_Date_and_Select_the_Adult_Room_ChildRoom(
			String string, String string2, String string3, String string4, String string5, String string6) {
		s = new SearchHotel();
		selectByVisibleText(s.getLocation(), string);
		selectByVisibleText(s.getHotels(), string2);
		selectByVisibleText(s.getRoomType(), string3);
		selectByVisibleText(s.getRoomNos(), string4);
		selectByVisibleText(s.getAdultRoom(), string5);
		selectByVisibleText(s.getChildRoom(), string6);
	}

	@When("User enter the Valid FirstName{string},LastName{string},Billing Address{string},CreditCardNo{string} and Select CreditCardType{string},Expiry Month{string},Expiry Year{string} and Enter Valid Cvv{string}")
	public void user_enter_the_Valid_FirstName_LastName_Billing_Address_CreditCardNo_and_Select_CreditCardType_Expiry_Month_Expiry_Year_and_Enter_Valid_Cvv(
			String string, String string2, String string3, String string4, String string5, String string6,
			String string7, String string8) {
		b = new BookHotel();
		sendKeys(b.getFirstName(), string);
		sendKeys(b.getLastname(), string2);
		sendKeys(b.getAddress(), string3);
		sendKeys(b.getCcNum(), string4);
		selectByVisibleText(b.getCcType(), string5);
		selectByVisibleText(b.getCcExpMonth(), string6);
		selectByVisibleText(b.getCcExpYear(), string7);
		sendKeys(b.getCcCvv(), string8);
	}

}
