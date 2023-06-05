package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Automation Training\\Cucumber_Raghav\\src\\test\\resources\\Features\\UsingTags.feature",
glue="StepDefinitions",
tags="@Smoke")
public class RunnerforTags {

}
