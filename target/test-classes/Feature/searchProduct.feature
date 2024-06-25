Feature: Search and place orderfor product

  @SearchProduct
  Scenario Outline: Search experience for product in both home page and product page
    Given user is on greencart landing page
    When user  searched with short name called <name> and extract for product
    Then user go and search in same shortname <name> in offer page check if product exists

    Examples: 
      | name |
      | Tom  |
      | Ban  |
      | bri  |
