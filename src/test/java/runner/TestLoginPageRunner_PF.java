package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
//@CucumberOptions(features={"src/test/java/featurefiles/logindemo.feature"},glue={"stepdefinationfiles"},dryRun =true)
@CucumberOptions(
        features = {"src/test/java/featurefiles/LoginDemo.feature"},
        glue = {"steps"},
        monochrome = true,
        plugin = {"pretty", "junit:target/JunitReports/report.xml",
                "json:target/JSONReports/report.json", "html:target/HTMLReports"}
)

public class TestLoginPageRunner_PF {
}
