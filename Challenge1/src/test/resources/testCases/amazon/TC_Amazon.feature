Feature: Amazon test with API

  @AmazonRegistrationAndEchoSupport
  Scenario: Amazon Registration and Echo Support
    Given Launch the browser
    When Go to Amazon main page
    Then Locate upper right corner button Hello, sign in Account & lists
    * Click on “New customer? Start right here”
    * Fill Name field with the response of this API => [Options in the AC]
    * Fill Email field with the data from the API response Firstname.Lastname@fake.com
    * Click on Condition of Use link
    * Locate the search bar and Search for Echo
    * Locate “Echo support” options and click on it
    * Following elements should be displayed: Getting Started, Wi-Fi and Bluetooth, Device Software and Hardware, TroubleShooting
    And Close browser

