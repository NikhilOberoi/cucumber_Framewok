package stepDefinations;

import java.io.IOException;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;
import cucumber.annotation.en.Then;

import static org.junit.Assert.*;
import test.keywords;

public class amazon_Login extends keywords {

	// public static WebDriver = driver();
	@Given("Intialize Driver")
	public void intialize() throws IOException {
		intializeDriver();
	}

	@When("Navigate to Amazon")
	public void navigate() {
		driver.get("https://www.amazon.in/");
	}

	@When("Signin to Amazon")
	public void signinAmzn() throws Exception {
		getWebElement("signin.button").click();
		// getWebElement("signin.addAccount").click();
		getWebElement("signin.email").sendKeys("nikhiloberoi143@gmail.com");
		getWebElement("signin.continuebtn").click();
		getWebElement("signin.password").sendKeys("Nikhil999");
		getWebElement("signin.signinbtn").click();
	}

	@Then("Validate Title")
	public void validate() {
//		 assertEquals("Amazon Sign In",getTitle());
		System.out.println("Title : " + getTitle());
//		System.out.println("Page Source : "+getPageSource());
		System.out.println("Get Current URL :"+getCurrentURL());
	}

	@Then("Sign Out from Amazon")
	public void signOut() throws Exception {
		explicitWait("signin.button");
		movetoElement("signin.button");
		getWebElement("signout.signoutbtn").click();
	}

	@Then("Close the Browser")
	public void closeBrowser() {
		driverClose();
	}

}
