package com.cucumber.api.step.definition;

import com.cucumber.api.step.implementation.HistoricalExchnageRateImplementation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.internal.org.jline.utils.Log;
import junit.framework.Assert;

public class HistoricalExchangeRate {
	
	HistoricalExchnageRateImplementation HistoricalExchnageRate;
	
	//Execute historical exchange rate api with valid URL
	@Given(" Given I want to execute Rates API for historical Foreign Exchange rates")
	public void historical_Exchange_rates()
	{
		Log.info("Execute historical exchange rate API");
		
	}
    
	@When("I submit the GET API request")
	public void submit_the_GET_API_request()
	{
		HistoricalExchnageRate.historical_exchange_rate();
		
	}
	
	@Then("^I validate the status code of API \"([^\"]*)\"$")
	public void validate_the_status_code(String status_code)throws Exception
	{
		//validate the status code

          int code=Integer.parseInt(status_code);

          Assert.assertEquals(code, 200);
		
	}
	
	//Execute historical exchange rate api with invalid URL
	
	@Given(" I want to execute historical Foreign Exchange rates API with invalid data")
	public void execute_historical_Foreign_Exchange_rates_API_with_invalid_data()
	{
		 Log.info("historical Foreign Exchange rates API with invalid data");	
	}
	
	@Then("I submit the GET request for invalid URL")
	public void GET_request_for_invalid_URL()
	{
		//hit GET request with invalid request URL
		HistoricalExchnageRate.historical_exchange_rate_invalidURL();
	}

}
