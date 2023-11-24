@Explore
Feature: Verifying OMR Branch Hotel ExploreHotel Automation

  Scenario Outline: Verifying Select Hotel with valid credentials
    Given User is on the OMR Branch Hotel page
    When User login "<userName>","<password>"
    Then User should verify sucess message after login "Welcome Vinoth"
    When User explore Hotels "<Select state>","<Select city>","<Select room type>","<Check In>","<Check Out>","<No.of room>","<No.of adults>" and "<No.of childrens>"
    Then User should verify sucess message after search Hotel "Select Hotel"

    Examples: 
      | userName             | password        | Select state | Select city | Select room type | Check In   | Check Out  | No.of room | No.of adults | No.of childrens |
      | 20naveenhz@gmail.com | Gokulapriya@555 | Kerala       | Kochi       | Deluxe           | 2023-07-28 | 2023-07-29 | 2-Two      | 5-Five       |               1 |

  Scenario Outline: Verifying Select Multiple room type and verifying same filter is header
    Given User is on the OMR Branch Hotel page
    When User login "<userName>","<password>"
    Then User should verify sucess message after login "Welcome Vinoth"
    When User explore Hotels "<Select state>","<Select city>","<Select room type>","<Check In>","<Check Out>","<No.of room>","<No.of adults>" and "<No.of childrens>"
    Then User should verify sucess message after search Hotel "Select Hotel"
    And User should verify the room type filters displayed "<Select room type>"

    Examples: 
      | userName             | password        | Select state | Select city | Select room type    | Check In   | Check Out  | No.of room | No.of adults | No.of childrens |
      | 20naveenhz@gmail.com | Gokulapriya@555 | Kerala       | Kochi       | Deluxe/Suite/Luxury | 2023-07-28 | 2023-07-29 | 2-Two      | 5-Five       |               1 |

  Scenario Outline: Verifying passing room type and verfiying Hotel name ends with same room type
    Given User is on the OMR Branch Hotel page
    When User login "<userName>","<password>"
    Then User should verify sucess message after login "Welcome Vinoth"
    When User explore Hotels "<Select state>","<Select city>","<Select room type>","<Check In>","<Check Out>","<No.of room>","<No.of adults>" and "<No.of childrens>"
    Then User should verify sucess message after search Hotel "Select Hotel"
    And User should verify whether the selected room type is displayed and all the Hotel names end with "<Select room type>"

    Examples: 
      | userName             | password        | Select state | Select city | Select room type | Check In   | Check Out  | No.of room | No.of adults | No.of childrens |
      | 20naveenhz@gmail.com | Gokulapriya@555 | Kerala       | Kochi       | Deluxe           | 2023-07-28 | 2023-07-29 | 2-Two      | 5-Five       |               1 |

  Scenario Outline: Verifying without enter any field click search and verifying all Six error message
    Given User is on the OMR Branch Hotel page
    When User login "<userName>","<password>"
    Then User should verify sucess message after login "Welcome Vinoth"
    When User click the Hotel search button without selecting any fields
    Then User should verify without entering any search fields error message "Please select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | userName             | password        |
      | 20naveenhz@gmail.com | Gokulapriya@555 |
