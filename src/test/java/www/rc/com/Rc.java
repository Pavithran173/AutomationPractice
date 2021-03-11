package www.rc.com;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\www\\feature\\com\\Fs.feature", glue="www.sd.com")
public class Rc {

}
