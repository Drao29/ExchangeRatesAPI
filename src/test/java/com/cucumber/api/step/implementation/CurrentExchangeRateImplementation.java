package com.cucumber.api.step.implementation;

import org.apache.http.HttpStatus;

import com.cucumber.api.step.definition.CurrentExchangeRate;
import com.qa.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;


public class CurrentExchangeRateImplementation {
	
    TestBase url=new TestBase();
    public ValidatableResponse response;
    
    
	
	public void current_exchange_rate()
	{
		 RestAssured.baseURI=url.getbaseURL();
		 response=RestAssured.given().log().all().when().log().all().get("/latest").then().log().all().assertThat().statusCode(200);
		 
	}
	
	public void current_exchange_rate_invalid()
	{
		 RestAssured.baseURI=url.getbaseURL();
		response=RestAssured.given().log().all().when().log().all().get("/lat").then().log().all().assertThat().statusCode(400);
			 
	}

	public void validStatusCode() {
	
  //int statuscode=response.getStatuscode();
  //Assert.assertEquals(200, statuscode);
	}
	
	
	
	

}
