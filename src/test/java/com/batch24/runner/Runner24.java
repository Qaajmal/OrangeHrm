package com.batch24.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = "src/test/resources", // THE LOCATION TO SAVE THE FEATURE FILE
		glue= {"com.Orange"}, // PAKAGE NAME OF YOUR STEP DEFINITION
		tags = {"@batch24"},//Tag from the feature file
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, // report plug in 
		monochrome = true
		
		)

public class Runner24 {

}
