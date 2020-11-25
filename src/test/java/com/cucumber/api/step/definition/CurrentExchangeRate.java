package com.cucumber.api.step.definition;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

import com.cucumber.api.step.implementation.CurrentExchangeRateImplementation;
import com.qa.base.TestBase;

import io.restassured.RestAssured;

import io.restassured.response.Response;

import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import jdk.internal.org.jline.utils.Log;
import junit.framework.Assert;
import io.cucumber.core.*;
import io.cucumber.core.api.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CurrentExchangeRate {
	 RequestSpecification request;
	 TestBase url=new TestBase();
	 CurrentExchangeRateImplementation currectexrate;
	
	 @Given("I want to execute Rates API for Latest Foreign Exchange rates")
	 public void i_want_to_execute_rates_api_for_latest_foreign_exchange_rates() {
		 Log.info("Execute latest exchnage rate API");
	    
	 }
 
	@When("^I submit the GET request$")
	public void submit_the_GET_request() throws Exception
	{
		// hit GET request with valid URL
		currectexrate.current_exchange_rate();
           	
	}
	
	@Then("^I validate the status code \"([^\"]*)\"$")
	public void validate_the_status_code(String status_code)throws Exception
	{
		//validate the status code

          int code=Integer.parseInt(status_code);

          Assert.assertEquals(code, 200);
		
	}
	
	//validate api response with invalid data
	
	@Given(" I want to execute Rates API for Latest Foreign Exchange rates with invalid data")
	public void execute_Rates_API_with_invalid_data()
	{
		 Log.info("Execute latest exchnage rate API with invalid data");	
	}
	
	@Then("I submit the GET request with invalid data")
	public void GET_request_with_invalid_data()
	{
		//hit GET request with invalid request URL
		currectexrate.current_exchange_rate_invalid();
	}

	}


