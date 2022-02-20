Feature: user should be able to add products to the cart and total price of the cart must be equal to the product prices.

  Scenario:
    Given user goes to amazon page
    Then searches a keyword "phone"
    Then adds some products to the cart
    And goes to the cart
    Then sees total price is correct