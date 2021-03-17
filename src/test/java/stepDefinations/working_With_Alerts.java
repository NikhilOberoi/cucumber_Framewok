package stepDefinations;

import cucumber.annotation.en.When;
import test.keywords;

public class working_With_Alerts extends keywords {

	@When("Navigate to ToolsQA Alerts")
	public void navigate() {
		driver.get("https://demoqa.com/alerts");
	}

	@When("Click on Alerts")
	public void alert_click() throws Exception {

		System.out.println("Alert Pop-up");
		click("alert.alert");
		acceptAlert();

		System.out.println("Accept Alert Appear after 5");
		click("alert.timealert");
		waitTillAlertPresent();
		dismissAlert();

		System.out.println("Alert Confirm Box Dismiss");
		click("alert.confirmalert");
		dismissAlert();

		System.out.println("Alert Confirm Box Accept");
		click("alert.confirmalert");
		acceptAlert();

		System.out.println("Input Box Alert Box Accept");
		click("alert.promptalert");
		sendKeysToAlert("This is to enter the Text");
		sendKeysToAlert("Enter More text");
		acceptAlert();

		System.out.println("Input Box Alert Box Dismiss");
		click("alert.promptalert");
		sendKeysToAlert("This is to enter the Text");
		sendKeysToAlert("Enter More text");
		dismissAlert();
	}

}
