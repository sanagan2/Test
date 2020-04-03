 package com.qa.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions
	(
			features="/Users/sanagan2/eclipse-workspace/Jmhworkday/JMH_workday/src/main/java/com/qa/features/login.feature",
			glue= {"com/qa/stepdefinations"},
			format= {"pretty","html:test-output","json:json_output/cucmber.json","junit:junit_xml/cucumber.xml"},
			tags= {"@tag1"},
			monochrome = true,
			strict = true,
			dryRun = false
			)
			
	
public class TestRunner{
}

	
	
	


