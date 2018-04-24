package cucumberrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/main/java/week7/cucumber/CreateLead.feature"},glue="featuresImplementation")
public class runfeature {

}
