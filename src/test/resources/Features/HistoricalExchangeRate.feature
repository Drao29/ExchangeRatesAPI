@CurrentExchangeRate
Feature: Rates API for Historical Foreign Exchange rates

  @valid
  Scenario Outline: Validate historical exchange rate API with valid data
    Given I want to execute Rates API for historical Foreign Exchange rates
    When I submit the GET API request
    Then I validate the status code of API "200"

    Examples: 
      | TC_id | base | symbol | date       |
      | TC_01 | USD  | GBP    | 2020-11-24 |
      | TC_02 | GBP  |        | 2020-11-24 |
      | TC_03 |      | EUR    | 2020-11-24 |

  @invalid
  Scenario Outline: Validate historical exchange rate API with invalid data
    Given I want to execute historical Foreign Exchange rates API with invalid data
    When I submit the GET request for invalid URL
    Then I validate the status code <status_code>

    Examples: 
      | TC_id | base | symbol | status_code | date       |
      | TC_01 | USD  | GBP    |         400 | 2020-11-24 |
      | TC_02 | EUR  | GBP    |         400 | 24-11-2020 |
      | TC_03 | USD  | GBP    |         500 | 2020-11-24 |
