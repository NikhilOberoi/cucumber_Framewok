package test_Runner;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format={"pretty","html:src/test/java/reports"}, // to print the reports in HTML format
//		format={"pretty","json:src/test/java/reports/report.json"}, // to Print the report in JSon Format
//		format={"pretty","junit:src/test/java/reports/report.xml"}, // to Print JUnit reports in XML Format 
//		dryRun = true, // Check if all the Steps have the Step Definition, it has 2 Values true and false
		features="Features", // to locate the file in Project Folder
		glue= {"stepDefinations"}, // to locate Step Definition file in Project Folder
		tags={"@Working_With_Widgets"}, // to Use to execute the specific Feature and Scenarios - Just mention their tags
		monochrome = true // to get the Console output in readable form,  it has 2 values true and false 
		)

public class run_Test {				

}
