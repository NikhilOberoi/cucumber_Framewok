package test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;
import Log4j.loggerHelper;
import org.apache.log4j.Logger;

import org.openqa.selenium.JavascriptExecutor;

import configure.configLoad;

public class keywords extends configLoad {
	public static final Logger log = loggerHelper.getLogger(keywords.class.getName());
	public static WebDriver driver;

	// Initializing WebDriver;
	public static void intializeDriver() throws IOException {
		log.info("Initializing Chrome Driver");
		configure.configLoad.loadProperties();
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + configure.configLoad.prop.getProperty("chromeDriver"));
		log.info("opening Browser");
		driver = new ChromeDriver();
		implicitWait();
		log.info("Maximize Window");
		driver.manage().window().maximize();

	}

	// Closing Current Window
	public static void driverClose() {
		driver.close();
		log.info("Driver Closed Successfully");
	}

	// Closing all Windows
	public static void diverQuit() {
		driver.quit();
	}

	// Minimize Current Window
	public void setSize(int dim1, int dim2) {
		log.info("Window setSize has been called");
		Dimension dm = new Dimension(dim1, dim2);
		driver.manage().window().setSize(dm);
		log.info("Window dimendions has ben set succesfully");
	}

	// move to Child Window
	public static void switchToChildWindow() {
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window" + parentWindow);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> I = windows.iterator();
		while (I.hasNext()) {
				String iWindow = I.next();
				if (!iWindow.equals(parentWindow)) {	
				System.out.println("Switch to child window: " + iWindow);
				driver.switchTo().window(iWindow);
			}
		}
	}

	// move to Parent Window
	public static void switchToParentWindow() {
		log.info("switchToParentWindow Start");
		Set<String> windows = driver.getWindowHandles();
		if (windows.size() == 1) {
			log.info("where size = 1: "+driver.getWindowHandles().toString());
			driver.switchTo().window(driver.getWindowHandles().toString().replace("[","").replace("]",""));
		}
//			else if(windows.size() > 1)
//			log.info("more than one window in switchToParentWindow method");
	}

	// click on an element
	protected static void click(String locator) throws Exception {
		getWebElement(locator).click();
	}

	// Submit and element
	public static void submit(String locator) throws Exception {
		getWebElement(locator).submit();
	}

	// send Keys
	public static void sendKeys(String locator, String key) throws Exception {
		getWebElement(locator).sendKeys(key);
	}

	// clear the input box
	public static void clear(String locator) throws Exception {
		getWebElement(locator).clear();
	}

	// get URL
	public static void get(String URL) {
		driver.get(URL);
	}

	// get Title
	public static String getTitle() {
		return driver.getTitle();
	}

	// get Page Source
	public static String getPageSource() {
		return driver.getPageSource();
	}

	// get current URL
	public static String getCurrentURL() {
		return driver.getCurrentUrl();
	}

	// get Text
	public static String getText(String locator) throws Exception {
		return getWebElement(locator).getText();
	}
	
	// get Attribute
	public static String getAttributeText(String locator) throws Exception {
		return getWebElement(locator).getAttribute("innerText");
	}
	

	// navigate the url
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void selectByVisibleText(String locator, String value) throws Exception {
		Select drpDwn = new Select(getWebElement(locator));
		drpDwn.selectByVisibleText(value);
	}

	public static void selectByIndext(String locator, int value) throws Exception {
		Select drpDwn = new Select(getWebElement(locator));
		drpDwn.selectByIndex(value);
	}

	// Javascript Click
	public static void jsClick(String locator) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", getWebElement(locator));
//		js.executeScript("alert('Element Clicked Successfully using JS');");
	}

	// Javascript sendKeys
	public static void jsSendKeys(String locator, String Value) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='b';", getWebElement(locator));

	}

	// move to Element
	public static void movetoElement(String locator) throws Exception {
		Actions a = new Actions(driver);
		a.moveToElement(getWebElement(locator)).build().perform();
	}

	// move to Element and Click
	public static void movetoElementAndClick(String locator) throws Exception {
		Actions a = new Actions(driver);
		a.moveToElement(getWebElement(locator)).click().build().perform();
	}

	// double Click on button
	public static void doubleClick(String locator) throws Exception {
		Actions a = new Actions(driver);
		a.doubleClick(getWebElement(locator)).perform();
	}

	// right Click OR Context Click
	public static void contextClick(String locator) throws Exception {
		Actions a = new Actions(driver);
		a.contextClick(getWebElement(locator)).perform();
	}

	// drag and Drop
	public static void dragAndDrop(String source, String target) throws Exception {
		Actions a = new Actions(driver);
		a.dragAndDrop(getWebElement(source), getWebElement(target)).perform();
	}

	// drag and drop by off sets
	public static void dragAndDropBy(String locator, int xOffset, int yOffset) throws Exception {
		Actions a = new Actions(driver);
		a.dragAndDropBy(getWebElement(locator), xOffset, yOffset).perform();
	}

	// move to Frame by WebElement
	public static void switchToFrame(String locator) throws Exception {
		driver.switchTo().frame(getWebElement(locator));
	}

	// move to Frame by Frame_by_Index
	public static void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	// move to default Content of Frame
	public static void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	// move to Parent Frame
	public static void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}

	// move to Alert
	public static void switchToAlert() {
		driver.switchTo().alert();
	}

	// accept Alert
	public static void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	// dismiss Alert
	public static void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	// get Alert text
	public static String getAlertText() {
		return driver.switchTo().alert().getText();
	}

	// send Keys to Alert Box
	public static void sendKeysToAlert(String keys) {
		driver.switchTo().alert().sendKeys(keys);
	}

	// wait till alert will present
	public static void waitTillAlertPresent() {
		long wait_time = (long) (Integer.parseInt((prop.getProperty("explicitWait"))));
		WebDriverWait driverWait = new WebDriverWait(driver, wait_time);
		driverWait.until(ExpectedConditions.alertIsPresent());
	}

	// explicit wait till element to be clickable
	public static void waitTillElementBeClickable(String locator) throws Exception {
		long wait_time = (long) (Integer.parseInt((prop.getProperty("explicitWait"))));
		WebDriverWait driverWait = new WebDriverWait(driver, wait_time);
		driverWait.until(ExpectedConditions.elementToBeClickable(getWebElement(locator)));
	}

	// explicit wait visibility of an element
	public static void explicitWait(String locator) throws Exception {
		long wait_time = (long) (Integer.parseInt((prop.getProperty("explicitWait"))));
		WebDriverWait wait = new WebDriverWait(driver, wait_time);
		wait.until(ExpectedConditions.visibilityOf(getWebElement(locator)));
	}

	// implicit wait
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// Expected Conditions
	public void expectedCondition(String locator) throws Exception {
		long wait_time = (long) (Integer.parseInt((prop.getProperty("explicitWait"))));
		WebDriverWait wait = new WebDriverWait(driver, wait_time);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(getWebElement(locator)));
	}

	// get the WebElement based on its locator
	public static WebElement getWebElement(String locator) throws Exception {
		log.info("Keyword to call :" + locator);
		load_repo_Properties();
		return getlocator(repository_Prop.getProperty(locator));
	}

	// Retrieving Web Element
	public static WebElement getlocator(String locator) throws Exception {
		log.info("get locator called");
		String[] split = locator.split(":", 2);
		String locator_name = split[0];
		String locator_path = split[1];
		log.info("Accessing Locator type : " + locator_name + " having Path: " + locator_path);
		if (locator_name.toLowerCase().equals("xpath"))
			return driver.findElement(By.xpath(locator_path));
		else if (locator_name.toLowerCase().equals("name"))
			return driver.findElement(By.name(locator_path));
		else if (locator_name.toLowerCase().equals("id"))
			return driver.findElement(By.id(locator_path));
		else if (locator_name.toLowerCase().equals("classnamae"))
			return driver.findElement(By.className(locator_path));
		else if (locator_name.toLowerCase().equals("linktext"))
			return driver.findElement(By.linkText(locator_path));
		else if (locator_name.toLowerCase().equals("cssselector"))
			return driver.findElement(By.cssSelector(locator_path));
		else if (locator_name.toLowerCase().equals("tagname"))
			return driver.findElement(By.tagName(locator_path));
		else if (locator_name.toLowerCase().equals("partiallinktext"))
			return driver.findElement(By.partialLinkText(locator_path));
		else
			log.error("Invalid Locator Type");
		throw new Exception("unknown Location Type " + locator_name);
	}

	// get the WebElements List based on its locator
	public static List<WebElement> getWebElements(String locator) throws Exception {
		log.info("Keyword to call :" + locator);
		load_repo_Properties();
		return getlocators(repository_Prop.getProperty(locator));
	}

	// Retrieving Web Elements as Java List
	public static List<WebElement> getlocators(String locator) throws Exception {
		String[] split = locator.split(":", 2);
		String locator_name = split[0];
		String locator_path = split[1];

		if (locator_name.toLowerCase().equals("xpath"))
			return driver.findElements(By.xpath(locator_path));
		else if (locator_name.toLowerCase().equals("name"))
			return driver.findElements(By.name(locator_path));
		else if (locator_name.toLowerCase().equals("id"))
			return driver.findElements(By.id(locator_path));
		else if (locator_name.toLowerCase().equals("classnamae"))
			return driver.findElements(By.className(locator_path));
		else if (locator_name.toLowerCase().equals("linktext"))
			return driver.findElements(By.linkText(locator_path));
		else if (locator_name.toLowerCase().equals("cssselector"))
			return driver.findElements(By.cssSelector(locator_path));
		else if (locator_name.toLowerCase().equals("tagname"))
			return driver.findElements(By.tagName(locator_path));
		else if (locator_name.toLowerCase().equals("partiallinktext"))
			return driver.findElements(By.partialLinkText(locator_path));
		else
			throw new Exception("unknown Location Type " + locator_name);
	}

}
