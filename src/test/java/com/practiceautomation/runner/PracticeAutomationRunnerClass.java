package com.practiceautomation.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions 
	(
		features = "src/main/resources/Feature/TestCase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
         tags = {"@TC_15_Placing_the_order"},
		glue = {"com.practiceautomation.stepdefinition"},
		monochrome = true
	)
public class PracticeAutomationRunnerClass 
{

}
