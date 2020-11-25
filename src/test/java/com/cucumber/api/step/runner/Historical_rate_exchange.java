package com.cucumber.api.step.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/HistoricalExchangeRate.feature",
		glue="com.cucumber.api.step.definition")

public class Historical_rate_exchange {

}
