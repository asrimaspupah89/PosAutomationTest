package Category;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/Category/deleteCategory.feature", 
		glue= {"Category", "StepDefinition"}, 
		monochrome=true, 
		plugin= {"pretty", 
				"html:target/reports/cucumber.html", 
				"json:target/reports/cucumber.json", 
				"junit:target/reports/cucumber.xml" }, 
		tags = "@DeleteCategoryScenario"
		)

public class TestRunnerDeleteCategory {

}
