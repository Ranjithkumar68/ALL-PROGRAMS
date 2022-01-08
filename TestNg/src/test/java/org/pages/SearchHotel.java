package org.pages;

import org.library.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends LibGlobal{
	public SearchHotel() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(name="location")
	WebElement location;
	@FindBy(id="hotels")
	WebElement hotels;
	@FindBy(id="room_type")
	WebElement roomType;
	@FindBy(id="room_nos")
	WebElement roomNos;
	@FindBy(id="datepick_in")
	WebElement datePickIn;
	@FindBy(id="datepick_out")
	WebElement datePickOut;
	@FindBy(id="adult_room")
	WebElement adultRoom;
	@FindBy(id="child_room")
	WebElement childRoom;
	@FindBy(id="Submit")
	WebElement submit;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNos() {
		return roomNos;
	}
	public WebElement getDatePickIn() {
		return datePickIn;
	}
	public WebElement getDatePickOut() {
		return datePickOut;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	
}
