package org.com;

import org.library.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojo extends LibGlobal {

	 public pojo() {
		 PageFactory.initElements(driver, this);
	}
	 @FindBy(id="email")
	 private WebElement userName;
	 
	 @FindBy(id="pass")
	private  WebElement passWord;
	 
	 @FindBy(name="login")
	 private WebElement btnLogin;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
