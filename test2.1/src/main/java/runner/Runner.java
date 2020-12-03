package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="C:/Users/Sgone/eclipse-workspace/test2.1/features/test.feature",
	glue= {"stepdef"},
	dryRun=false
)

public class Runner {

}

