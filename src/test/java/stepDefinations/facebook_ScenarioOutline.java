package stepDefinations;

import org.openqa.selenium.By;
import java.io.IOException;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import test.keywords;

public class facebook_ScenarioOutline extends keywords {

//	public static WebDriver driver;

	@Given("I have open the browser")
	public void openBrowser() throws IOException {
		intializeDriver();
	}

	@When("I Open Facebook Site")
	public void navigateToFB() {
		driver.navigate().to("https://www.facebook.com/");
	}

	@When("^Enter Username (.*) and Password (.*)$")
	public void userLogin(String uname, String upassword) throws Exception {
		test.keywords.getWebElement("homepage.id").sendKeys(uname);
		test.keywords.getWebElement("homepage.pass").sendKeys(upassword);
	}

	@Then("Login button Should Exsist")
	public void login() {
		if (driver.findElement(By.id("email")).isDisplayed())
			System.out.println("Email Field Exsist");
		else
			System.out.println("Emaial field not exsist");
	}

	@Then("Click on Signin button")
	public void signin() {
		driver.findElement(By.id("u_0_h")).click();
	}

//	@Then("Close the Browser")
//	public void closeBrowser() {
//		driver.close();
//	}

	@Then("Take Screen Shot")
	public void screenShot() throws IOException {
		screenshot.screenShot.takeScreenshot(driver);
	}

}
