Feature: As A User I Want To Verify All The Banking Functionalities

  Background: I Am On The Home Page

  @sanity @regression
  Scenario Outline: Verify That Bank Manager Can Add A New Customer Successfully
    When I Click On Bank Manager Login Button
    And I Click On Add Customer Button
    And I Enter "<firstName>" Into First Name Field
    And I Enter "<lastName>" Into Last Name Filed
    And I Enter "<postCode>" Into Postcode Field
    And I Click On The Add Customer Button
    Then I Can Verify The Customer Successfully Added Text In The Alert Box
    Examples:
      | firstName | lastName | postCode |
      | James     | Bond     | SW11 2JB |

  @sanity @regression
  Scenario Outline: Verify That Bank Manager Can Open A New Account Successfully
    When I Click On Bank Manager Login Button
    And I Click On Open Account Button
    And I Select The "<customer>" From Customer Drop Down
    And I Select The "<currency>" From Currency Drop Down
    And I Click On Process Button
    Then I Can Verify The Account Creation Confirmation Text
    Examples:
      | customer         | currency |
      | Hermoine Granger | Pound    |

  @smoke @regression
  Scenario Outline: Verify That Customer Can Login And Logout Successfully
    When I Click On Customer Login Button
    And I Select "<customer>" From Customer Drop Down
    And I Click On Login Button
    And I Verify That The Logout Tab Is Displayed
    And I Click On The Logout Tab
    Then I Can Verify That Your Name Text Is Displayed
    Examples:
      | customer         |
      | Hermoine Granger |

  @smoke @regression
  Scenario Outline: Verify That Customer Can Deposit Money Into Their Account Successfully
    When I Click On Customer Login Button
    And I Select "<customer>" From The Customer Drop Down
    And I Click On Login Button
    And I Click On The Deposit Button
    And I Enter The "<amount>" Into Amount Field
    And I Click On Deposit Button
    And I Can Verify The Successful Deposit Message Text
    Examples:
      | customer         | amount |
      | Hermoine Granger | 100    |

  @regression
  Scenario Outline: Verify That Customer Can Withdraw Money From Their Account Successfully
    When I Click On Customer Login Button
    And I Choose "<customer>" From Customer Drop Down
    And I Click On Login Button
    And I Click On Withdraw Button
    And I Enter The "<amount>" Into Amount Field
    And I Click On Withdraw Button After Entering The Amount
    Then I Can Verify That Transaction Successful Message Text
    Examples:
      | customer         | amount |
      | Hermoine Granger | 50     |