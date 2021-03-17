package stepDefinations;

import test.keywords;
import cucumber.annotation.en.When;
import cucumber.annotation.en.Then;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;

import cucumber.annotation.en.Given;

public class working_With_Elements extends keywords {
	
	@Given("Open Tools QA Checkbox Screen")
	public static void checkbox_toolsQA() throws IOException{
		get("https://demoqa.com/checkbox");
	}
	
	@When("Click on Checkbox")
	public static void click_CheckBox() throws Exception{
		click("elements.checkbox");
	}
	
	@When("Navigate to radio Button")
	public static void navigateToRadio(){
		navigateTo("https://demoqa.com/radio-button");
	}
	@When("work with Radios")
	public static void workWithRadios() throws Exception{
		click("elements.yesradio");
		System.out.println("About to select No-Radio");
		if(getWebElement("elements.noradio").isSelected())
		click("elements.noradio");
		else
			System.out.println("Element is not Selected");
	}
	@When("Navigate to Web Tables")
	public static void navigateToWebTables(){
		navigateTo("https://demoqa.com/webtables");
	}
	@When("Get Table Headder")
	public static void tableHeadder() throws Exception{
		ArrayList<WebElement> table_Headrer = new ArrayList(getWebElements("elements.tableheadder"));
		for(int i=0;i<table_Headrer.size();i++){
			System.out.println("Headders Are : "+table_Headrer.get(i).getText());
		}
		ArrayList<WebElement> tableRowData = new ArrayList(getWebElements("elements.tablerowdata"));
		for(int j=0;j<tableRowData.size();j++){
			if(tableRowData.get(j).getText().equals(" "))
			System.out.println("");	
			else
			System.out.println("Row Data is: "+tableRowData.get(j).getText());
		}		
	}
	@When("Navigate to Buttons")
	public static void navigateToButtons() throws Exception{
		navigateTo("https://demoqa.com/buttons");
		doubleClick("elements.doubleClickButton");
		contextClick("elements.rightClickbtn1");
		click("elements.clickme");
	}
	@When("Navigate to Upload and Download")
	public static void navigateToUploadDownload() throws Exception{
		navigateTo("https://demoqa.com/upload-download");
		sendKeys("elements.upload", "D:\\HelloWorld.java");
	}
	@When("Navigate to Window Handles")
	public static void navigateToWindowHandles() throws Exception{
		navigateTo("https://demoqa.com/browser-windows");
		click("elements.tabbtn");
		switchToChildWindow();
//		getText("elements.newtabheadng");
		System.out.println("New Tab Text is: "+getText("elements.newtabheadng"));
		switchToChildWindow();
	}
	@When("Navigate to Drag and Drop")
	public static void dragAnfdDrop() throws Exception{
		navigateTo("https://demoqa.com/droppable");
		dragAndDrop("interactions.dragable","interactions.droppable");
	}
	@When("Navigate to Draggable")
	public static void draggable() throws Exception{
		navigateTo("https://demoqa.com/dragabble");
		dragAndDropBy("interactions.dragbox", 150, 60);
	}
	@When("Navigate to Resizable")
	public static void resizable() throws Exception{
		navigateTo("https://demoqa.com/resizable");
		dragAndDropBy("interactions.resize", 200, 3000);
	}
}

