@Login
Feature: Verifying OMR Branch Hotel Login Automation

  Scenario Outline: Verifying login with valid credentials
    Given User is on the OMR Branch Hotel page
    When User login "<userName>","<password>"
    Then User should verify sucess message after login "Welcome Vinoth"

    Examples: 
      | userName             | password        |
      | 20naveenhz@gmail.com | Gokulapriya@555 |

  Scenario Outline: Verifying login with valid credentials using ENTER key
    Given User is on the OMR Branch Hotel page
    When User login "<userName>","<password>" with Enter key
    Then User should verify sucess message after login "Welcome Vinoth"

    Examples: 
      | userName             | password        |
      | 20naveenhz@gmail.com | Gokulapriya@555 |

  Scenario Outline: Verifying login with invalid credentials
    Given User is on the OMR Branch Hotel page
    When User login "<userName>","<password>"
    Then User should verify error message after login "Invalid Login details or Your password might have expired."

    Examples: 
      | userName             | password    |
      | 20naveenhz@gmail.com | Gokulapriya |
