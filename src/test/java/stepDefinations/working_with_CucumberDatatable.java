package stepDefinations;

import java.util.List;

import cucumber.annotation.en.When;
import cucumber.table.DataTable;
import test.keywords;

public class working_with_CucumberDatatable extends keywords {

	@When("^I am on Facebook registrataion page$")
	public void registrationPage() throws Exception {
		get("https://www.facebook.com/");
		click("facebook.createNewBtn");

	}

	@When("^registeration with invalid user details$")
	public void fillForm_dataTable(DataTable table) throws Exception {
		// Initialize Data Table
		List<List<String>> data = table.raw();
		sendKeys("facebook.fname", data.get(1).get(1));
		sendKeys("facebook.lname", data.get(2).get(2));//this will send blank
		sendKeys("facebook.email", data.get(3).get(2));// this will get the value from Values2
	}
}