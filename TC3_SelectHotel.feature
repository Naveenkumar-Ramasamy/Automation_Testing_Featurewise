@SelectHotel
Feature: Verifying OMR Branch Hotel SelectHotel Automation

  Scenario Outline: Select Hotel and verifying navigate to book Hotel
    Given User is on the OMR Branch Hotel page
    When User login "<userName>","<password>"
    Then User should verify sucess message after login "Welcome Vinoth"
    When User explore Hotels "<Select state>","<Select city>","<Select room type>","<Check In>","<Check Out>","<No.of room>","<No.of adults>" and "<No.of childrens>"
    Then User should verify sucess message after search Hotel "Select Hotel"
    When User select the first Hotel name and save the Hotel name,prize
    And User accept the alert message to select Hotel
    Then User should verify after select Hotel name sucess message "Book Hotel"

    Examples: 
      | userName               | password  | Select state | Select city | Select room type | Check In   | Check Out  | No.of room | No.of adults | No.of childrens |
      | 20naveenhz@gmail.com | Gokulapriya@555  | Kerala       | Kochi       | Deluxe           | 2023-07-28 | 2023-07-29 | 2-Two      | 5-Five       |               1 |

  Scenario Outline: Select Hotel and verifying navigating in the same page upon dismiss the alter
    Given User is on the OMR Branch Hotel page
    When User login "<userName>","<password>"
    Then User should verify sucess message after login "Welcome Vinoth"
    When User explore Hotels "<Select state>","<Select city>","<Select room type>","<Check In>","<Check Out>","<No.of room>","<No.of adults>" and "<No.of childrens>"
    Then User should verify sucess message after search Hotel "Select Hotel"
    When User select the first Hotel name and save the Hotel name,prize
    And User dismiss the alert message
    Then User should verify after select Hotel name it remain same page sucess message "Select Hotel"

    Examples: 
      | userName               | password  | Select state | Select city | Select room type | Check In   | Check Out  | No.of room | No.of adults | No.of childrens |
      | 20naveenhz@gmail.com | Gokulapriya@555  | Kerala       | Kochi       | Deluxe           | 2023-07-28 | 2023-07-29 | 2-Two      | 5-Five       |               1 |

  Scenario Outline: Enter all fields and verify select Hotel and sort name by ascending order
    Given User is on the OMR Branch Hotel page
    When User login "<userName>","<password>"
    Then User should verify sucess message after login "Welcome Vinoth"
    When User explore Hotels "<Select state>","<Select city>","<Select room type>","<Check In>","<Check Out>","<No.of room>","<No.of adults>" and "<No.of childrens>"
    Then User should verify sucess message after search Hotel "Select Hotel"
    When User click name ascending radio button
    Then User should verify Hotel name in ascending order

    Examples: 
      | userName               | password  | Select state | Select city | Select room type | Check In   | Check Out  | No.of room | No.of adults | No.of childrens |
      | 20naveenhz@gmail.com | Gokulapriya@555  | Kerala       | Kochi       | Deluxe           | 2023-07-28 | 2023-07-29 | 2-Two      | 5-Five       |               1 |

  Scenario Outline: Verifying Unselect room type and  listing all hotles
    Given User is on the OMR Branch Hotel page
    When User login "<userName>","<password>"
    Then User should verify sucess message after login "Welcome Vinoth"
    When User explore Hotels "<Select state>","<Select city>","<Select room type>","<Check In>","<Check Out>","<No.of room>","<No.of adults>" and "<No.of childrens>"
    Then User should verify sucess message after search Hotel "Select Hotel"
    When User unselect the room type by click the room type radio button
    Then User should verify whether all Hotel names are displayed

    Examples: 
      | userName               | password  | Select state | Select city | Select room type | Check In   | Check Out  | No.of room | No.of adults | No.of childrens |
      | 20naveenhz@gmail.com | Gokulapriya@555  | Kerala       | Kochi       | Deluxe           | 2023-07-28 | 2023-07-29 | 2-Two      | 5-Five       |               1 |
