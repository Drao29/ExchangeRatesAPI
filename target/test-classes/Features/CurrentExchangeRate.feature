@CurrentExchangeRate
Feature: Rates API for Latest Foreign Exchange rates

  @valid
  Scenario Outline: Validate latest exchange rate API with valid data
    Given I want to execute Rates API for Latest Foreign Exchange rates
    When I submit the GET request
    Then I validate the status code "200"

    Examples: 
      | TC_id | base | symbol |
      | TC_01 | USD  | GBP    |
      | TC_02 | GBP  |        |
      | TC_03 |      | EUR    |

  @invalid
  Scenario Outline: Validate latest exchange rate API with invalid data
    Given I want to execute Rates API for Latest Foreign Exchange rates with invalid data
    When I submit the GET request with invalid data
    Then I validate the status code <status_code>

    Examples: 
      | TC_id | base | symbol | status_code |
      | TC_01 | USD  | GBP    |         400 |
      | TC_02 | USD  | GBP    |         500 |
