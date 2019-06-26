package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\feature", 
		tags = "@Login,@Overview,@AgentSetup,@Discover,@Plan",
		glue = "SeleniumGlueCode")

public class testrunner {

}
