package runner;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import java.io.IOException;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/testCases"},
        tags = "@MicrosoftProductPricesValidation",
        plugin = {"json:target/cucumber-json","html:target/cucumber-pretty"},
        glue = "stepDefinitions"
)
public class TestRunner {

    @BeforeClass
    public static void beforeClass() throws IOException{
        System.setProperty("environment", "PROD");
    }
}
