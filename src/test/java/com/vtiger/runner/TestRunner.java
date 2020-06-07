package com.vtiger.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/com/vtiger/features/Login.feature"
		,glue= {"com.vtiger.stepdefinition"},
		
		//format={"pretty","html:target/Destination"},
		plugin= {"pretty","json:target/cucmber.json"},
		tags= {"@Smoke"},
		//tags={"@Sanity,@Regression"}  this is for or condition
		//tags={"@Sanity","@Regression"} this is for and condition
		//tags={"@Sanity","~@Regression"} this  is will exclude regression with not symbol
		//tags={"~@Sanity","~@Regression"} this  is will exclude both  with not symbol
		monochrome=true)

public class TestRunner {

}
