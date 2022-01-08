Feature: Validation of OrderId Creation In Adactin WebPage

  Scenario: TC01_Validation of OrderId whch is created and displayed
    Given I want to launch browser and navigate to Adactin WebPage
    When I enter Valid UserName and Valid Password
    And I click on Login Button
    Then I want to verify the Search Hotel Page is displayed
    Then I want to select the valid Details of Location,Hotel,RoomType,Number of Rooms and  Enter the CheckIn,CheckOut Dates and Select the valid adult room and Child Room
    And I want to click the Submit Button
    Then I want to verify the Select Hotel  Page is displayed
    And I want to click the Select Radio Button and  click the Continue Button
    Then I want to Verify the Book A Hotel Page is displayed
    When I enter the Valid FirstName,LastName,Billing Address,CreditCardNo and Select CreditCardType,Expiry Month,Expiry Year and Enter Valid Cvv
    And I want to  click the Book Now Button
    Then I want to verify the OrderId is displayed

  Scenario Outline: TC02_Validation of Adactin Web Page with different Credentials
    Given I want to launch browser and navigate to Adactin WebPage
    When I enter Valid UserName and Valid Password
    And I click on Login Button
    Then I want to verify the Search Hotel Page is displayed
    Then I want to select the valid Details of "<Location>","<Hotel>","<RoomType>","<NumberofRooms>" and  Enter the CheckIn,CheckOut Dates and Select the valid "<adult room>" and "<Child Room>"
    And I want to click the Submit Button
    Then I want to verify the Select Hotel  Page is displayed
    And I want to click the Select Radio Button and  click the Continue Button
    Then I want to Verify the Book A Hotel Page is displayed
    When I enter the Valid "<FirstName>","<LastName>","<Billing Address>","<CreditCardNo>" and Select "<CreditCardType>","<Expiry Month>","<Expiry Year>" and "<Enter Cvv>"
    And I want to  click the Book Now Button
    Then I want to verify the OrderId is displayed

    Examples: 
      #	1								2																	3											4												5										6									1						2											3														4											5													6													7							8
      | Location  | Hotel          | RoomType     | NumberofRooms | adult room | Child Room | FirstName | LastName | Billing Address | CreditCardNo     | CreditCardType   | Expiry Month | Expiry Year | Enter Cvv |
      | Sydney    | Hotel Creek    | Standard     | 1 - One       | 1 - One    | 0 - None   | Ranjith   | kumar    | Coimbatore      | 1234567890123456 | American Express | January      |        2022 |       321 |
      | Melbourne | Hotel Sunshine | Double       | 2 - Two       | 2 - Two    | 1 - One    | Mahesh    | kumar    | Mayiladuthurai  | 6543210987654321 | Master Card      | March        |        2022 |       123 |
      | Brisbane  | Hotel Hervey   | Deluxe       | 4 - Four      | 3 - Three  | 2 - Two    | Kumar     | kumar    | Chennai         | 7894561237894561 | American Express | October      |        2022 |       321 |
      | London    | Hotel Cornice  | Super Deluxe | 5 - Five      | 4 - Four   | 3 - Three  | Jayakumar | T        | Mayiladuthurai  | 8523697412587415 | Master Card      | July         |        2022 |       555 |
