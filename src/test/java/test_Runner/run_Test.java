package test_Runner;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "pretty", "html:src/test/java/reports" }, // to print the reports in HTML format
//		format={"pretty","json:src/test/java/reports/report.json"}, // to Print the report in JSon Format
//		format={"pretty","junit:src/test/java/reports/report.xml"}, // to Print JUnit reports in XML Format 
//		dryRun = true, // Check if all the Steps have the Step Definition, it has 2 Values true and false
		features = "Features", // to locate the file in Project Folder
		glue = { "stepDefinations" }, // to locate Step Definition file in Project Folder
//		tags = { "@Functional_Test" }, // to Use to execute the specific Feature.
		tags={"@dataTable"}, // to execute specific scenario.
//		tags={"@Working_With_Widgets,@Login_Scenario"}, // to execute specified OR scenario. OR means scenarios that are tagged either as @SmokeTest OR @RegressionTest.
//		tags={"@Working_With_Widgets","@Login_Scenario"}, // to execute specific AND scenario. There are only two scenarios in our feature file which have both tags together.
//		tags={"@Working_With_Widgets","~@Login_Scenario"}, // to ignore specific scenario. This is AND condition, which means all the scenarios tagged as @FunctionalTest but not @SmokeTest. So total tests are 15 and smoke tests are 6, so it ran just 9 tests.
//		tags={"~@Working_With_Widgets","~@Login_Scenario"}, // to ignore specific scenario. Execute all tests which are not at all tagged in all the Features

		monochrome = true // to get the Console output in readable form, it has 2 values true and false
)

public class run_Test {

}
