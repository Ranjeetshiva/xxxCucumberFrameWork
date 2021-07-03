Feature: Guess The Work

  @JuneRelease
  Scenario: Maker starts the game
    Given the Maker has started a game with the work "silky"
    When the Breaker joins the maker's game
    Then  the breaker must guess
