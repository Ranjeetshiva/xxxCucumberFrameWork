

//Cucumber API
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src/test/resources/features",
        glue="StepDefinitions",
        tags="@JuneRelease",
        plugin = {"pretty",
                "html:target/cucumber-reports",
                "json:target/cucumber.json"
        }

)

public class CukesTestRunner{

}
