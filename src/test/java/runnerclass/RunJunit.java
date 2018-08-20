package runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = { "src/test/java/features" }, glue = {"pages","runnerclass"},dryRun=true,tags="@smoke",plugin= {"html:target/report"} ,monochrome = true)
	public class RunJunit {

	}
