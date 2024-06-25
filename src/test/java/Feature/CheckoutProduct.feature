Feature: Checking out a product

  @OrderProduct
  Scenario Outline: searching a product and proceed to checkout
    Given user is on greencart landing page
    When user  searched with short name called <name> and extract for product
    And Add quantity of product
    And Click on add to acrt
    And Click on proceed to checkout
    Then Verify Product detais
    And verify place Order and Apply buttons are displayed
    And Proceeds to checkout

    Examples: 
      | name   |
      | tom    |
      | cucu    |
      | banana |
