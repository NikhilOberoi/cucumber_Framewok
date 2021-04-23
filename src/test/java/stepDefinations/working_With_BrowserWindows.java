package stepDefinations;

import cucumber.annotation.en.When;
import test.keywords;

public class working_With_BrowserWindows extends keywords {

	@When("open browse Window URL")
	public void openBrowserWindowURL() {
		get("https://demoqa.com/browser-windows");

	}
	
//	@When("open browse Window URL") // it will throw duplicate Step Defination Exception
//	public void openBrowserWindowURL1() {
//		get("https://demoqa.com/browser-windows");
//
//	}	
	
	@When("perform new window Actions")
	public void performBrowserWindowActions() throws Exception {
		click("windows_BrowserWindow.newwindow");
		switchToChildWindow();
		setSize(1200,1600);
		System.out.println(getText("windows_BrowserWindow.newwindowheading"));
	}
	@
	When("perform new window message Actions")
	public void performBrowserWindowMessageActions() throws Exception {
		switchToParentWindow();
		System.out.println("Here-------------------------");
		click("windows_BrowserWindow.newwindowmessage");
		switchToChildWindow();
		setSize(1200,1600);
		diverQuit();
//		System.out.println(getAttributeText("windows_BrowserWindow.newwindowmessagebody"));
	}
}
