package ui.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        tags = "@spoti",
        glue = "ui/stepDefinitions",
        features = "src/test/resources/features",
        dryRun = false,
        plugin = {
                "html:src/reports/html_report.html"
        }

)
public class ParallelTestRunner extends AbstractTestNGCucumberTests {

        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {

                return super.scenarios();
                git
        }
}


