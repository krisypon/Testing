package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/features/login.feature",
			plugin = {"pretty", "html:cucumber-report/html-report.xml"},
			//tags = {"@positive"},
			glue = {"stepdefinitions"})
	
public class CucumbeRunner {	
	
}
