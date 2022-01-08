package org.workout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition2 {
	public static WebDriver driver;

@Given("I want to launch browser and navigate to Adactin WebPage")
public void i_want_to_launch_browser_and_navigate_to_Adactin_WebPage() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://adactinhotelapp.com/");
    
}

@When("I enter Valid UserName and Valid Password")
public void i_enter_Valid_UserName_and_Valid_Password() {
	WebElement txtUserName = driver.findElement(By.id("username"));
	txtUserName.sendKeys("Ranjithkumar68");

	WebElement txtPassWord = driver.findElement(By.id("password"));
	txtPassWord.sendKeys("8Q551M");
    
    
}

@When("I click on Login Button")
public void i_click_on_Login_Button() {
	WebElement btnLogin = driver.findElement(By.id("login"));
	btnLogin.click();
    
}

@Then("I want to verify the Search Hotel Page is displayed")
public void i_want_to_verify_the_Search_Hotel_Page_is_displayed() {
	boolean title = driver.getTitle().contains("Search");
	System.out.println("Search Hotel Page is Located:"+title);
	
    
}

@Then("I want to select the valid Details of Location,Hotel,RoomType,Number of Rooms and  Enter the CheckIn,CheckOut Dates and Select the valid adult room and Child Room")
public void i_want_to_select_the_valid_Details_of_Location_Hotel_RoomType_Number_of_Rooms_and_Enter_the_CheckIn_CheckOut_Dates_and_Select_the_valid_adult_room_and_Child_Room() {
	WebElement ddLocation = driver.findElement(By.name("location"));
	Select a = new Select(ddLocation);
	a.selectByIndex(3);
	
	new Select(driver.findElement(By.id("hotels"))).selectByIndex(1);
	
	WebElement ddRoomType = driver.findElement(By.name("room_type"));
	Select b = new Select(ddRoomType);
	b.selectByIndex(1);
	
	WebElement ddRoomNos = driver.findElement(By.name("room_nos"));
	Select c = new Select(ddRoomNos);
	c.selectByIndex(1);
	WebElement ddAdult = driver.findElement(By.name("adult_room"));
	Select d = new Select(ddAdult);
	d.selectByIndex(1);
	
	WebElement ddChild = driver.findElement(By.name("child_room"));
	Select e = new Select(ddChild);
	e.selectByIndex(0);
    
}

@Then("I want to click the Submit Button")
public void i_want_to_click_the_Submit_Button() {
	WebElement btnSearch = driver.findElement(By.name("Submit"));
	btnSearch.click();
    
}

@Then("I want to verify the Select Hotel  Page is displayed")
public void i_want_to_verify_the_Select_Hotel_Page_is_displayed() {
    boolean title2 = driver.getTitle().contains("Select");
    System.out.println("Select Hotel Page is located:"+""+title2);
    
}

@Then("I want to click the Select Radio Button and  click the Continue Button")
public void i_want_to_click_the_Select_Radio_Button_and_click_the_Continue_Button() throws InterruptedException {
    Thread.sleep(3000);
	driver.findElement(By.id("radiobutton_0")).click();
    driver.findElement(By.id("continue")).click();
    
}

@Then("I want to Verify the Book A Hotel Page is displayed")
public void i_want_to_Verify_the_Book_A_Hotel_Page_is_displayed() {
	boolean title3 = driver.getTitle().contains("Book");
    System.out.println("Book A Hotel Page is Displayed:"+" "+title3);
    
}

@When("I enter the Valid FirstName,LastName,Billing Address,CreditCardNo and Select CreditCardType,Expiry Date,Expiry Year and Enter Valid Cvv")
public void i_enter_the_Valid_FirstName_LastName_Billing_Address_CreditCardNo_and_Select_CreditCardType_Expiry_Date_Expiry_Year_and_Enter_Valid_Cvv() {
  driver.findElement(By.id("first_name")).sendKeys("Ranjith");
		  driver.findElement(By.id("last_name")).sendKeys("Kumar");		
driver.findElement(By.id("address")).sendKeys("Mayiladuthurai");
driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");

Select s = new Select(driver.findElement(By.id("cc_type")));
s.selectByIndex(1);

Select m = new Select(driver.findElement(By.id("cc_exp_month")));
m.selectByIndex(1);

Select y = new Select(driver.findElement(By.id("cc_exp_year")));
y.selectByIndex(12);

driver.findElement(By.id("cc_cvv")).sendKeys("123");

}

@When("I want to  click the Book Now Button")
public void i_want_to_click_the_Book_Now_Button() {
	driver.findElement(By.id("book_now")).click();
    
}

@Then("I want to verify the OrderId is displayed")
public void i_want_to_verify_the_OrderId_is_displayed() throws InterruptedException {
	Thread.sleep(6000);
	System.out.println("Order ID:"+" "+driver.findElement(By.id("order_no")).getAttribute("value"));
	driver.quit();
    
}
}
