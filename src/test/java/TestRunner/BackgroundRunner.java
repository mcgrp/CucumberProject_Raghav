package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Automation Training\\Cucumber_Raghav\\src\\test\\resources\\Features\\UsingBackground.feature",
glue="Background",
monochrome=true,
plugin= {"json:target/cucumber.json"})
public class BackgroundRunner {
	
	
			                        
	

}
