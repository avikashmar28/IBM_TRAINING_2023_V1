package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/features/module1"
		,glue= {"stepdefinitions"},
		plugin= {
				"html:reporting/cucumberHTMLReports/sanity"
		}
		
		
)
public class Module1Runner {

}
