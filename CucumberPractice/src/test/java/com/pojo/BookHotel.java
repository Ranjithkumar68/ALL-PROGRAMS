package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class BookHotel extends LibGlobal {
	public BookHotel() {

	PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
private WebElement firstName;
	@FindBy(id="last_name")
private WebElement lastname;
	@FindBy(id="address")
private WebElement address;
	@FindBy(id="cc_num")
private WebElement ccNum;
	@FindBy(id="cc_type")
private WebElement ccType;
	@FindBy(id="cc_exp_month")
private WebElement ccExpMonth;
	@FindBy(id="cc_exp_year")
private WebElement ccExpYear;
	@FindBy(id="cc_cvv")
private WebElement ccCvv;
	@FindBy(id="book_now")
private WebElement btnBook;
	@FindBy(id="order_no")
private WebElement refNo;
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
