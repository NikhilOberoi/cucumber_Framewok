package stepDefinations;

import test.keywords;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebElement;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class working_with_widgets extends keywords {

	@When("Open to accordian in Widget")
	public void navigate_To_Widgets() {
		get("https://demoqa.com/accordian");
	}

	@When("Click all the Accordian")
	public void accordian() throws Exception {
		System.out.println("Before wait");
		jsClick("widget.accordianheadding2");
		// jsClick("widget.accordianheadding1");
		// jsClick("widget.accordianheadding3");
	}

	@When("Navigate to Autocomplete")
	public static void autocomplete() throws Exception {
		navigateTo("https://demoqa.com/auto-complete");
		click("widget.autotextbox");
		Thread.sleep(1000);
		explicitWait("widget.autotextbox");
		System.out.println("Finish Wait");
		sendKeys("widget.autotextbox1", "a");
		Thread.sleep(2000);

		// sendKeys("widget.autotextbox", "a");
		System.out.println("type Complete");
		explicitWait("widget.autocompletemenu");
		System.out.println(driver.getPageSource());
		ArrayList<WebElement> WE = new ArrayList(getWebElements("widget.autocompletemenu"));
		System.out.println(WE.size());

		
		for (int i = 0; i < WE.size(); i++) {
			try{
			WebElement element = WE.get(i);
			String elementText = element.getAttribute("innerText");
			System.out.println("Suggention is :" + elementText);
			if (elementText.toLowerCase().equals("black")) {
				element.click();
				System.out.println(element.getText() + "is Clicked");
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		}
		
	}

	@When("Working with date and time")
	public static void dateandtime() throws Exception {
		navigateTo("https://demoqa.com/date-picker");
		click("widget.selectdate");
		selectByVisibleText("widget.selectdate_selectmonth", "May");
		selectByVisibleText("widget.selectdate_selectyear", "1994");
		click("widget.selectdate_selectdate");

		// click("widget.dateandtime");
		click("widget.dateandtime");
		click("widget.dateandtime_selectmonth");
		click("widget.dateandtime_selectmonth_jan");
		click("widget.dateandtime_selectdate");
		click("widget.selecttime");

	}

}
