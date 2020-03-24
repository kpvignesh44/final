package com.practiceautomation.runner;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/resources/Feature/TestCase.feature",
plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport"},
//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
glue = {"com.practiceautomation.stepdefinition"},
monochrome = true
)

public class TestRunner {
	
//		@AfterClass
//	    public static void writeExtentReport() {
//	        Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
//	    }
	
}
