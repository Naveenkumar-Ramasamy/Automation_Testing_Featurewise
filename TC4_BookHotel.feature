@BookHotel
Feature: Verifying OMR Branch Hotel BookHotel Automation

  Scenario Outline: To validate the book Hotel page by booking without including GST and card type(debit) without special request
    Given User is on the OMR Branch Hotel page
    When User login "<userName>","<password>"
    Then User should verify sucess message after login "Welcome Vinoth"
    When User explore Hotels "<Select state>","<Select city>","<Select room type>","<Check In>","<Check Out>","<No.of room>","<No.of adults>" and "<No.of childrens>"
    Then User should verify sucess message after search Hotel "Select Hotel"
    When User select the first Hotel name and save the Hotel name,prize
    And User accept the alert message to select Hotel
    Then User should verify after select Hotel name sucess message "Book Hotel"
    When User add the guest details "<Select Salutation>","<FirstName>","<Lastname>", "<MobileNo>" and "<Email>"
    And User enter the payment details "<Card Type>"
      | selectCard  | selectCardType | cardNumber       | nameONCard | selectMonth | selectYear | CVV |
      | Debit Card  | Visa           | 5555555555552222 | vinoth     | August      |       2024 | 123 |
      | Debit Card  | Amex           | 5555555555552223 | vinoth     | September   |       2024 | 234 |
      | Debit Card  | Mastercard     | 5555555555552224 | vinoth     | October     |       2024 | 546 |
      | Debit Card  | Discover       | 5555555555552225 | vinoth     | November    |       2024 | 546 |
      | Credit Card | Visa           | 5555555555552223 | vinoth     | August      |       2024 | 123 |
      | Credit Card | Amex           | 5555555555552224 | vinoth     | September   |       2024 | 234 |
      | Credit Card | Mastercard     | 5555555555552225 | vinoth     | October     |       2024 | 546 |
      | Credit Card | Discover       | 5555555555552226 | vinoth     | November    |       2024 | 546 |
    Then User should verify sucess message after payment "Booking is Confirmed" and Order id is save and verify whether selected hotel is booked or not

    Examples: 
      | userName             | password  | Select state | Select city | Select room type | Check In   | Check Out  | No.of room | No.of adults | No.of childrens | Select Salutation | FirstName | Lastname | MobileNo   | Email                  | Card Type  |
      | 20naveenhz@gmail.com | Vino@1103 | Kerala       | Kochi       | Deluxe           | 2023-07-28 | 2023-07-29 | 2-Two      | 5-Five       |               1 | Mr.               | vinoth    | R        | 9159233813 | vinocandy547@gmail.com | Debit Card |

  Scenario Outline: To validate the book Hotel page by booking with including GST and card type(credit) witht special request
    Given User is on the OMR Branch Hotel page
    When User login "<userName>","<password>"
    Then User should verify sucess message after login "Welcome Vinoth"
    When User explore Hotels "<Select state>","<Select city>","<Select room type>","<Check In>","<Check Out>","<No.of room>","<No.of adults>" and "<No.of childrens>"
    Then User should verify sucess message after search Hotel "Select Hotel"
    When User select the first Hotel name and save the Hotel name,prize
    And User accept the alert message to select Hotel
    Then User should verify after select Hotel name sucess message "Book Hotel"
    When User add the guest details with gst "<Select Salutation>","<FirstName>","<Lastname>", "<MobileNo>" and "<Email>"
    And User enter the GST details "<Enter Registration No>","<Company Name>" and "<Company Address>"
    And User add the special request "ENJOY TRIP"
    And User enter the payment details "<Card Type>"
      | selectCard  | selectCardType | cardNumber       | nameONCard | selectMonth | selectYear | CVV |
      | Debit Card  | Visa           | 5555555555552222 | vinoth     | August      |       2024 | 123 |
      | Debit Card  | Amex           | 5555555555552223 | vinoth     | September   |       2024 | 234 |
      | Debit Card  | Mastercard     | 5555555555552224 | vinoth     | October     |       2024 | 546 |
      | Debit Card  | Discover       | 5555555555552225 | vinoth     | November    |       2024 | 546 |
      | Credit Card | Visa           | 5555555555552223 | vinoth     | August      |       2024 | 123 |
      | Credit Card | Amex           | 5555555555552224 | vinoth     | September   |       2024 | 234 |
      | Credit Card | Mastercard     | 5555555555552225 | vinoth     | October     |       2024 | 546 |
      | Credit Card | Discover       | 5555555555552226 | vinoth     | November    |       2024 | 546 |
    Then User should verify sucess message after payment "Booking is Confirmed" and Order id is save and verify whether selected hotel is booked or not

    Examples: 
      | userName             | password        | Select state | Select city | Select room type | Check In   | Check Out  | No.of room | No.of adults | No.of childrens | Select Salutation | FirstName | Lastname | MobileNo   | Email                  | Card Type   | Enter Registration No | Company Name           | Company Address |
      | 20naveenhz@gmail.com | Gokulapriya@555 | Kerala       | Kochi       | Deluxe           | 2023-07-28 | 2023-07-29 | 2-Two      | 5-Five       |               1 | Mr.               | vinoth    | R        | 9159233813 | vinocandy547@gmail.com | Credit Card |            9043592058 | Greens Tech OMR Branch | Thoraipakkam    |

  Scenario Outline: Without enter any field book Hotel and verifying error message
    Given User is on the OMR Branch Hotel page
    When User login "<userName>","<password>"
    Then User should verify sucess message after login "Welcome Vinoth"
    When User explore Hotels "<Select state>","<Select city>","<Select room type>","<Check In>","<Check Out>","<No.of room>","<No.of adults>" and "<No.of childrens>"
    Then User should verify sucess message after search Hotel "Select Hotel"
    When User select the first Hotel name and save the Hotel name,prize
    And User accept the alert message to select Hotel
    Then User should verify after select Hotel name sucess message "Book Hotel"
    When User add the guest details "<Select Salutation>","<FirstName>","<Lastname>", "<MobileNo>" and "<Email>"
    And User should verify without entering a card details "Please select your card type","Please select your card","Please provide your card number","Please provide name on your card","Please provide your Card Expiry Date","Please provide your Card's security code"

    Examples: 
      | userName             | password        | Select state | Select city | Select room type | Check In   | Check Out  | No.of room | No.of adults | No.of childrens | Select Salutation | FirstName | Lastname | MobileNo   | Email                  |
      | 20naveenhz@gmail.com | Gokulapriya@555 | Kerala       | Kochi       | Deluxe           | 2023-07-28 | 2023-07-29 | 2-Two      | 5-Five       |               1 | Mr.               | vinoth    | R        | 9159233813 | vinocandy547@gmail.com |
