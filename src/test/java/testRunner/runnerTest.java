package testRunner;
 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "Features"//"@target/rerun.txt" //
 ,glue={"stepDefinition"}
 , tags = {"@smoke"}
 , plugin = { "pretty", "html:target/cucumber-reports", "rerun:target/rerun.txt"},
 monochrome = true
 )
 
public class runnerTest  {
	
}