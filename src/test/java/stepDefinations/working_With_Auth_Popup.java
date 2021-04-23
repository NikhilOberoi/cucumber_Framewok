package stepDefinations;

import test.keywords;
import cucumber.annotation.en.When;

public class working_With_Auth_Popup extends keywords {

	@When("^Open Basic Auth URL$")
	public void openURL() {
		get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

	@When("validate Title")
	public void moveToAuthPopup() {
		System.out.println(getTitle());
	}
}
