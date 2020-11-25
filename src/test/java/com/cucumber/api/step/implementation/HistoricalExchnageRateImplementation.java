package com.cucumber.api.step.implementation;
import com.cucumber.api.step.definition.HistoricalExchangeRate;
import com.qa.base.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class HistoricalExchnageRateImplementation {
	
	
	   TestBase url=new TestBase();
	    ValidatableResponse validateresponse;
		
		public void historical_exchange_rate()
		{
			 RestAssured.baseURI=url.getbaseURL();
			 validateresponse=RestAssured.given().log().all().when().log().all().get("/2020-11-25").then().log().all().assertThat().statusCode(200);
			
		}

		
		public void historical_exchange_rate_invalidURL()
		{
			 RestAssured.baseURI=url.getbaseURL();
			 validateresponse=RestAssured.given().log().all().when().log().all().get("/2020-11-25").then().log().all().assertThat().statusCode(400);
			
		}
}
