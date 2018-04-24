package CucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features= {"src/main/java/cucumberPOM/Tagging.feature"},glue= {"hooksPack","pages"},tags= {"@S.*"}, monochrome = true)
@RunWith(Cucumber.class)
public class RunnerClassPOM {

}
