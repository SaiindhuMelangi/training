package testmelogin11;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="dm12\\dm33.feature",glue= {"testmelogin11"},
plugin= {"html:target/cucumber112.html"},tags= {"@SmokeTest,@RegressionTest"})

public class run1 {

}
