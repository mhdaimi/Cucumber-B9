package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/resources/features/AmazonSearch.feature"},
		glue = "stepDefinition",
		monochrome = true,
		plugin = {"pretty", "summary", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"html:test-output/html_report.html", "json:test-output/json_report.json"},
		tags = "@data-driven"
		)


public class TestRunner {

}
