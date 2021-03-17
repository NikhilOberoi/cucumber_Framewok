package stepDefinations;

import java.io.IOException;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;
import test.keywords;

public class working_with_frames extends keywords {

	@When("Navigate to ToolsQA")
	public void navigate() {
		driver.get("https://demoqa.com/frames");
	}

	@When("Navigate to Frame Section")
	public void navigatetoFrames() throws Exception {
		submit("frames.frames");
	}

	@When("Move to Frame and get text")
	public void movetoFrame() throws Exception {
		System.out.println("Method - movetoFrame Called");
		switchToFrame("frame.locator1");
		String framehead = getText("frame.heading");
		System.out.println("Frame Headding :" + framehead);
		switchToDefaultContent();
		switchToFrame("frame.locator2");
		System.out.println("Switched to Frame 2 Successfully");
		framehead = getText("frame.heading");
		System.out.println("Frame Headding 2:" + framehead);
	}

	@When("Navigate to Nested Frame Section")
	public void workingWithNestedFrames() throws Exception {
		
		System.out.println("to access parent frame");
		switchToFrame("frame.parentframe");
//		System.out.println("Parent Frame text :" + getWebElement("frame.parentText"));		
		System.out.println("to access child frame");
		
		switchToFrame("frame.childframe");
		System.out.println("get child text :" + getText("frame.childText"));
		
		System.out.println("move back to Parent Frame");
		switchToParentFrame();
		System.out.println("get Parent Frame text");
		System.out.println("Parent Frame text :" + getText("frame.parentText"));

	}

	@When("Navigate to ToolsQA Nested Frames")
	public void navigateToNestedFrames() {
		driver.get("https://demoqa.com/nestedframes");
	}

}
