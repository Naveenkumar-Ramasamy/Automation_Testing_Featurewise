@CancelBooking
Feature: Verifying OMR Branch Hotel CancelBooking Automation

  Scenario Outline: To validate booked Hotel by editing and then cancelling the booking
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
    When User navigates to My Bookings page
    Then User verify success message "Bookings" after navigate into my bookings page
    When User enter and search the generated order id
    Then User should verify the same order id or not
    And User should verify the same Hotel name or not
    And User should verify the same price or not
    When User click the cancel button
    Then User should verify success message after cancel the booking "Your booking cancelled successfully"

    Examples: 
      | userName             | password        | Select state | Select city | Select room type | Check In   | Check Out  | No.of room | No.of adults | No.of childrens | Card Type   | Select Salutation | FirstName | Lastname | MobileNo   | Email                  |
      | 20naveenhz@gmail.com | Gokulapriya@555 | Kerala       | Kochi       | Deluxe           | 2023-07-27 | 2023-07-28 | 2-Two      | 5-Five       |               1 | Credit Card | Mr.               | vinoth    | R        | 9159233813 | vinocandy547@gmail.com |
