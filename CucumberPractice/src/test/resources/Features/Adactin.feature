Feature: Validation of AdactinHotel WebPage

  Background: 
    Given User launch browser and open the Adactinhotel WebPage
    When User enters the valid userName and passWord
    And User Click on login Button
@reg
  Scenario: TC01_Validation of OrderId which is created and displayed
    Given User Verify the SearchHotel Page is displayed
    When User Select Valid Details of Location,Hotel,RoomType,Number of Rooms, and enters the CheckIn Date ,CheckOut Date and Select the Adult Room ,ChildRoom
    Then User Click on Submit Button
    Then User Verify the Select Hotel Page is Displayed
    And User click the Select Radio Button and  click the Continue Button
    Then Useer Verify the Book A Hotel Page is displayed
    When User enter the Valid FirstName,LastName,Billing Address,CreditCardNo and Select CreditCardType,Expiry Month,Expiry Year and Enter Valid Cvv
    And User  click the Book Now Button
    Then User verify the OrderId is displayed
@smoke
  Scenario Outline: TC02_Validation of Adactin WebPage with different credentials
    Given User Verify the SearchHotel Page is displayed
    When User Select Valid Details of Location"<Location>",Hotel"<Hotel>",RoomType"<RoomType>",Number of Rooms"<Number of Rooms>", and enters the CheckIn Date ,CheckOut Date and Select the Adult Room"<Adult Room>" ,ChildRoom"<ChildRoom>"
    Then User Click on Submit Button
    Then User Verify the Select Hotel Page is Displayed
    And User click the Select Radio Button and  click the Continue Button
    Then Useer Verify the Book A Hotel Page is displayed
    When User enter the Valid FirstName"<FirstName>",LastName"<LastName>",Billing Address"<Billing Address>",CreditCardNo"<CreditCardNo>" and Select CreditCardType"<CreditCardType>",Expiry Month"<Expiry Month>",Expiry Year"<Expiry Year>" and Enter Valid Cvv"<Cvv>"
    And User  click the Book Now Button
    Then User verify the OrderId is displayed

    Examples: 
      | Location  | Hotel          | RoomType     | Number of Rooms | Adult Room | ChildRoom | FirstName | LastName | Billing Address | CreditCardNo     | CreditCardType   | Expiry Month | Expiry Year | Cvv |
      | Sydney    | Hotel Creek    | Standard     | 1 - One         | 1 - One    | 0 - None  | Ranjith   | kumar    | Coimbatore      | 1234567890123456 | American Express | January      |        2022 | 321 |
      | Melbourne | Hotel Sunshine | Double       | 2 - Two         | 2 - Two    | 1 - One   | Mahesh    | kumar    | Mayiladuthurai  | 6543210987654321 | Master Card      | March        |        2022 | 123 |
      | Brisbane  | Hotel Hervey   | Deluxe       | 4 - Four        | 3 - Three  | 2 - Two   | Kumar     | kumar    | Chennai         | 7894561237894561 | American Express | October      |        2022 | 321 |
      | London    | Hotel Cornice  | Super Deluxe | 5 - Five        | 4 - Four   | 3 - Three | Jayakumar | T        | Mayiladuthurai  | 8523697412587415 | Master Card      | July         |        2022 | 555 |
