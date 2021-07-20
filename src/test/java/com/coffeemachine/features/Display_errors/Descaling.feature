Feature: Descaling


  Scenario: Descaling is needed after 500 coffees
    Given I handle coffee grounds
    And I handle water tank
    And I handle beans
    When I take "500" coffees
    Then message "Descaling" should be displayed
