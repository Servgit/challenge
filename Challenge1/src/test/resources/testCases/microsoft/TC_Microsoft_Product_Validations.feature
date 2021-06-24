Feature: Microsoft product prices in website

  @MicrosoftProductPricesValidation
  Scenario: Microsoft product price validations over Microsoft website
    Given Launch the browser
    When Go to Microsoft website homepage
    Then Validate all the menu items are present
    * Go to Windows
    * Click on Windows ten menu
    * Print all elements in the dropdown
    * Go to Search next to the shopping Cart
    * Search for Visual studio
    * Print the price for the three first elements listed in Software result list
    * Click on the first one to go to the details page
    * Once in the details page, validate both prices are the same
    * Click Add To Cart
    * Verify all three price amounts are the same
    * On the number of items dropdown select twenty and validate the Total amount is Unit Price times twenty
    And Close browser