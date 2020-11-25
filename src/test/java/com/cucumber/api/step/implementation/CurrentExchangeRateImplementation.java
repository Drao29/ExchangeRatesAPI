package com.cucumber.api.step.implementation;

import com.cucumber.api.step.definition.CurrentExchangeRate;
import com.qa.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;


public class CurrentExchangeRateImplementation {
	
    TestBase url=new TestBase();
    public ValidatableResponse validateresponse;
	
	public void current_exchange_rate()
	{
		 RestAssured.baseURI=url.getbaseURL();
		 validateresponse=RestAssured.given().log().all().when().log().all().get("/latest").then().log().all();
		
	}
	
	public void current_exchange_rate_invalid()
	{
		 RestAssured.baseURI=url.getbaseURL();
		 validateresponse=RestAssured.given().log().all().when().log().all().get("/lat").then().log().all();
		
	}
	
	

}
