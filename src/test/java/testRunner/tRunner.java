package testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./Features/PatientRegistration.feature",    // Path to .feature files
        glue = {"stepDefinition"}                               // Package of step definition
        
)

public class tRunner {
	
}
