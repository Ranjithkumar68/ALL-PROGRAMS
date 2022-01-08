package org.pages;

import org.library.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends LibGlobal {
	public BookHotel() {

	PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	WebElement firstName;
	@FindBy(id="last_name")
	WebElement lastname;
	@FindBy(id="address")
	WebElement address;
	@FindBy(id="cc_num")
	WebElement ccNum;
	@FindBy(id="cc_type")
	WebElement ccType;
	@FindBy(id="cc_exp_month")
	WebElement ccExpMonth;
	@FindBy(id="cc_exp_year")
	WebElement ccExpYear;
	@FindBy(id="cc_cvv")
	WebElement ccCvv;
	@FindBy(id="book_now")
	WebElement btnBook;
	@FindBy(id="order_no")
	WebElement refNo;
	public WebElement getRefNo() {
		return refNo;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getCcExpMonth() {
		return ccExpMonth;
	}
	public WebElement getCcExpYear() {
		return ccExpYear;
	}
	public WebElement getCcCvv() {
		return ccCvv;
	}
	public WebElement getBtnBook() {
		return btnBook;
	}
	
}
