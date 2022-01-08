$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Adactin.feature");
formatter.feature({
  "name": "Validation of AdactinHotel WebPage",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch browser and open the Adactinhotel WebPage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_browser_and_open_the_Adactinhotel_WebPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the valid userName and passWord",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_userName_and_passWord()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Click_on_login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC01_Validation of OrderId which is created and displayed",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Verify the SearchHotel Page is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_Verify_the_SearchHotel_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Select Valid Details of Location,Hotel,RoomType,Number of Rooms, and enters the CheckIn Date ,CheckOut Date and Select the Adult Room ,ChildRoom",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_Select_Valid_Details_of_Location_Hotel_RoomType_Number_of_Rooms_and_enters_the_CheckIn_Date_CheckOut_Date_and_Select_the_Adult_Room_ChildRoom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Submit Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_on_Submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify the Select Hotel Page is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Verify_the_Select_Hotel_Page_is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Select Radio Button and  click the Continue Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_Select_Radio_Button_and_click_the_Continue_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Useer Verify the Book A Hotel Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.useer_Verify_the_Book_A_Hotel_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the Valid FirstName,LastName,Billing Address,CreditCardNo and Select CreditCardType,Expiry Month,Expiry Year and Enter Valid Cvv",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_Valid_FirstName_LastName_Billing_Address_CreditCardNo_and_Select_CreditCardType_Expiry_Month_Expiry_Year_and_Enter_Valid_Cvv()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User  click the Book Now Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_Book_Now_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify the OrderId is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_the_OrderId_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC02_Validation of Adactin WebPage with different credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Verify the SearchHotel Page is displayed",
  "keyword": "Given "
});
formatter.step({
  "name": "User Select Valid Details of Location\"\u003cLocation\u003e\",Hotel\"\u003cHotel\u003e\",RoomType\"\u003cRoomType\u003e\",Number of Rooms\"\u003cNumber of Rooms\u003e\", and enters the CheckIn Date ,CheckOut Date and Select the Adult Room\"\u003cAdult Room\u003e\" ,ChildRoom\"\u003cChildRoom\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User Click on Submit Button",
  "keyword": "Then "
});
formatter.step({
  "name": "User Verify the Select Hotel Page is Displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "User click the Select Radio Button and  click the Continue Button",
  "keyword": "And "
});
formatter.step({
  "name": "Useer Verify the Book A Hotel Page is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "User enter the Valid FirstName\"\u003cFirstName\u003e\",LastName\"\u003cLastName\u003e\",Billing Address\"\u003cBilling Address\u003e\",CreditCardNo\"\u003cCreditCardNo\u003e\" and Select CreditCardType\"\u003cCreditCardType\u003e\",Expiry Month\"\u003cExpiry Month\u003e\",Expiry Year\"\u003cExpiry Year\u003e\" and Enter Valid Cvv\"\u003cCvv\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User  click the Book Now Button",
  "keyword": "And "
});
formatter.step({
  "name": "User verify the OrderId is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Location",
        "Hotel",
        "RoomType",
        "Number of Rooms",
        "Adult Room",
        "ChildRoom",
        "FirstName",
        "LastName",
        "Billing Address",
        "CreditCardNo",
        "CreditCardType",
        "Expiry Month",
        "Expiry Year",
        "Cvv"
      ]
    },
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Standard",
        "1 - One",
        "1 - One",
        "0 - None",
        "Ranjith",
        "kumar",
        "Coimbatore",
        "1234567890123456",
        "American Express",
        "January",
        "2022",
        "321"
      ]
    },
    {
      "cells": [
        "Melbourne",
        "Hotel Sunshine",
        "Double",
        "2 - Two",
        "2 - Two",
        "1 - One",
        "Mahesh",
        "kumar",
        "Mayiladuthurai",
        "6543210987654321",
        "Master Card",
        "March",
        "2022",
        "123"
      ]
    },
    {
      "cells": [
        "Brisbane",
        "Hotel Hervey",
        "Deluxe",
        "4 - Four",
        "3 - Three",
        "2 - Two",
        "Kumar",
        "kumar",
        "Chennai",
        "7894561237894561",
        "American Express",
        "October",
        "2022",
        "321"
      ]
    },
    {
      "cells": [
        "London",
        "Hotel Cornice",
        "Super Deluxe",
        "5 - Five",
        "4 - Four",
        "3 - Three",
        "Jayakumar",
        "T",
        "Mayiladuthurai",
        "8523697412587415",
        "Master Card",
        "July",
        "2022",
        "555"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch browser and open the Adactinhotel WebPage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_browser_and_open_the_Adactinhotel_WebPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the valid userName and passWord",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_userName_and_passWord()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Click_on_login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC02_Validation of Adactin WebPage with different credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Verify the SearchHotel Page is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_Verify_the_SearchHotel_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Select Valid Details of Location\"Sydney\",Hotel\"Hotel Creek\",RoomType\"Standard\",Number of Rooms\"1 - One\", and enters the CheckIn Date ,CheckOut Date and Select the Adult Room\"1 - One\" ,ChildRoom\"0 - None\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_Select_Valid_Details_of_Location_Hotel_RoomType_Number_of_Rooms_and_enters_the_CheckIn_Date_CheckOut_Date_and_Select_the_Adult_Room_ChildRoom(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Submit Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_on_Submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify the Select Hotel Page is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Verify_the_Select_Hotel_Page_is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Select Radio Button and  click the Continue Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_Select_Radio_Button_and_click_the_Continue_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Useer Verify the Book A Hotel Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.useer_Verify_the_Book_A_Hotel_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the Valid FirstName\"Ranjith\",LastName\"kumar\",Billing Address\"Coimbatore\",CreditCardNo\"1234567890123456\" and Select CreditCardType\"American Express\",Expiry Month\"January\",Expiry Year\"2022\" and Enter Valid Cvv\"321\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_Valid_FirstName_LastName_Billing_Address_CreditCardNo_and_Select_CreditCardType_Expiry_Month_Expiry_Year_and_Enter_Valid_Cvv(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User  click the Book Now Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_Book_Now_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify the OrderId is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_the_OrderId_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch browser and open the Adactinhotel WebPage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_browser_and_open_the_Adactinhotel_WebPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the valid userName and passWord",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_userName_and_passWord()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Click_on_login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC02_Validation of Adactin WebPage with different credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Verify the SearchHotel Page is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_Verify_the_SearchHotel_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Select Valid Details of Location\"Melbourne\",Hotel\"Hotel Sunshine\",RoomType\"Double\",Number of Rooms\"2 - Two\", and enters the CheckIn Date ,CheckOut Date and Select the Adult Room\"2 - Two\" ,ChildRoom\"1 - One\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_Select_Valid_Details_of_Location_Hotel_RoomType_Number_of_Rooms_and_enters_the_CheckIn_Date_CheckOut_Date_and_Select_the_Adult_Room_ChildRoom(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Submit Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_on_Submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify the Select Hotel Page is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Verify_the_Select_Hotel_Page_is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Select Radio Button and  click the Continue Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_Select_Radio_Button_and_click_the_Continue_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Useer Verify the Book A Hotel Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.useer_Verify_the_Book_A_Hotel_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the Valid FirstName\"Mahesh\",LastName\"kumar\",Billing Address\"Mayiladuthurai\",CreditCardNo\"6543210987654321\" and Select CreditCardType\"Master Card\",Expiry Month\"March\",Expiry Year\"2022\" and Enter Valid Cvv\"123\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_Valid_FirstName_LastName_Billing_Address_CreditCardNo_and_Select_CreditCardType_Expiry_Month_Expiry_Year_and_Enter_Valid_Cvv(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User  click the Book Now Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_Book_Now_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify the OrderId is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_the_OrderId_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch browser and open the Adactinhotel WebPage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_browser_and_open_the_Adactinhotel_WebPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the valid userName and passWord",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_userName_and_passWord()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Click_on_login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC02_Validation of Adactin WebPage with different credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Verify the SearchHotel Page is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_Verify_the_SearchHotel_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Select Valid Details of Location\"Brisbane\",Hotel\"Hotel Hervey\",RoomType\"Deluxe\",Number of Rooms\"4 - Four\", and enters the CheckIn Date ,CheckOut Date and Select the Adult Room\"3 - Three\" ,ChildRoom\"2 - Two\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_Select_Valid_Details_of_Location_Hotel_RoomType_Number_of_Rooms_and_enters_the_CheckIn_Date_CheckOut_Date_and_Select_the_Adult_Room_ChildRoom(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Submit Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_on_Submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify the Select Hotel Page is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Verify_the_Select_Hotel_Page_is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Select Radio Button and  click the Continue Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_Select_Radio_Button_and_click_the_Continue_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Useer Verify the Book A Hotel Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.useer_Verify_the_Book_A_Hotel_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the Valid FirstName\"Kumar\",LastName\"kumar\",Billing Address\"Chennai\",CreditCardNo\"7894561237894561\" and Select CreditCardType\"American Express\",Expiry Month\"October\",Expiry Year\"2022\" and Enter Valid Cvv\"321\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_Valid_FirstName_LastName_Billing_Address_CreditCardNo_and_Select_CreditCardType_Expiry_Month_Expiry_Year_and_Enter_Valid_Cvv(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User  click the Book Now Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_Book_Now_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify the OrderId is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_the_OrderId_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch browser and open the Adactinhotel WebPage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_browser_and_open_the_Adactinhotel_WebPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the valid userName and passWord",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_userName_and_passWord()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_Click_on_login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC02_Validation of Adactin WebPage with different credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Verify the SearchHotel Page is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_Verify_the_SearchHotel_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Select Valid Details of Location\"London\",Hotel\"Hotel Cornice\",RoomType\"Super Deluxe\",Number of Rooms\"5 - Five\", and enters the CheckIn Date ,CheckOut Date and Select the Adult Room\"4 - Four\" ,ChildRoom\"3 - Three\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_Select_Valid_Details_of_Location_Hotel_RoomType_Number_of_Rooms_and_enters_the_CheckIn_Date_CheckOut_Date_and_Select_the_Adult_Room_ChildRoom(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Submit Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_on_Submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify the Select Hotel Page is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Verify_the_Select_Hotel_Page_is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Select Radio Button and  click the Continue Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_Select_Radio_Button_and_click_the_Continue_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Useer Verify the Book A Hotel Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.useer_Verify_the_Book_A_Hotel_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the Valid FirstName\"Jayakumar\",LastName\"T\",Billing Address\"Mayiladuthurai\",CreditCardNo\"8523697412587415\" and Select CreditCardType\"Master Card\",Expiry Month\"July\",Expiry Year\"2022\" and Enter Valid Cvv\"555\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_Valid_FirstName_LastName_Billing_Address_CreditCardNo_and_Select_CreditCardType_Expiry_Month_Expiry_Year_and_Enter_Valid_Cvv(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User  click the Book Now Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_Book_Now_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify the OrderId is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_the_OrderId_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});