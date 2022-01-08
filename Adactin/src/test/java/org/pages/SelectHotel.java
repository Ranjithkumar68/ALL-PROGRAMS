package org.pages;

import org.library.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends LibGlobal {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	WebElement radioBtn;
	@FindBy(id="continue")
	WebElement continueBtn;
	public WebElement getRadioBtn() {
		return radioBtn;
	}
	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	

}
