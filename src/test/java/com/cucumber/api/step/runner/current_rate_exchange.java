package com.cucumber.api.step.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/CurrentExchangeRate.feature",
		glue="com.cucumber.api.step.definition",tags="@valid")// only scenarios will execute

public class current_rate_exchange {
	

}
